/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.Automobil;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vojin
 */
public class AutomobilTableModel extends AbstractTableModel{
    
    private List<Automobil> automobili;
    
    private final String[] naziviKolona = {"Registarski Broj","Marka","Model","Godište","Broj vrata","Gorivo","Cena na dan","Raspoloziv"};
    
    public AutomobilTableModel(List<Automobil> automobili){
        this.automobili = automobili;
    }

    public void setAutomobili(List<Automobil> automobili) {
        this.automobili = automobili;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if(automobili == null)
            return 0;
        return automobili.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        if(i == 7)
            return Boolean.class;
        return super.getColumnClass(i); 
    }
    
    

    @Override
    public Object getValueAt(int red, int kolona) {
        
        Automobil a = automobili.get(red);
        switch(kolona){
            case 0: 
                return a.getRegistarskiBroj();
            case 1: 
                return a.getMarka();
            case 2: 
                return a.getModel();
            case 3: 
                return a.getGodinaProizvodnje();
            case 4: 
                return a.getBrojVrata();
            case 5: 
                return a.getGorivo();
            case 6: 
                return a.getCenaNaDan();
            case 7: 
                return a.isRaspoloziv();
            default:
                return "n/a";
        }
    }
    
    @Override
    public String getColumnName(int kolona) {
        return naziviKolona[kolona];
    }
    
    public Automobil getAutomobil(int i){
        return automobili.get(i);
    }

    public void obrisiAutomobil(Automobil a) {
        for (Automobil automobil : automobili) {
            if(automobil.getAutomobilId() == a.getAutomobilId()){
                automobili.remove(automobil);
                break;
            }  
        }
        fireTableDataChanged();
    }

    public void prikaziSamoRaspolozive() {
        for (Automobil automobil : automobili) {
            if(automobil.isRaspoloziv() == false){
                automobili.remove(automobil);
            }
        }
        fireTableDataChanged();
    }

    public void izmeniRaspolozivost(Automobil a) {
        for (Automobil aut : automobili) {
            if(aut.getAutomobilId() == a.getAutomobilId()){
                aut.setRaspoloziv(false);
                break;
            }
        }
        fireTableDataChanged();
    }

    
}
