/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vojin
 */
public class Banka implements IOpstiObjekat{
    
    private int bankaId;
    private String nazivBanke;

    public Banka() {
    }

    public Banka(int bankaId, String nazivBanke) {
        this.bankaId = bankaId;
        this.nazivBanke = nazivBanke;
    }

    

    public String getNazivBanke() {
        return nazivBanke;
    }

    public void setNazivBanke(String nazivBanke) {
        this.nazivBanke = nazivBanke;
    }

    public int getBankaId() {
        return bankaId;
    }

    public void setBankaId(int bankaId) {
        this.bankaId = bankaId;
    }

    @Override
    public String toString() {
        return nazivBanke;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " * ";
    }

    @Override
    public String getNazivTabele() {
        return " banka ";
    }

    @Override
    public String joinUslov() {
        return "";
    }

    @Override
    public String getWhereUslov() {
        return "";
    }

    @Override
    public String getOrderByUslov() {
        return " ORDER BY NazivBanke ASC";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public IOpstiObjekat napuniObjekat(ResultSet resultSet, Object lista) {
        Banka b = new Banka();
        
        try{
            b.setBankaId(resultSet.getInt(1));
            b.setNazivBanke(resultSet.getString(2));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return b;
    }

    @Override
    public String getNazivTabeleAsocijacije() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVrednostiZaUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWhereUpdateUslov() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVrednostiZaInsertAsocijacije() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVrednostiZaUpdateStatusa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVrednostZaRazduzivanje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
