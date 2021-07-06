/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vojin
 */
public class Automobil implements IOpstiObjekat{
    
    private int automobilId;
    private String registarskiBroj;
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private int brojVrata;
    private String gorivo;
    private int cenaNaDan;
    private boolean raspoloziv;

    public Automobil() {
    }

    public Automobil(int automobilId, String registarskiBroj, String marka, String model, int godinaProizvodnje, int brojVrata, String gorivo, int cenaNaDan, boolean raspoloziv) {
        this.automobilId = automobilId;
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojVrata = brojVrata;
        this.gorivo = gorivo;
        this.cenaNaDan = cenaNaDan;
        this.raspoloziv = raspoloziv;
    }
    
    public boolean isRaspoloziv() {
        return raspoloziv;
    }

    public void setRaspoloziv(boolean raspoloziv) {
        this.raspoloziv = raspoloziv;
    }

    public int getAutomobilId() {
        return automobilId;
    }

    public void setAutomobilId(int automobilId) {
        this.automobilId = automobilId;
    }

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public int getCenaNaDan() {
        return cenaNaDan;
    }

    public void setCenaNaDan(int cenaNaDan) {
        this.cenaNaDan = cenaNaDan;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " automobil.AutomobilID, automobil.RegistarskiBroj, automobil.Marka, automobil.Model, automobil.GodinaProizvodnje, "
                + "automobil.BrojVrata,automobil.Gorivo,automobil.CenaNaDan,automobil.Raspoloziv ";
    }

    @Override
    public String getNazivTabele() {
        return " automobil ";
    }

    @Override
    public String joinUslov() {
        return "";
    }

    @Override
    public String getWhereUslov() {
        if(marka != null){
            if(gorivo != null){
                return " WHERE Marka LIKE '" + marka + "%' AND Gorivo LIKE '" + gorivo + "%'";
            } else {
                return " WHERE Marka LIKE '" + marka + "%'";
            }
        } else {
            if(gorivo != null){
                return " WHERE Gorivo LIKE '" + gorivo + "%'";
            } else {
                return "";
            }
        }
    }

    @Override
    public String getOrderByUslov() {
        return " ORDER BY MARKA";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public Automobil napuniObjekat(ResultSet rs, Object lista) {
        Automobil a = new Automobil();
        try{
            a.setAutomobilId(rs.getInt(1));
            a.setRegistarskiBroj(rs.getString(2));
            a.setMarka(rs.getString(3));
            a.setModel(rs.getString(4));
            a.setGodinaProizvodnje(rs.getInt(5));
            a.setBrojVrata(rs.getInt(6));
            a.setGorivo(rs.getString(7));
            a.setCenaNaDan(rs.getInt(8));
            a.setRaspoloziv(rs.getBoolean(9));
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
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
        automobilId = id;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    @Override
    public String getVrednostiZaUpdate() {
        return " RegistarskiBroj = '" + registarskiBroj + "', Marka = '" + marka + "', Model = '" + model + "', "
                + "GodinaProizvodnje = " + godinaProizvodnje + ", BrojVrata = " + brojVrata + ", Gorivo = '" + gorivo + "', "
                + "CenaNaDan = " + cenaNaDan + ", Raspoloziv = " + raspoloziv;
    }

    @Override
    public String getWhereUpdateUslov() {
        return "AutomobilID = " +automobilId;
    }

    @Override
    public String getVrednostiZaUpdateRaspolozivosti() {
        return " Raspoloziv = 0 ";
    }

    @Override
    public String getWhereUpdateRaspolozivostUslov() {
        return " AutomobilID = " + automobilId;
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
        return " Raspoloziv = 1 ";
    }

    @Override
    public String getVrednostZaRazduzivanje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
