/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import controller.Controller;
import domain.Automobil;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ui.component.table.model.AutomobilTableModel;
import ui.form.FPretragaAutomobila;

/**
 *
 * @author Vojin
 */
public class nitAutomobil extends Thread{
    
    AutomobilTableModel model;
    JCheckBox marka;
    JCheckBox gorivo;
    JTextField m;
    JTextField g;
    FPretragaAutomobila forma;

    public nitAutomobil() {
    }

    public nitAutomobil(AutomobilTableModel model, JCheckBox marka, JCheckBox gorivo, JTextField m, JTextField g, FPretragaAutomobila forma) {
        this.model = model;
        this.marka = marka;
        this.gorivo = gorivo;
        this.m = m;
        this.g = g;
        this.forma = forma;
    }

    @Override
    public void run() {
        
        while(isAlive()){
            try{
                sleep(3000);
                Automobil a = new Automobil(1, null, null, null, 0, 0, null, 0, true);
                if(marka.isSelected()){
                    a.setMarka(m.getText());
                }
                if(gorivo.isSelected()){
                    a.setGorivo(g.getText());
                }
                model.setAutomobili(Controller.getInstance().vratiAutomobile(a));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(forma, ex.getMessage(),"Greska",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
}
