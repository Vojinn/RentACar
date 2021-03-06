/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import controller.Controller;
import domain.Iznajmljivanje;
import domain.StavkaIznajmljivanja;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import ui.component.table.model.IznajmljivanjaTableModel;
import niti.nitIznajmljeniAutomobili;
/**
 *
 * @author Vojin
 */
public class FRazduzivanje extends javax.swing.JFrame {

    private IznajmljivanjaTableModel modelIznajmljivanja;
    private nitIznajmljeniAutomobili nit;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    
    /**
     * Creates new form FRazduzivanje
     */
    public FRazduzivanje() {
        initComponents();
        setLocationRelativeTo(null);
        popuniFormu();
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
        jcbBrojKlijenta = new javax.swing.JCheckBox();
        jcbBrojIznajmljivanja = new javax.swing.JCheckBox();
        jtxtBrojKlijenta = new javax.swing.JTextField();
        jtxtBrojIznajmljivanja = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableIznajmljivanja = new javax.swing.JTable();
        jbtnRazduzi = new javax.swing.JButton();
        jbtnDetalji = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Razduzivanje");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kriterijum"));

        jcbBrojKlijenta.setText("Broj klijenta:");

        jcbBrojIznajmljivanja.setText("Iznajmljivanje ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbBrojKlijenta)
                    .addComponent(jcbBrojIznajmljivanja))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtBrojIznajmljivanja, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jtxtBrojKlijenta))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBrojKlijenta)
                    .addComponent(jtxtBrojKlijenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBrojIznajmljivanja, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBrojIznajmljivanja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Iznajmljivanja"));

        jtableIznajmljivanja.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtableIznajmljivanja);

        jbtnRazduzi.setText("Razdu??i ");
        jbtnRazduzi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRazduziActionPerformed(evt);
            }
        });

        jbtnDetalji.setText("Detalji");
        jbtnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jbtnRazduzi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRazduzi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnDetalji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(239, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetaljiActionPerformed
        if(jtableIznajmljivanja.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Izaberite neko iznajmljivanje.");
            return;
        }
        int red = jtableIznajmljivanja.getSelectedRow();
        Iznajmljivanje iznajmljivanje = modelIznajmljivanja.getIznajmljivanje(red);
        DRazduzivanjeStavke drs = new DRazduzivanjeStavke(this, true,iznajmljivanje);
        drs.setVisible(true);
    }//GEN-LAST:event_jbtnDetaljiActionPerformed

    private void jbtnRazduziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRazduziActionPerformed
        if(jtableIznajmljivanja.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Izaberite neko iznajmljivanje.");
            return;
        }
        int red = jtableIznajmljivanja.getSelectedRow();
        Iznajmljivanje i = modelIznajmljivanja.getIznajmljivanje(red);
        i.setNapomena("Razdu??eno");
        
        try{
            Controller.getInstance().razduziIznajmljivanje(i); 
            JOptionPane.showMessageDialog(this, "Sistem je razdu??io automobile.");
            List<StavkaIznajmljivanja> listaStavki = Controller.getInstance().vratiStavkeIznajmljivanja(i);
            for (StavkaIznajmljivanja si : listaStavki) {
                Controller.getInstance().promeniStatus(si.getAutomobil());
            }
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_jbtnRazduziActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        nit.stop();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnDetalji;
    private javax.swing.JButton jbtnRazduzi;
    private javax.swing.JCheckBox jcbBrojIznajmljivanja;
    private javax.swing.JCheckBox jcbBrojKlijenta;
    private javax.swing.JTable jtableIznajmljivanja;
    private javax.swing.JTextField jtxtBrojIznajmljivanja;
    private javax.swing.JTextField jtxtBrojKlijenta;
    // End of variables declaration//GEN-END:variables

    private void popuniFormu() {
        List<Iznajmljivanje> iznajmljivanja;
        try{
            iznajmljivanja = Controller.getInstance().vratiIznajmljivanja(new Iznajmljivanje());
            modelIznajmljivanja = new IznajmljivanjaTableModel(iznajmljivanja);
            jtableIznajmljivanja.setModel(modelIznajmljivanja);
            nit = new nitIznajmljeniAutomobili(modelIznajmljivanja,jcbBrojKlijenta,jcbBrojIznajmljivanja,jtxtBrojKlijenta,jtxtBrojIznajmljivanja,this);
            nit.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    
}
