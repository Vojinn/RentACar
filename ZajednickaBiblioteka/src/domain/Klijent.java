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
public class Klijent implements IOpstiObjekat{
    
    private int klijentId;
    private String jmbg;
    private String ime;
    private String prezime;
    private String adresa;
    private String brojTelefona;
    private Banka banka;

    public Klijent() {
    }

    public Klijent(int klijentId, String jmbg, String ime, String prezime, String adresa, String brojTelefona, Banka banka) {
        this.klijentId = klijentId;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
        this.banka = banka;
    }
    
    public int getKlijentID() {
        return klijentId;
    }

    public void setKlijentID(int klijentId) {
        this.klijentId = klijentId;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " klijent.KlijentID,klijent.Jmbg,klijent.Ime,klijent.Prezime,klijent.Adresa,klijent.BrojTelefona,klijent.BankaID,b.NazivBanke";
    }

    @Override
    public String getNazivTabele() {
        return " klijent ";
    }

    @Override
    public String joinUslov() {
        return " INNER JOIN banka b ON (klijent.BankaID = b.BankaID)";
    }

    @Override
    public String getWhereUslov() {
        if(ime != null){
            if(prezime != null){
                return " WHERE Ime LIKE '" + ime + "%' AND Prezime LIKE '" + prezime + "%'";
            } else {
                return " WHERE Ime LIKE '" + ime + "%'";
            }
        } else {
            if(prezime != null){
                return " WHERE Prezime LIKE '" + prezime + "%'";
            } else {
                return "";
            }
        }
    }

    @Override
    public String getOrderByUslov() {
        return " ORDER BY Prezime";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public IOpstiObjekat napuniObjekat(ResultSet rs, Object lista) {
        
        Klijent k = new Klijent();
        
        try{
            k.setKlijentID(rs.getInt(1));
            k.setJmbg(rs.getString(2));
            k.setIme(rs.getString(3));
            k.setPrezime(rs.getString(4));
            k.setAdresa(rs.getString(5));
            k.setBrojTelefona(rs.getString(6));
            k.setBanka(new Banka(rs.getInt(7), rs.getString(8)));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return k;
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

    

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    @Override
    public void setSifra(int id) {
        this.klijentId = id;
    }

    @Override
    public String getVrednostiZaUpdate() {
        return " Jmbg = '" + jmbg + "', Ime = '" + ime + "', Prezime = '" + prezime + "', Adresa = '" + adresa + "', "
                + "BrojTelefona = '" + brojTelefona + "', BankaID = " + banka.getBankaId();
    }

    @Override
    public String getWhereUpdateUslov() {
        return "KlijentID = " + klijentId;
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
