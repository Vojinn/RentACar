/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vojin
 */
public class Iznajmljivanje implements IOpstiObjekat{
    
    private int klijentId;
    private int iznajmljivanjeId;
    private Date datumOd;
    private Date datumDo;
    private String napomena;
    private double ukupno;
    private ArrayList<StavkaIznajmljivanja> stavkeIznajmljivanja;

    public Iznajmljivanje() {
    }

    public Iznajmljivanje(int klijentId, int iznajmljivanjeId, Date datumOd, Date datumDo, String napomena, double ukupno, ArrayList<StavkaIznajmljivanja> stavkeIznajmljivanja) {
        this.klijentId = klijentId;
        this.iznajmljivanjeId = iznajmljivanjeId;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.napomena = napomena;
        this.ukupno = ukupno;
        this.stavkeIznajmljivanja = stavkeIznajmljivanja;
    }

    

    public ArrayList<StavkaIznajmljivanja> getStavkeIznajmljivanja() {
        return stavkeIznajmljivanja;
    }

    public void setStavkeIznajmljivanja(ArrayList<StavkaIznajmljivanja> stavkeIznajmljivanja) {
        this.stavkeIznajmljivanja = stavkeIznajmljivanja;
    }

    public int getIznajmljivanjeId() {
        return iznajmljivanjeId;
    }

    public void setIznajmljivanjeId(int iznajmljivanjeId) {
        this.iznajmljivanjeId = iznajmljivanjeId;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public double getUkupno() {
        return ukupno;
    }

    public void setUkupno(double ukupno) {
        this.ukupno = ukupno;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " * ";
    }

    @Override
    public String getNazivTabele() {
        return " iznajmljivanje ";
    }

    @Override
    public String joinUslov() {
        return "";
    }

    @Override
    public String getWhereUslov() {
          if(klijentId != 0){
            if(iznajmljivanjeId != 0){
                return " WHERE KlijentID LIKE '" + klijentId + "%' AND IznajmljivanjeID LIKE '" + iznajmljivanjeId + "%' AND Napomena LIKE 'Iznajmljeno'";
            } else {
                return " WHERE KlijentID LIKE '"+ klijentId + "%' AND Napomena LIKE 'Iznajmljeno'";
            }
        }else {
            if(iznajmljivanjeId != 0){
                return " WHERE IznajmljivanjeID LIKE '" + iznajmljivanjeId + "%' AND Napomena LIKE 'Iznajmljeno'";
            }else {
                return " WHERE Napomena LIKE 'Iznajmljeno'";
            }
        }
    }

    @Override
    public String getOrderByUslov() {
        return "";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public IOpstiObjekat napuniObjekat(ResultSet rs, Object lista) {
        Iznajmljivanje i = new Iznajmljivanje();
        
        try{
            i.setIznajmljivanjeId(rs.getInt(1));
            i.setKlijentId(rs.getInt(2));
            i.setDatumOd(rs.getDate(3));
            i.setDatumDo(rs.getDate(4));
            i.setNapomena(rs.getString(5));
            i.setUkupno(rs.getDouble(6));
            i.setStavkeIznajmljivanja(null);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    @Override
    public String getNazivTabeleAsocijacije() {
        return " iznajmljivanje ";
    }

    @Override
    public String joinUslovAsocijacije() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWhereUslovAsocijacije() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNaziviKolonaZaSelectAsocijacije() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object napuniObjekatAsocijacije(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSifra(int id) {
        iznajmljivanjeId = id;
    }

    @Override
    public String getVrednostiZaUpdate() {
        return " KlijentID = " +klijentId + ", DatumOd = '" + new java.sql.Date(datumOd.getTime()) + "', DatumDo = "
                + "'" + new java.sql.Date(datumDo.getTime()) + "', Napomena = '" + napomena + "', Ukupno = " +ukupno;
    }

    @Override
    public String getWhereUpdateUslov() {
        return "IznajmljivanjeID = " +iznajmljivanjeId;
    }

    public int getKlijentId() {
        return klijentId;
    }

    public void setKlijentId(int klijentId) {
        this.klijentId = klijentId;
    }

    @Override
    public String getVrednostiZaUpdateRaspolozivosti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWhereUpdateRaspolozivostUslov() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNaziviKolonaZaInsertAsocijacije() {
        return " KlijentID, DatumOd, DatumDo, Napomena, Ukupno ";
    }

    @Override
    public String getVrednostiZaInsertAsocijacije() {
        return klijentId + ", '" + new java.sql.Date(datumOd.getTime()) + "', "
                + "'" + new java.sql.Date(datumDo.getTime()) + "', '" + napomena + "', " +ukupno;
    }

    @Override
    public String getVrednostiZaUpdateStatusa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVrednostZaRazduzivanje() {
         return " Napomena = '" + napomena + "' ";
    }

    
    
    
    
}
