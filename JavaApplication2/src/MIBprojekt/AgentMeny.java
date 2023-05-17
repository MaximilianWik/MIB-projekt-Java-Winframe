/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victus
 */
public class AgentMeny extends javax.swing.JFrame {
    private InfDB idb;
    private int agentId;
    /**
     * Creates new form AgentMeny
     */
    public AgentMeny(InfDB idb, int agentId) {
        initComponents();
        this.agentId = agentId;
        this.idb = idb;
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
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
        Bilden = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ÄndraAlienKnapp = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AlienInfoKnapp = new javax.swing.JButton();
        SokPåAlien = new javax.swing.JButton();
        Omradescheftext = new javax.swing.JButton();
        UtrustningKnapp = new javax.swing.JButton();
        AlienDatumknapp = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        jButton1.setText("Ny Alien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ÄndraAlienKnapp.setText("Ändra Alien");
        ÄndraAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAlienKnappActionPerformed(evt);
            }
        });

        jButton3.setText("Byt Lösenord");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        AlienInfoKnapp.setText("Alien Info");
        AlienInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienInfoKnappActionPerformed(evt);
            }
        });

        SokPåAlien.setText("Sök på Alien");
        SokPåAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SokPåAlienActionPerformed(evt);
            }
        });

        Omradescheftext.setText("Områdeschef");
        Omradescheftext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmradescheftextActionPerformed(evt);
            }
        });

        UtrustningKnapp.setText("Utrustning");
        UtrustningKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtrustningKnappActionPerformed(evt);
            }
        });

        AlienDatumknapp.setText("Alien Datum");
        AlienDatumknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienDatumknappActionPerformed(evt);
            }
        });

        GaTillbakaKnapp.setText("Gå tillbaka");
        GaTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaTillbakaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ÄndraAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AlienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SokPåAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Omradescheftext, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AlienDatumknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ÄndraAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SokPåAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlienDatumknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Omradescheftext, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(GaTillbakaKnapp)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Ändra Lösenord
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BytLosenordAgent BLA = new BytLosenordAgent(idb, agentId);
        BLA.setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    //Ny Alien
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NyAlien NY = new NyAlien(idb, agentId);
        NY.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        LogInAgent LIA = new LogInAgent(idb);
        LIA.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void ÄndraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnappActionPerformed
        AndraAlien AA = new AndraAlien(idb, agentId);
        AA.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ÄndraAlienKnappActionPerformed

    private void AlienInfoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlienInfoKnappActionPerformed
        AlienInfo AI = new AlienInfo(idb, agentId);
        AI.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_AlienInfoKnappActionPerformed

    private void SokPåAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SokPåAlienActionPerformed
        SokPaAlien SPA = new SokPaAlien(idb, agentId);
        SPA.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_SokPåAlienActionPerformed

    private void OmradescheftextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmradescheftextActionPerformed
        OmradeSida OS = new OmradeSida(idb, agentId);
        OS.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_OmradescheftextActionPerformed

    private void UtrustningKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtrustningKnappActionPerformed
        Utrustning U = new Utrustning(idb, agentId);
        U.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_UtrustningKnappActionPerformed

    private void AlienDatumknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlienDatumknappActionPerformed
        AlienDatum AD = new AlienDatum(idb, agentId);
        AD.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_AlienDatumknappActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlienDatumknapp;
    private javax.swing.JButton AlienInfoKnapp;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JButton Omradescheftext;
    private javax.swing.JButton SokPåAlien;
    private javax.swing.JButton UtrustningKnapp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ÄndraAlienKnapp;
    // End of variables declaration//GEN-END:variables
}
