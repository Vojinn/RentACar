/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.Klijent;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vojin
 */
public class KlijentiTableModel extends AbstractTableModel{
    
    private List<Klijent> klijenti;
    
    private final String[] naziviKolona = {"JMBG","Ime","Prezime","Adresa","Broj telefona","Banka"};
    
    public KlijentiTableModel(List<Klijent> klijenti){
        this.klijenti = klijenti;
    }
    
    public void setKlijenti(List<Klijent> klijenti){
        this.klijenti = klijenti;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if(klijenti == null){
            return 0;
        }
        return klijenti.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int red, int kolona) {
        
        Klijent k = klijenti.get(red);
        
        switch(kolona){
            case 0: 
                return k.getJmbg();
            case 1: 
                return k.getIme();
            case 2: 
                return k.getPrezime();
            case 3: 
                return k.getAdresa();
            case 4: 
                return k.getBrojTelefona();
            case 5: 
                return k.getBanka().getNazivBanke();
            default: 
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int kolona) {
        return naziviKolona[kolona];
    }
    
    public Klijent getKlijent(int i){
        return klijenti.get(i);
    }
    
}
