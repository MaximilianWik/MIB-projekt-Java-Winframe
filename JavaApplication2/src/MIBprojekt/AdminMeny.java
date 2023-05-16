/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victus
 */
public class AdminMeny extends javax.swing.JFrame {
    private InfDB idb;
    private int agentId;

    /**
     * Creates new form AdminMeny
     */
    public AdminMeny(InfDB idb, int agentId) {
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
        NyAgent = new javax.swing.JButton();
        UtrustningKnapp = new javax.swing.JButton();
        AlienDatumknapp = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();
        ÄndraAlienKnapp1 = new javax.swing.JButton();
        AlienInfoKnapp1 = new javax.swing.JButton();
        ÄndraAlienKnapp2 = new javax.swing.JButton();
        ÄndraAlienKnapp3 = new javax.swing.JButton();
        TaBortAlienText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TaBortAgenttext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TaBortUtrustningtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AndraOmradescheftext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Omradetext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Kontorscheftext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        jButton1.setText("Ny Alien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ÄndraAlienKnapp.setText("Ändra Agent");
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

        AlienInfoKnapp.setText("Ta bort agent");
        AlienInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienInfoKnappActionPerformed(evt);
            }
        });

        SokPåAlien.setText("Ta bort Utrustning");
        SokPåAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SokPåAlienActionPerformed(evt);
            }
        });

        NyAgent.setText("Ny Agent");
        NyAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NyAgentActionPerformed(evt);
            }
        });

        UtrustningKnapp.setText("Sök Agent");
        UtrustningKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtrustningKnappActionPerformed(evt);
            }
        });

        AlienDatumknapp.setText("Ny Admin");
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

        ÄndraAlienKnapp1.setText("Ändra Alien");
        ÄndraAlienKnapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAlienKnapp1ActionPerformed(evt);
            }
        });

        AlienInfoKnapp1.setText("Ta bort Alien");
        AlienInfoKnapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlienInfoKnapp1ActionPerformed(evt);
            }
        });

        ÄndraAlienKnapp2.setText("Ändra kontorschef");
        ÄndraAlienKnapp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAlienKnapp2ActionPerformed(evt);
            }
        });

        ÄndraAlienKnapp3.setText("Ändra områdeschef");
        ÄndraAlienKnapp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAlienKnapp3ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AlienID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AgentID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UtrustningID");

        AndraOmradescheftext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraOmradescheftextActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AgentID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Område");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AgentID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bilden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ÄndraAlienKnapp1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ÄndraAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AlienDatumknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TaBortAlienText)
                                    .addComponent(AlienInfoKnapp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TaBortAgenttext)
                                    .addComponent(AlienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SokPåAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TaBortUtrustningtext)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ÄndraAlienKnapp3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Omradetext, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(AndraOmradescheftext)))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ÄndraAlienKnapp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kontorscheftext)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ÄndraAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TaBortAlienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaBortAgenttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaBortUtrustningtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlienInfoKnapp1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SokPåAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ÄndraAlienKnapp1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AlienDatumknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AndraOmradescheftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Omradetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Kontorscheftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ÄndraAlienKnapp3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ÄndraAlienKnapp2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(GaTillbakaKnapp)
                        .addGap(21, 21, 21))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NyAlien NY = new NyAlien(idb, agentId);
        NY.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ÄndraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnappActionPerformed
        AndraAlien AA = new AndraAlien(idb, agentId);
        AA.setVisible(true);

        dispose();
    }//GEN-LAST:event_ÄndraAlienKnappActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BytLosenordAgent BLA = new BytLosenordAgent(idb, agentId);
        BLA.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void NyAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NyAgentActionPerformed
        //JOptionPane.showMessageDialog(null, "Heeeej");
        NyAgent NA = new NyAgent(idb, agentId);
        NA.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_NyAgentActionPerformed

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

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        LogInAdmin LIA = new LogInAdmin(idb);
        LIA.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void ÄndraAlienKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnapp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraAlienKnapp1ActionPerformed

    private void AlienInfoKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlienInfoKnapp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlienInfoKnapp1ActionPerformed

    private void ÄndraAlienKnapp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnapp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraAlienKnapp2ActionPerformed

    private void ÄndraAlienKnapp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnapp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÄndraAlienKnapp3ActionPerformed

    private void AndraOmradescheftextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraOmradescheftextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AndraOmradescheftextActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlienDatumknapp;
    private javax.swing.JButton AlienInfoKnapp;
    private javax.swing.JButton AlienInfoKnapp1;
    private javax.swing.JTextField AndraOmradescheftext;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JTextField Kontorscheftext;
    private javax.swing.JButton NyAgent;
    private javax.swing.JTextField Omradetext;
    private javax.swing.JButton SokPåAlien;
    private javax.swing.JTextField TaBortAgenttext;
    private javax.swing.JTextField TaBortAlienText;
    private javax.swing.JTextField TaBortUtrustningtext;
    private javax.swing.JButton UtrustningKnapp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ÄndraAlienKnapp;
    private javax.swing.JButton ÄndraAlienKnapp1;
    private javax.swing.JButton ÄndraAlienKnapp2;
    private javax.swing.JButton ÄndraAlienKnapp3;
    // End of variables declaration//GEN-END:variables
}
