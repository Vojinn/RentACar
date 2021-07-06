/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import controller.Controller;
import domain.Klijent;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ui.component.table.model.KlijentiTableModel;
import ui.form.FPretragaKlijenata;

/**
 *
 * @author Vojin
 */
public class nitKlijent extends Thread{
    
    KlijentiTableModel model;
    JCheckBox ime;
    JCheckBox prezime;
    JTextField i;
    JTextField p;
    FPretragaKlijenata forma;
    
    public nitKlijent(){
    }

    public nitKlijent(KlijentiTableModel model, JCheckBox ime, JCheckBox prezime, JTextField i, JTextField p, FPretragaKlijenata forma) {
        this.model = model;
        this.ime = ime;
        this.prezime = prezime;
        this.i = i;
        this.p = p;
        this.forma = forma;
    }

    @Override
    public void run() {
        
        while(isAlive()){
            try {
                sleep(3000);
                Klijent k = new Klijent(1, null, null, null, null, null, null);
                if(ime.isSelected()){
                    k.setIme(i.getText());
                }
                if(prezime.isSelected()){
                    k.setPrezime(p.getText());
                }
                model.setKlijenti(Controller.getInstance().vratiKlijente(k));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(forma, ex.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
            }
        }
            
    }
    
    
}
