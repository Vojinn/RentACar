/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author Vojin
 */
public interface Operacija extends Serializable{

    public static final int OPERACIJA_PRIJAVA = 1;
    public static final int OPERACIJA_VRATI_BANKE = 2;
    public static final int OPERACIJA_KREIRAJ_NOVOG_KLIJENTA = 3;
    public static final int OPERACIJA_KREIRAJ_NOVI_AUTOMOBIL = 4;
    public static final int OPERACIJA_ZAPAMTI_KLIJENTA = 5;
    public static final int OPERACIJA_ZAPAMTI_AUTOMOBIL = 6;
    public static final int OPERACIJA_PRETRAZI_KLIJENTE = 7;
    public static final int OPERACIJA_PRETRAZI_AUTOMOBILE = 8;
    public static final int OPERACIJA_OBRISI_KLIJENTA = 9;
    public static final int OPERACIJA_IZMENI_KLIJENTA = 10;
    public static final int OPERACIJA_IZMENI_AUTOMOBIL = 11;
    public static final int OPERACIJA_PRETRAZI_IZNAJMLJIVANJA = 12;
    public static final int OPERACIJA_PROMENI_RASPOLOZIVOST_AUTOMOBILA = 13;
    public static final int OPERACIJA_SACUVAJ_IZNAJMLJIVANJE = 14;
    public static final int OPERACIJA_KREIRAJ_IZNAJMLJIVANJE = 15;
    public static final int OPERACIJA_VRATI_STAVKE_IZNAJMLJIVANJA = 16;
    public static final int OPERACIJA_RAZDUZI_IZNAJMLJIVANJE = 17;
    public static final int OPERACIJA_PROMENI_STATUS = 18;
    
    
}
