/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;

/**
 *
 * @author Vojin
 */
public interface IOpstiObjekat extends Serializable{

    public String getNaziviKolonaZaSelect();

    public String getNazivTabele();
    
    public String joinUslov();
    
    public String getWhereUslov();
    
    public String getOrderByUslov();
    
    public boolean imaAsocijaciju();
    
    public IOpstiObjekat napuniObjekat(ResultSet resultSet, Object lista);
    
    public String getNazivTabeleAsocijacije();
    
    public String joinUslovAsocijacije();
    
    public String getWhereUslovAsocijacije();
    
    public String getNaziviKolonaZaSelectAsocijacije();
    
    public Object napuniObjekatAsocijacije(ResultSet rs);

    public void setSifra(int id);

    public String getVrednostiZaUpdate();

    public String getWhereUpdateUslov();

    public String getVrednostiZaUpdateRaspolozivosti();
    
    public String getWhereUpdateRaspolozivostUslov();

    public String getNaziviKolonaZaInsertAsocijacije();
    
    public String getVrednostiZaInsertAsocijacije();

    public String getVrednostiZaUpdateStatusa();

    public String getVrednostZaRazduzivanje();
    
   
    
}
