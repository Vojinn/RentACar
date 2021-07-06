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
public class Radnik implements IOpstiObjekat{
    
    private int sifra;
    private String korisnickoIme;
    private String password;
    private String email;
    private String telefon;
    private String ime;
    private String prezime;

    public Radnik() {
    }

    public Radnik(int sifra, String korisnickoIme, String password, String email, String telefon, String ime, String prezime) {
        this.sifra = sifra;
        this.korisnickoIme = korisnickoIme;
        this.password = password;
        this.email = email;
        this.telefon = telefon;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String getNaziviKolonaZaSelect() {
        return " * ";
    }

    @Override
    public String getNazivTabele() {
        return "radnik";
    }

    @Override
    public String joinUslov() {
        return "";
    }

    @Override
    public String getWhereUslov() {
        return " WHERE KorisnickoIme='"+korisnickoIme+"' AND Password='"+password+"'";
    }

    @Override
    public String getOrderByUslov() {
        return "ORDER BY Ime ASC";
    }

    @Override
    public boolean imaAsocijaciju() {
        return false;
    }

    @Override
    public IOpstiObjekat napuniObjekat(ResultSet resultSet, Object lista) {
        try{
            sifra = resultSet.getInt(1);
            korisnickoIme = resultSet.getString(2);
            password = resultSet.getString(3);
            email = resultSet.getString(4);
            telefon = resultSet.getString(5);
            ime = resultSet.getString(6);
            prezime = resultSet.getString(7);
            return this;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
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
