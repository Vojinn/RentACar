/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import domain.Automobil;
import domain.Iznajmljivanje;
import domain.Klijent;
import domain.StavkaIznajmljivanja;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.component.table.model.AutomobilTableModel;
import ui.component.table.model.KlijentiTableModel;
import ui.component.table.model.StavkeIznajmljivanjaTableModel;

/**
 *
 * @author Vojin
 */
public class FIznajmljivanje extends javax.swing.JFrame {
    
    private AutomobilTableModel modelAutomobili;
    private KlijentiTableModel modelKlijenti;
    private StavkeIznajmljivanjaTableModel modelStavkeIznajmljivanja;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private final Automobil a;
    private Date datumRazduzivanja;
    private Date datumIznajmljivanja;
    private int brojIznajmljenih;
    private long danaIznajmljenih;
    private Klijent klijent;
    int iznajmljivanjeID;

    /**
     * Creates new form FIznajmljivanje
     */
    public FIznajmljivanje(Automobil a) {
        initComponents();
        this.a = a;
        setLocationRelativeTo(null);
        popuniFormu(a);
    }

    FIznajmljivanje(Automobil a, int iznajmljivanjeID) {
        initComponents();
        this.a = a;
        setLocationRelativeTo(null);
        popuniFormu(a);
        this.iznajmljivanjeID = iznajmljivanjeID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDatumIznajmljivanja = new javax.swing.JTextField();
        jtxtDatumRazduzivanja = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableKlijenti = new javax.swing.JTable();
        jbtnIzaberiKlijenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableStavkeIznajmljivanja = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableAutomobili = new javax.swing.JTable();
        jbtnIzaberiAuto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtKlijentJMBG = new javax.swing.JTextField();
        jtxtKlijetImeIPrezime = new javax.swing.JTextField();
        jbtnSacuvajIznajmljivanje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iznajmljivanje");

        jLabel1.setText("Datum iznajmljivanja:");

        jLabel2.setText("Datum razduživanja:");

        jtxtDatumRazduzivanja.setText("20.06.2021");
        jtxtDatumRazduzivanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDatumRazduzivanjaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Klijenti"));

        jtableKlijenti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableKlijenti);

