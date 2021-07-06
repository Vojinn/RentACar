/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.component.table.model;

import domain.StavkaIznajmljivanja;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vojin
 */
public class StavkeIznajmljivanjaTableModel extends AbstractTableModel{
    
    private  List<StavkaIznajmljivanja> stavke;
    
    private final String[] naziviKolona = {"Marka","Model","StavkaID","Na dan","Popust","Ukupno"};
    private int id = 0;

    public StavkeIznajmljivanjaTableModel(List<StavkaIznajmljivanja> stavke) {
        this.stavke = stavke;
        fireTableDataChanged();
    }

    public ArrayList<StavkaIznajmljivanja> getStavke() {
        return (ArrayList<StavkaIznajmljivanja>) stavke;
    }

    

    public void setStavke(List<StavkaIznajmljivanja> stavke) {
        this.stavke = stavke;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        if(stavke == null){
            return 0;
        }
        return stavke.size();
    }

    @Override
    public int getColumnCount() {
        return naziviKolona.length;
    }

    @Override
    public Object getValueAt(int red, int kolona) {
        StavkaIznajmljivanja si = stavke.get(red);
        
        switch(kolona){
            case 0:
                return si.getStavkaId();
            case 1:
                return si.getAutomobil().getModel();
            case 2:
                return si.getAutomobil().getMarka();
            case 3: 
                return si.getVrednostStavke();
            case 4: 
                return 100 * si.getPopust() + "%";
            case 5: 
                return Math.round(si.getCenaAutomobila()*100)/100;
            default: 
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int kolona) {
        return naziviKolona[kolona];
    }

    public StavkaIznajmljivanja getStavka(int i) {
        return stavke.get(i);
    }

    public void dodajStavku(StavkaIznajmljivanja si) {
        si.setStavkaId(++id);
        stavke.add(si);
        fireTableDataChanged();
    }

    public double vratiUkupnuVrednost() {
        double ukupno = 0;
        for (StavkaIznajmljivanja si : stavke) {
            ukupno += si.getCenaAutomobila();
        }
        return ukupno;
    }
    
    
    
}
