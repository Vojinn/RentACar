/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import controller.Controller;
import domain.Iznajmljivanje;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ui.component.table.model.IznajmljivanjaTableModel;
import ui.form.FRazduzivanje;

/**
 *
 * @author Vojin
 */
public class nitIznajmljeniAutomobili extends Thread{
    
    private IznajmljivanjaTableModel model;
    JCheckBox klijentovId;
    JCheckBox iznajmljivanjeId;
    JTextField k;
    JTextField iid;
    FRazduzivanje forma;

    public nitIznajmljeniAutomobili() {
    }

    public nitIznajmljeniAutomobili(IznajmljivanjaTableModel model, JCheckBox klijentovId, JCheckBox iznajmljivanjeId, JTextField k, JTextField iid, FRazduzivanje forma) {
        this.model = model;
        this.klijentovId = klijentovId;
        this.iznajmljivanjeId = iznajmljivanjeId;
        this.k = k;
        this.iid = iid;
        this.forma = forma;
    }

    @Override
    public void run() {
        while(isAlive()){
            try{
                sleep(4000);
                Iznajmljivanje i = new Iznajmljivanje(0, 0, null, null, null, 0, null);
                if(klijentovId.isSelected() && !k.getText().isEmpty()){
                    try{
                        i.setKlijentId(Integer.parseInt(k.getText()));
                    }catch(NumberFormatException ex){
                        throw new NumberFormatException("Unesite klijentov ID.");
                    }
                }
                if(iznajmljivanjeId.isSelected() && !iid.getText().isEmpty()){
                    try{
                        i.setIznajmljivanjeId(Integer.parseInt(iid.getText()));
                    }catch(NumberFormatException ex){
                        throw new NumberFormatException("Unesite broj iznajmljivanja.");
                    }
                }
                model.setIznajmljivanja(Controller.getInstance().vratiIznajmljivanja(i)); 
            }catch(Exception ex){
                JOptionPane.showMessageDialog(forma, ex.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    
    
}