        jbtnIzaberiKlijenta.setText("Izaberi klijenta");
        jbtnIzaberiKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzaberiKlijentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jbtnIzaberiKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbtnIzaberiKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtableStavkeIznajmljivanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtableStavkeIznajmljivanja);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Automobili"));

        jtableAutomobili.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtableAutomobili);

        jbtnIzaberiAuto.setText("Izaberi auto");
        jbtnIzaberiAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzaberiAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jbtnIzaberiAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnIzaberiAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("JMBG:");

        jLabel4.setText("Klijent:");

        jbtnSacuvajIznajmljivanje.setText("Sačuvaj iznajmljivanje");
        jbtnSacuvajIznajmljivanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajIznajmljivanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtKlijentJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtKlijetImeIPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSacuvajIznajmljivanje, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDatumIznajmljivanja, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDatumRazduzivanja, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtDatumIznajmljivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jtxtDatumRazduzivanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtKlijentJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtKlijetImeIPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbtnSacuvajIznajmljivanje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDatumRazduzivanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDatumRazduzivanjaActionPerformed
        
        try {
            datumRazduzivanja = sdf.parse(jtxtDatumRazduzivanja.getText());
            if(datumRazduzivanja.before(datumIznajmljivanja))
                throw new Exception("Datum razduživanja mora biti posle datum zaduživanja.");
            jtxtDatumRazduzivanja.setEnabled(false);
            jbtnIzaberiKlijenta.setEnabled(true);
            jtableKlijenti.setEnabled(true);
            
            StavkaIznajmljivanja si = new StavkaIznajmljivanja(-1, a.getCenaNaDan(), 0, 0, a, null);
            long daniIzmedju = TimeUnit.DAYS.convert(datumRazduzivanja.getTime() - datumIznajmljivanja.getTime(), TimeUnit.MILLISECONDS);
            daniIzmedju += 2;
            danaIznajmljenih = daniIzmedju;
            si.setPopust(vratiPopust());
            
            si.setCenaAutomobila((int)danaIznajmljenih*si.getVrednostStavke()*(1-si.getPopust()));
            
            StavkeIznajmljivanjaTableModel modelStavki = (StavkeIznajmljivanjaTableModel) jtableStavkeIznajmljivanja.getModel();
            modelStavki.dodajStavku(si);
            
            JOptionPane.showMessageDialog(this, "Izaberite klijenta koji iznajmljuje automobil.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jtxtDatumRazduzivanjaActionPerformed

    private void jbtnIzaberiKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzaberiKlijentaActionPerformed
        
        int red = jtableKlijenti.getSelectedRow();
        if(red != -1){
            Klijent k = modelKlijenti.getKlijent(red);
            try{
                boolean mozeDaIznajmi = validacija(k);
                if(mozeDaIznajmi){
                    jtxtKlijentJMBG.setText(k.getJmbg());
                    jtxtKlijetImeIPrezime.setText(k.getIme() + " " + k.getPrezime());
                    jbtnIzaberiKlijenta.setEnabled(false);
                    jtableKlijenti.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Klijent uspešno dodat. Možete dodati još neki automobil ukoliko želite.");
                    jtableAutomobili.setEnabled(true);
                    jbtnIzaberiAuto.setEnabled(true);
                    jtableStavkeIznajmljivanja.setEnabled(true);
                    jbtnSacuvajIznajmljivanje.setEnabled(true);
                    brojIznajmljenih++;
                    klijent = k;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jbtnIzaberiKlijentaActionPerformed

    private void jbtnIzaberiAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzaberiAutoActionPerformed
        
        int red = jtableAutomobili.getSelectedRow();
        if(red != -1){
            Automobil a = modelAutomobili.getAutomobil(red);
            if(a.isRaspoloziv() == false){
                JOptionPane.showMessageDialog(this, "Izabrani automobil nije raspoloživ.");
                return;
            }     
            try{
                 boolean mozeDaIznajmi = validacijaAuta(a);
                 if(mozeDaIznajmi){
                     StavkeIznajmljivanjaTableModel model = (StavkeIznajmljivanjaTableModel) jtableStavkeIznajmljivanja.getModel();
                     StavkaIznajmljivanja si = new StavkaIznajmljivanja(-1, a.getCenaNaDan(), 0, 0, a, null);
                     si.setPopust(vratiPopust());
                     si.setCenaAutomobila((int)danaIznajmljenih*si.getVrednostStavke()*(1-si.getPopust()));
                     model.dodajStavku(si);
                     AutomobilTableModel modelAutomobila = (AutomobilTableModel) jtableAutomobili.getModel();
                     modelAutomobila.izmeniRaspolozivost(a);
                     //modelAutomobila.prikaziSamoRaspolozive();
                 }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
           
        }
    }//GEN-LAST:event_jbtnIzaberiAutoActionPerformed

    private void jbtnSacuvajIznajmljivanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajIznajmljivanjeActionPerformed
        
        try{
            Iznajmljivanje i = validacijaIznajmljivanja();
            Controller.getInstance().sacuvajIznajmljivanje(i);
            JOptionPane.showMessageDialog(this, "Sistem je sačuvao podatke o iznajmljivanju.");
            StavkeIznajmljivanjaTableModel modelStavki = (StavkeIznajmljivanjaTableModel) jtableStavkeIznajmljivanja.getModel();
            List<StavkaIznajmljivanja> stavke = modelStavki.getStavke();
            for (StavkaIznajmljivanja si : stavke) {
                Controller.getInstance().promeniRaspolozivost(si.getAutomobil());
            }
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnSacuvajIznajmljivanjeActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnIzaberiAuto;
    private javax.swing.JButton jbtnIzaberiKlijenta;
    private javax.swing.JButton jbtnSacuvajIznajmljivanje;
    private javax.swing.JTable jtableAutomobili;
    private javax.swing.JTable jtableKlijenti;
    private javax.swing.JTable jtableStavkeIznajmljivanja;
    private javax.swing.JTextField jtxtDatumIznajmljivanja;
    private javax.swing.JTextField jtxtDatumRazduzivanja;
    private javax.swing.JTextField jtxtKlijentJMBG;
    private javax.swing.JTextField jtxtKlijetImeIPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniFormu(Automobil a) {
        
        Date datum = new Date();
        jtxtDatumIznajmljivanja.setText(sdf.format(datum));
        jtxtDatumIznajmljivanja.setEnabled(false);
        datumIznajmljivanja = datum;
        
        try {
            List<Klijent> klijenti = Controller.getInstance().vratiKlijente(new Klijent());
            List<Automobil> automobili = Controller.getInstance().vratiAutomobile(new Automobil());
            modelKlijenti = new KlijentiTableModel(klijenti);
            modelAutomobili = new AutomobilTableModel(automobili);
            modelAutomobili.izmeniRaspolozivost(a);
            //modelAutomobili.obrisiAutomobil(a);
            //modelAutomobili.prikaziSamoRaspolozive();
            jtableKlijenti.setModel(modelKlijenti);
            jtableAutomobili.setModel(modelAutomobili);
        }  catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ovde");
        }
        List<StavkaIznajmljivanja> stavkeIznajmljivanja = new ArrayList<>();
        jtableStavkeIznajmljivanja.setModel(new StavkeIznajmljivanjaTableModel(stavkeIznajmljivanja));
        jtableAutomobili.setEnabled(false);
        jtableKlijenti.setEnabled(false);
        jtableStavkeIznajmljivanja.setEnabled(false);
        jbtnIzaberiAuto.setEnabled(false);
        jbtnIzaberiKlijenta.setEnabled(false);
        jbtnSacuvajIznajmljivanje.setEnabled(false);
        jtxtKlijentJMBG.setEnabled(false);
        jtxtKlijetImeIPrezime.setEnabled(false);
        
    }

    private boolean validacija(Klijent k) throws IOException, Exception {
        List<Iznajmljivanje> iznajmljivanja;
        
        iznajmljivanja = Controller.getInstance().vratiIznajmljivanja(new Iznajmljivanje());
       
        int brojIznajmljenih = 0;
        
        for (Iznajmljivanje i : iznajmljivanja) {
            if(k.getKlijentID() == i.getKlijentId())
                brojIznajmljenih++;
        }
        this.brojIznajmljenih = brojIznajmljenih;
        //JOptionPane.showMessageDialog(this, brojIznajmljenih);
        if(brojIznajmljenih <= 2)
            return true;
        else
            throw new Exception("Izabrani klijent je zadužio maksimalan broj automobila.");
    }

    private boolean validacijaAuta(Automobil a) throws Exception {
        if(brojIznajmljenih < 3){
            brojIznajmljenih++;
            return true;
        }else{
            throw new Exception("Izabrani klijent je zadužio maksimalan broj automobila.");
        }
    }

    private double vratiPopust() {
        if(danaIznajmljenih > 7 && danaIznajmljenih < 14)
               return 0.05; 
            else if(danaIznajmljenih >= 14)
                return 0.1;
            else
                return 0;
    }

    private Iznajmljivanje validacijaIznajmljivanja() throws ParseException {
        
        int klijentID = klijent.getKlijentID();
        Date datumIznajmljivanja = sdf.parse(jtxtDatumIznajmljivanja.getText());
        Date datumRazduzivanja = sdf.parse(jtxtDatumRazduzivanja.getText());
        String napomena = "Iznajmljeno";
        StavkeIznajmljivanjaTableModel modelStavki = (StavkeIznajmljivanjaTableModel) jtableStavkeIznajmljivanja.getModel();
        double ukupno = modelStavki.vratiUkupnuVrednost();
        ArrayList<StavkaIznajmljivanja> listaIznajmljenihStavki = modelStavki.getStavke();
        
        
        Iznajmljivanje i = new Iznajmljivanje(klijentID, iznajmljivanjeID, datumIznajmljivanja, datumRazduzivanja, napomena, ukupno, listaIznajmljenihStavki);
        for (StavkaIznajmljivanja si : listaIznajmljenihStavki) {
            si.setIznajmljivanje(i);
        }
        return i;
    }
}