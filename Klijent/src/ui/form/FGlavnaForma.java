/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vojin
 */
public class FGlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form FGlavnaForma
     */
    public FGlavnaForma() {
        initComponents();
        
        try{
            jlblUlogovaniRadnik.setText(Controller.getInstance().getRadnik().toString());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        setLocationRelativeTo(null);
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
        jbtnUnosKlijenta = new javax.swing.JButton();
        jbtnPretraziKlijenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnPretraziAutomobil = new javax.swing.JButton();
        jbtnUnosAutomobila = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jbtnRazduzi = new javax.swing.JButton();
        jlblUlogovaniRadnik = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuUradi = new javax.swing.JMenu();
        jmenuKlijent = new javax.swing.JMenu();
        jmiDodajKlijenta = new javax.swing.JMenuItem();
        jmiPretraziKlijente = new javax.swing.JMenuItem();
        jmenuAutomobil = new javax.swing.JMenu();
        jmiDodajAutomobil = new javax.swing.JMenuItem();
        jmiPretraziAutomobile = new javax.swing.JMenuItem();
        jmenuInformacije = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RentACar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Upravljanje klijentima"));

        jbtnUnosKlijenta.setText("Unos novog klijenta");
        jbtnUnosKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUnosKlijentaActionPerformed(evt);
            }
        });

        jbtnPretraziKlijenta.setText("Pretraži klijente");
        jbtnPretraziKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPretraziKlijentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnUnosKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbtnPretraziKlijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnUnosKlijenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPretraziKlijenta, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Upravljanje automobilima"));

        jbtnPretraziAutomobil.setText("Pretraži automobile");
        jbtnPretraziAutomobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPretraziAutomobilActionPerformed(evt);
            }
        });

        jbtnUnosAutomobila.setText("Unos novog automobila");
        jbtnUnosAutomobila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUnosAutomobilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnUnosAutomobila, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnPretraziAutomobil, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnUnosAutomobila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPretraziAutomobil, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Razduživanje automobila"));

        jbtnRazduzi.setText("Razduži automobile");
        jbtnRazduzi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRazduziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnRazduzi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnRazduzi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblUlogovaniRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblUlogovaniRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jmenuUradi.setText("Uradi");

        jmenuKlijent.setText("Klijent");

        jmiDodajKlijenta.setText("Dodaj klijenta");
        jmiDodajKlijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajKlijentaActionPerformed(evt);
            }
        });
        jmenuKlijent.add(jmiDodajKlijenta);

        jmiPretraziKlijente.setText("Pretraži klijente");
        jmiPretraziKlijente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPretraziKlijenteActionPerformed(evt);
            }
        });
        jmenuKlijent.add(jmiPretraziKlijente);

        jmenuUradi.add(jmenuKlijent);

        jmenuAutomobil.setText("Automobil");

        jmiDodajAutomobil.setText("Dodaj automobil");
        jmiDodajAutomobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajAutomobilActionPerformed(evt);
            }
        });
        jmenuAutomobil.add(jmiDodajAutomobil);

        jmiPretraziAutomobile.setText("Pretraži automobile");
        jmiPretraziAutomobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPretraziAutomobileActionPerformed(evt);
            }
        });
        jmenuAutomobil.add(jmiPretraziAutomobile);

        jmenuUradi.add(jmenuAutomobil);

        jMenuBar1.add(jmenuUradi);

        jmenuInformacije.setText("Informacije");
        jMenuBar1.add(jmenuInformacije);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUnosKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUnosKlijentaActionPerformed
        try{
            kreirajKlijenta();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnUnosKlijentaActionPerformed

    private void jbtnUnosAutomobilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUnosAutomobilaActionPerformed
        
        try{
            kreirajAutomobil();
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnUnosAutomobilaActionPerformed

    private void jbtnPretraziKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPretraziKlijentaActionPerformed
        
        FPretragaKlijenata forma = new FPretragaKlijenata();
        forma.setVisible(true);
    }//GEN-LAST:event_jbtnPretraziKlijentaActionPerformed

    private void jbtnPretraziAutomobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPretraziAutomobilActionPerformed
        
        FPretragaAutomobila forma = new FPretragaAutomobila();
        forma.setVisible(true);
    }//GEN-LAST:event_jbtnPretraziAutomobilActionPerformed

    private void jbtnRazduziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRazduziActionPerformed
        new FRazduzivanje().setVisible(true);
    }//GEN-LAST:event_jbtnRazduziActionPerformed

    private void jmiDodajKlijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajKlijentaActionPerformed
        try{
            kreirajKlijenta();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jmiDodajKlijentaActionPerformed

    private void jmiPretraziKlijenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPretraziKlijenteActionPerformed
        FPretragaKlijenata forma = new FPretragaKlijenata();
        forma.setVisible(true);
    }//GEN-LAST:event_jmiPretraziKlijenteActionPerformed

    private void jmiDodajAutomobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajAutomobilActionPerformed
        try{
            kreirajAutomobil();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jmiDodajAutomobilActionPerformed

    private void jmiPretraziAutomobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPretraziAutomobileActionPerformed
        FPretragaAutomobila forma = new FPretragaAutomobila();
        forma.setVisible(true);
    }//GEN-LAST:event_jmiPretraziAutomobileActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnPretraziAutomobil;
    private javax.swing.JButton jbtnPretraziKlijenta;
    private javax.swing.JButton jbtnRazduzi;
    private javax.swing.JButton jbtnUnosAutomobila;
    private javax.swing.JButton jbtnUnosKlijenta;
    private javax.swing.JLabel jlblUlogovaniRadnik;
    private javax.swing.JMenu jmenuAutomobil;
    private javax.swing.JMenu jmenuInformacije;
    private javax.swing.JMenu jmenuKlijent;
    private javax.swing.JMenu jmenuUradi;
    private javax.swing.JMenuItem jmiDodajAutomobil;
    private javax.swing.JMenuItem jmiDodajKlijenta;
    private javax.swing.JMenuItem jmiPretraziAutomobile;
    private javax.swing.JMenuItem jmiPretraziKlijente;
    // End of variables declaration//GEN-END:variables

    private void kreirajKlijenta() {
        FKlijent forma = new FKlijent();
        forma.setVisible(true);
        JOptionPane.showMessageDialog(forma, "Sistem je kreirao klijenta.");
    }

    private void kreirajAutomobil() throws IOException, Exception {
        int automobilID = Controller.getInstance().kreirajAutomobil();
        FAutomobil forma = new FAutomobil(automobilID);
        forma.setVisible(true);
        JOptionPane.showMessageDialog(forma, "Sistem je kreirao automobil.");
    }
}
