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
public class StavkaIznajmljivanja implements IOpstiObjekat{
    
    private int stavkaId;
    private int vrednostStavke;
    private double popust;
    private double cenaAutomobila;
    private Automobil automobil;
    private Iznajmljivanje iznajmljivanje;

    public StavkaIznajmljivanja() {
    }

    public StavkaIznajmljivanja(int stavkaId, int vrednostStavke, double popust, double cenaAutomobila, Automobil automobil, Iznajmljivanje iznajmljivanje) {
        this.stavkaId = stavkaId;
        this.vrednostStavke = vrednostStavke;
        this.popust = popust;
        this.cenaAutomobila = cenaAutomobila;
        this.automobil = automobil;
        this.iznajmljivanje = iznajmljivanje;
    }
    
    public int getStavkaId() {
        return stavkaId;
    }

    public void setStavkaId(int stavkaId) {
        this.stavkaId = stavkaId;
    }

    public int getVrednostStavke() {
        return vrednostStavke;
    }

    public void setVrednostStavke(int vrednostStavke) {
        this.vrednostStavke = vrednostStavke;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    

    

    public Automobil getAutomobil() {
        return automobil;
    }

    public void setAutomobil(Automobil automobil) {
        this.automobil = automobil;
    }

    public Iznajmljivanje getIznajmljivanje() {
        return iznajmljivanje;
    }

    public void setIznajmljivanje(Iznajmljivanje iznajmljivanje) {
        this.iznajmljivanje = iznajmljivanje;
    }

    public double getCenaAutomobila() {
        return cenaAutomobila;
    }

    public void setCenaAutomobila(double cenaAutomobila) {
        this.cenaAutomobila = cenaAutomobila;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " * ";
    }

    @Override
    public String getNazivTabele() {
        return " stavka_iznajmljivanja ";
    }

    @Override
    public String joinUslov() {
        System.out.println(iznajmljivanje.getIznajmljivanjeId());
        return "JOIN automobil a ON (stavka_iznajmljivanja.SifraAutomobila = a.AutomobilID) "
                + "JOIN iznajmljivanje i ON (stavka_iznajmljivanja.SifraIznajmljivanja = i.IznajmljivanjeID)";
    }

    @Override
    public String getWhereUslov() {
        return " WHERE stavka_iznajmljivanja.SifraIznajmljivanja = " + iznajmljivanje.getIznajmljivanjeId();
    }

    @Override
    public String getOrderByUslov() {
        return " ORDER BY stavka_iznajmljivanja.StavkaID";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public IOpstiObjekat napuniObjekat(ResultSet rs, Object lista) {
        StavkaIznajmljivanja si = new StavkaIznajmljivanja();
        Iznajmljivanje izna = new Iznajmljivanje();
        Automobil autom = new Automobil();
        try{
            autom.setAutomobilId(rs.getInt(7));
            autom.setMarka(rs.getString(9));
            autom.setModel(rs.getString(10));
            autom.setCenaNaDan(rs.getInt(14));
            si.setStavkaId(rs.getInt(2));
            si.setVrednostStavke(rs.getInt(3));
            si.setPopust(rs.getDouble(4));
            si.setCenaAutomobila(rs.getDouble(5));
            si.setAutomobil(autom);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return si;
    }

    @Override
    public String getNazivTabeleAsocijacije() {
        return " stavka_iznajmljivanja ";
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
        return " SifraIznajmljivanja, VrednostStavke, Popust, CenaAutomobila, SifraAutomobila ";
    }

    @Override
    public String getVrednostiZaInsertAsocijacije() {
        return iznajmljivanje.getIznajmljivanjeId() + ", " + vrednostStavke + ", " + popust + ", " +cenaAutomobila + ", " + automobil.getAutomobilId();
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
