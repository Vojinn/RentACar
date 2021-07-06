/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.Iznajmljivanje;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vojin
 */
public class IznajmljivanjaTableModel extends AbstractTableModel{
    
    private List<Iznajmljivanje> iznajmljivanja;
    
    private final String[] naziviKolona = {"Klijent ID","Iznajmljivanje ID","Datum zaduženja","Datum razduženja"};
    
    public IznajmljivanjaTableModel(List<Iznajmljivanje> iznajmljivanja){
        this.iznajmljivanja = iznajmljivanja;
    }

    public void setIznajmljivanja(List<Iznajmljivanje> iznajmljivanja) throws Exception {
        if(iznajmljivanja.isEmpty())
            throw new Exception("Lista je prazna. Ne moze se ucitati.");
        this.iznajmljivanja = iznajmljivanja;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if(iznajmljivanja == null)
            return 0;
        return iznajmljivanja.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }
    
    @Override
    public Object getValueAt(int red, int kolona) {
        
        Iznajmljivanje i = iznajmljivanja.get(red);
        
        switch(kolona){
            case 0: 
                return i.getKlijentId();
            case 1: 
                return i.getIznajmljivanjeId();
            case 2:
                return i.getDatumOd();
            case 3: 
                return i.getDatumDo();
            default:
                return "n/a";
        }
    }
    
    @Override
    public String getColumnName(int kolona) {
        return naziviKolona[kolona];
    }

    public Iznajmljivanje getIznajmljivanje(int red) {
        return iznajmljivanja.get(red);
    }
}
