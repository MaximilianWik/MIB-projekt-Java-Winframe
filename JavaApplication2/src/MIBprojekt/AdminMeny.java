/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
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
        NyAlien = new javax.swing.JButton();
        ÄndraAgentKnapp = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TaBortAgent = new javax.swing.JButton();
        SokPåAlien = new javax.swing.JButton();
        NyAgent = new javax.swing.JButton();
        UtrustningKnapp = new javax.swing.JButton();
        AndraAdminStatus = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();
        ÄndraAlienKnapp1 = new javax.swing.JButton();
        TaBortAlien = new javax.swing.JButton();
        AndraKontorschef = new javax.swing.JButton();
        AndraOmrådeschef = new javax.swing.JButton();
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
        AIDadmintxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        NyAlien.setText("Ny Alien");
        NyAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NyAlienActionPerformed(evt);
            }
        });

        ÄndraAgentKnapp.setText("Ändra Agent");
        ÄndraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraAgentKnappActionPerformed(evt);
            }
        });

        jButton3.setText("Byt Lösenord");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TaBortAgent.setText("Ta bort agent");
        TaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAgentActionPerformed(evt);
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

        AndraAdminStatus.setText("Ny Admin");
        AndraAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraAdminStatusActionPerformed(evt);
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

        TaBortAlien.setText("Ta bort Alien");
        TaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaBortAlienActionPerformed(evt);
            }
        });

        AndraKontorschef.setText("Ändra kontorschef");
        AndraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraKontorschefActionPerformed(evt);
            }
        });

        AndraOmrådeschef.setText("Ändra områdeschef");
        AndraOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraOmrådeschefActionPerformed(evt);
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

        Omradetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmradetextActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Område");

        Kontorscheftext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KontorscheftextActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AgentID");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AgentID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ÄndraAlienKnapp1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ÄndraAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AIDadmintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AndraAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Omradetext, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(AndraOmradescheftext)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(AndraOmrådeschef))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kontorscheftext, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TaBortAlienText)
                            .addComponent(TaBortAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TaBortAgenttext)
                            .addComponent(TaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SokPåAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TaBortUtrustningtext)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NyAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NyAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ÄndraAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(TaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SokPåAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UtrustningKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ÄndraAlienKnapp1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AndraOmradescheftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Kontorscheftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Omradetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AndraOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AIDadmintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AndraAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(GaTillbakaKnapp)
                .addGap(21, 21, 21))
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

    private void NyAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NyAlienActionPerformed
        NyAlien NY = new NyAlien(idb, agentId);
        NY.setVisible(true);

        dispose();
    }//GEN-LAST:event_NyAlienActionPerformed

    private void ÄndraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAgentKnappActionPerformed
        AndraAgent AA = new AndraAgent(idb, agentId);
        AA.setVisible(true);

        dispose();
    }//GEN-LAST:event_ÄndraAgentKnappActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BytLosenordAgent BLA = new BytLosenordAgent(idb, agentId);
        BLA.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    
    /**
     * Denna metod används för att hantera händelsen när knappen "TaBortAgent"
     * klickas. Metoden tar bort en agent från databasen. Om agent-ID inte
     * anges, visas ett felmeddelande. Om agenten inte finns eller om den
     * inloggade agenten försöker ta bort sig själv, visas ett felmeddelande.
     * Annars tas agenten bort från databasen och en bekräftelse visas.
     */
    private void TaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaBortAgentActionPerformed

        try {
            // Hämta agent-ID från fältet TaBortAgenttext
            String agentID = TaBortAgenttext.getText();

            // Konvertera den inloggade agentens ID till sträng
            String ID = Integer.toString(agentId);
            String CheckaID = "SELECT Agent_ID FROM agent where Agent_ID = '" + agentID + "'";

            // Om agent-ID inte anges
            if (agentID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ange Agent ID att ta bort.");

            } //int confirm = JOptionPane.showConfirmDialog(this, "Är du säker på att du vill ta bort agenten med ID: " + agentID + "?.", JOptionPane.YES_NO_OPTION)
            // Om agenten inte finns i databasen
            else if (idb.fetchSingle(CheckaID) == null) {
                JOptionPane.showMessageDialog(this, "Finns ingen Agent med detta ID.");

            } // Om den inloggade agenten försöker ta bort sig själv
            else if (agentID.equals(ID)) {
                JOptionPane.showMessageDialog(this, "Du kan inte ta bort den inloggade agenten.");

            } 
            else {

                String TabortAgent = "DELETE FROM agent WHERE Agent_ID = '" + agentID + "'";
                idb.delete(TabortAgent); // Ta bort agenten från database

                JOptionPane.showMessageDialog(this, "Agent med Agent ID " + agentID + "har tagits bort.");

                TaBortAgenttext.setText(""); // Rensa fältet TaBortAgenttext

            }
        } catch (InfException ex) {

        }

    }//GEN-LAST:event_TaBortAgentActionPerformed

    
    
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

    
    /**
     * Denna metod används för att hantera händelsen när knappen
     * "AndraAdminStatus" klickas. Metoden ändrar administratörsstatusen för en
     * agent. Om agenten inte finns eller om den inloggade agenten försöker
     * ändra sin egen status, visas ett felmeddelande. Annars uppdateras
     * administratörsstatusen och en bekräftelse visas.
     */
    private void AndraAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraAdminStatusActionPerformed

        if (Validering.textFaltIfyllt(AIDadmintxt)) { // Kontrollera att fältet AIDadmintxt är ifyllt
            try {
                String AID = AIDadmintxt.getText(); // Hämta agent-ID från fältet AIDadmintxt
                String CheckaStatus = "SELECT Administrator FROM agent WHERE Agent_ID = '" + AID + "'"; // Skapa SQL-fråga för att kontrollera nuvarande administratörsstatus
                String AdminStatus = idb.fetchSingle(CheckaStatus); // Hämta administratörsstatus för agenten
                String CheckaID = "SELECT Agent_ID FROM agent where Agent_ID = '" + AID + "'"; // Skapa SQL-fråga för att kontrollera om agenten finns
                String agent_ID = Integer.toString(agentId); // Konvertera den inloggade agentens ID till sträng

                if (idb.fetchSingle(CheckaID) == null) { 
                    // Om agent-ID inte finns i databasen
                    JOptionPane.showMessageDialog(this, "Finns ingen agent med detta ID");
                }
                if (AID.equals(agent_ID)) {
                    // Om den inloggade agenten försöker ändra sin egen status
                    JOptionPane.showMessageDialog(this, "Du kan inte ändra status på den inloggade agenten.");
                }

                // Om administratörsstatusen är satt till "J"
                if (AdminStatus.equals("J")) {

                    String uptdStatus = "UPDATE agent SET Administrator = 'N' WHERE Agent_ID = '" + AID + "'";
                    idb.update(uptdStatus); // Uppdatera administratörsstatusen i databasen
                    JOptionPane.showMessageDialog(this, "Du har tagit bort administratörstatus från Agent : '" + AID + "'");
                }
                // Om administratörsstatusen är satt till "N"
                if (AdminStatus.equals("N")) {
                    String uptdStatus = "UPDATE agent SET Administrator = 'J' WHERE Agent_ID = '" + AID + "'";
                    idb.update(uptdStatus); // Uppdatera administratörsstatusen i databasen
                    JOptionPane.showMessageDialog(this, "Agent : '" + AID + "' är nu administratör");
                }

            } catch (InfException ex) {

            }
        }

    }//GEN-LAST:event_AndraAdminStatusActionPerformed

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        LogInAdmin LIA = new LogInAdmin(idb);
        LIA.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void ÄndraAlienKnapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraAlienKnapp1ActionPerformed
        AndraAlienAdmin AAA = new AndraAlienAdmin(idb, agentId);
        AAA.setVisible(true);
        dispose();
    }//GEN-LAST:event_ÄndraAlienKnapp1ActionPerformed

    
    /**
     * Denna metod används för att hantera händelsen när knappen "TaBortAlien"
     * klickas. Metoden försöker ta bort den angivna alienen från databasen. Om
     * alienen finns och tas bort visas en bekräftelse. Om det uppstår ett
     * undantag eller om alienen inte finns visas ett felmeddelande.
     */
    private void TaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaBortAlienActionPerformed
        
        if (Validering.textFaltIfyllt(TaBortAlienText)) {

            try {
                // Hämta värdet för alien ID från textfält
                String alienID = TaBortAlienText.getText();
                
                // Skapa och utför SQL-frågan för att kontrollera om alienen finns
                String CheckaID = "SELECT Alien_ID FROM agent where Alien_ID = '" + alienID + "'";

                //int confirm = JOptionPane.showConfirmDialog(this, "Är du säker på att du vill ta bort agenten med ID: " + agentID + "?.", JOptionPane.YES_NO_OPTION)
                if (idb.fetchSingle(CheckaID) == null) {
                    // Visa meddelande om alienen inte finns
                    JOptionPane.showMessageDialog(this, "Finns ingen Alien med detta ID.");

                } else {
                    // Skapa och utför SQL-frågan för att ta bort alienen
                    String fraga = "DELETE FROM alien WHERE Alien_ID = '" + alienID + "'";
                    idb.delete(fraga);

                    // Visa bekräftelsemeddelande
                    JOptionPane.showMessageDialog(this, "Alien med alien ID " + alienID + "har tagits bort.");

                    TaBortAgenttext.setText("");

                }
            } catch (InfException ex) {

            }
        }
    }//GEN-LAST:event_TaBortAlienActionPerformed

    
    /**
     * Denna metod används för att hantera händelsen när knappen
     * "AndraKontorschef" klickas. Metoden försöker uppdatera kontorschefen för
     * det angivna kontoret. Om uppdateringen lyckas visas en
     * bekräftelsemeddelande. Om det uppstår ett undantag visas ett
     * felmeddelande.
     */
    private void AndraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraKontorschefActionPerformed
        try {
            // Hämta värdet för kontorschef från textfält
            
            String Kontorschef = Kontorscheftext.getText();
            // Skapa och utför SQL-frågan för att uppdatera kontorschefen
            String UppdateraChef = "UPDATE kontorschef SET Agent_ID = '" + Kontorschef + "'WHERE Kontorsbeteckning = 'Örebrokontoret'";
            idb.fetchSingle(UppdateraChef);
            
            // Visa bekräftelsemeddelande
            JOptionPane.showMessageDialog(this, "Kontorschef är uppdaterad till : " + Kontorschef);
            
        } catch (InfException ex) {
            // Visa felmeddelande om något går fel
            Logger.getLogger(AndraAlien.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Något gick fel, var god och skriv in ett korrekt ID");
        }
    }//GEN-LAST:event_AndraKontorschefActionPerformed

    
    /**
     * Denna metod används för att hantera händelsen när knappen
     * "AndraOmrådeschef" klickas. Metoden försöker uppdatera områdeschefen med
     * den angivna informationen. Om uppdateringen lyckas visas en
     * bekräftelsemeddelande. Om det uppstår ett undantag visas ett
     * felmeddelande.
     */
    private void AndraOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraOmrådeschefActionPerformed
        try {
            // Hämta värdet för områdeschef och område från textfält
            String OmradesChef = AndraOmradescheftext.getText();
            String Omrade = Omradetext.getText();
            
            // Skapa och utför SQL-frågan för att uppdatera områdeschefen
            String uptdOmradeChef = "UPDATE omradeschef SET Agent_ID = '" + OmradesChef + "' WHERE Omrade = '" + Omrade + "'";
            idb.fetchSingle(uptdOmradeChef);
            
            // Visa bekräftelsemeddelande
            JOptionPane.showMessageDialog(this, "Områdeschef är uppdaterad till : " + OmradesChef);

        } catch (InfException ex) {
            // Visa felmeddelande om något går fel
            JOptionPane.showMessageDialog(this, "Kontrollera så att information är korrekt");
        }
    }//GEN-LAST:event_AndraOmrådeschefActionPerformed

    private void AndraOmradescheftextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraOmradescheftextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AndraOmradescheftextActionPerformed

    private void OmradetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmradetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OmradetextActionPerformed

    private void KontorscheftextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KontorscheftextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KontorscheftextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AIDadmintxt;
    private javax.swing.JButton AndraAdminStatus;
    private javax.swing.JButton AndraKontorschef;
    private javax.swing.JTextField AndraOmradescheftext;
    private javax.swing.JButton AndraOmrådeschef;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JTextField Kontorscheftext;
    private javax.swing.JButton NyAgent;
    private javax.swing.JButton NyAlien;
    private javax.swing.JTextField Omradetext;
    private javax.swing.JButton SokPåAlien;
    private javax.swing.JButton TaBortAgent;
    private javax.swing.JTextField TaBortAgenttext;
    private javax.swing.JButton TaBortAlien;
    private javax.swing.JTextField TaBortAlienText;
    private javax.swing.JTextField TaBortUtrustningtext;
    private javax.swing.JButton UtrustningKnapp;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ÄndraAgentKnapp;
    private javax.swing.JButton ÄndraAlienKnapp1;
    // End of variables declaration//GEN-END:variables
}
