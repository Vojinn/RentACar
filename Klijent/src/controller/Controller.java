/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Automobil;
import domain.Banka;
import domain.Iznajmljivanje;
import domain.Klijent;
import domain.Radnik;
import domain.StavkaIznajmljivanja;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import transfer.OdgovorObjekat;
import transfer.ZahtevObjekat;
import util.Operacija;
import util.StatusOdgovora;

/**
 *
 * @author Vojin
 */
public class Controller {
    
    private static Controller instance;
    
    private final Socket socket;
    private final Map<String, Object> map;
    private final ObjectOutputStream objectOutputStream;
    private final ObjectInputStream objectInputStream;
    
    private Radnik radnik;
    
    private Controller() throws IOException{
        socket = new Socket("localhost", 9000);
        map = new HashMap<>();
        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectInputStream = new ObjectInputStream(socket.getInputStream());
    }
    
    public static Controller getInstance() throws IOException{
        if(instance == null)
            instance = new Controller();
        return instance;
    }
    
    public Radnik getRadnik(){
        return radnik;
    }

    public void prijava(Radnik r) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        
        zahtev.setOperacija(Operacija.OPERACIJA_PRIJAVA);
        zahtev.setPodaci(r);
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            radnik = (Radnik) odgovor.getPodaci();
        } else {
            throw new Exception(odgovor.getPorukaGreska());
        }
        
    }

    public List<Banka> vratiBanke() throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_VRATI_BANKE);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            return (List<Banka>) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public int kreirajKlijenta() throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_KREIRAJ_NOVOG_KLIJENTA);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            return  (int) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public int kreirajAutomobil() throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_KREIRAJ_NOVI_AUTOMOBIL);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (int) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public String sacuvajKlijenta(Klijent klijent) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_ZAPAMTI_KLIJENTA);
        zahtev.setPodaci(klijent);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  "Sistem je zapamtio klijenta.";
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Klijent promeniKlijenta(Klijent k) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_IZMENI_KLIJENTA);
        zahtev.setPodaci(k);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Klijent) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public String sacuvajAutomobil(Automobil automobil) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_ZAPAMTI_AUTOMOBIL);
        zahtev.setPodaci(automobil);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  "Sistem je zapamtio automobil.";
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public List<Klijent> vratiKlijente(Klijent k) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_PRETRAZI_KLIJENTE);
        zahtev.setPodaci(k);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            return (List<Klijent>) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public List<Automobil> vratiAutomobile(Automobil a) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_PRETRAZI_AUTOMOBILE);
        zahtev.setPodaci(a);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            return (List<Automobil>) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Klijent obrisiKlijenta(Klijent k) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_OBRISI_KLIJENTA);
        zahtev.setPodaci(k);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        
        if(status == StatusOdgovora.USPESNO){
            return (Klijent) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Automobil promeniAutomobil(Automobil a) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_IZMENI_AUTOMOBIL);
        zahtev.setPodaci(a);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Automobil) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public List<Iznajmljivanje> vratiIznajmljivanja(Iznajmljivanje i) throws IOException, ClassNotFoundException, Exception{
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_PRETRAZI_IZNAJMLJIVANJA);
        zahtev.setPodaci(i);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (List<Iznajmljivanje>) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Iznajmljivanje sacuvajIznajmljivanje(Iznajmljivanje i) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_SACUVAJ_IZNAJMLJIVANJE);
        zahtev.setPodaci(i);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Iznajmljivanje) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Automobil promeniRaspolozivost(Automobil automobil) throws IOException, ClassNotFoundException, Exception {
        
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_PROMENI_RASPOLOZIVOST_AUTOMOBILA);
        zahtev.setPodaci(automobil);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Automobil) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public int kreirajNovoIznajmljivanje() throws IOException, ClassNotFoundException, Exception {
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_KREIRAJ_IZNAJMLJIVANJE);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();

        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus();
        if (status == StatusOdgovora.USPESNO) {
            return (int) odgovor.getPodaci();
        } else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public List<StavkaIznajmljivanja> vratiStavkeIznajmljivanja(Iznajmljivanje iznajmljivanje) throws Exception {
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_VRATI_STAVKE_IZNAJMLJIVANJA);
        zahtev.setPodaci(iznajmljivanje);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (List<StavkaIznajmljivanja>) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Iznajmljivanje razduziIznajmljivanje(Iznajmljivanje i) throws Exception {
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_RAZDUZI_IZNAJMLJIVANJE);
        zahtev.setPodaci(i);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Iznajmljivanje) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    public Automobil promeniStatus(Automobil automobil) throws Exception {
        ZahtevObjekat zahtev = new ZahtevObjekat();
        zahtev.setOperacija(Operacija.OPERACIJA_PROMENI_STATUS);
        zahtev.setPodaci(automobil);
        
        objectOutputStream.writeObject(zahtev);
        objectOutputStream.flush();
        
        OdgovorObjekat odgovor = (OdgovorObjekat) objectInputStream.readObject();
        StatusOdgovora status = odgovor.getStatus(); 
        
        if(status == StatusOdgovora.USPESNO){
            return  (Automobil) odgovor.getPodaci();
        }else {
            throw new Exception(odgovor.getPorukaGreska());
        }
    }

    
}
