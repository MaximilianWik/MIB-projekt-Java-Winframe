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
public class AndraAlienAdmin extends javax.swing.JFrame {
    private InfDB idb;
    private int agentId;

    /**
     * Creates new form AndraAlien
     */
    public AndraAlienAdmin(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
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
        andraAlienIDtext = new javax.swing.JTextField();
        Registreringsdatum = new javax.swing.JLabel();
        Namn = new javax.swing.JLabel();
        Telefon = new javax.swing.JLabel();
        Plats = new javax.swing.JLabel();
        AnsvarigAgentID = new javax.swing.JLabel();
        andraAnsvarigAgentIDtext = new javax.swing.JTextField();
        andraPlatstext = new javax.swing.JTextField();
        andraRastext = new javax.swing.JTextField();
        andraNamntext = new javax.swing.JTextField();
        Andratext = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();
        andraTelefontext1 = new javax.swing.JTextField();
        Ras = new javax.swing.JLabel();
        andraRegistreringsdatumtext1 = new javax.swing.JTextField();
        Registreringsdatum1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        andraAlienIDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAlienIDtextActionPerformed(evt);
            }
        });

        Registreringsdatum.setForeground(new java.awt.Color(255, 255, 255));
        Registreringsdatum.setText("Registreringsdatum");

        Namn.setForeground(new java.awt.Color(255, 255, 255));
        Namn.setText("Namn");

        Telefon.setForeground(new java.awt.Color(255, 255, 255));
        Telefon.setText("Telefon");

        Plats.setForeground(new java.awt.Color(255, 255, 255));
        Plats.setText("Plats");

        AnsvarigAgentID.setForeground(new java.awt.Color(255, 255, 255));
        AnsvarigAgentID.setText("Ansvarig AgentID");

        andraAnsvarigAgentIDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAnsvarigAgentIDtextActionPerformed(evt);
            }
        });

        Andratext.setText("Ändra");
        Andratext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndratextActionPerformed(evt);
            }
        });

        GaTillbakaKnapp.setText("Gå tillbaka");
        GaTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaTillbakaKnappActionPerformed(evt);
            }
        });

        Ras.setForeground(new java.awt.Color(255, 255, 255));
        Ras.setText("Ras");

        andraRegistreringsdatumtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraRegistreringsdatumtext1ActionPerformed(evt);
            }
        });

        Registreringsdatum1.setForeground(new java.awt.Color(255, 255, 255));
        Registreringsdatum1.setText("Alien ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(andraNamntext)
                            .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(andraTelefontext1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(andraPlatstext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(andraAnsvarigAgentIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plats, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AnsvarigAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Andratext, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Registreringsdatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Registreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(andraAlienIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(andraRegistreringsdatumtext1)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(andraRastext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Ras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registreringsdatum)
                    .addComponent(Ras)
                    .addComponent(Registreringsdatum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraAlienIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraRastext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraRegistreringsdatumtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefon)
                    .addComponent(Namn)
                    .addComponent(Plats)
                    .addComponent(AnsvarigAgentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraPlatstext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraNamntext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraAnsvarigAgentIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraTelefontext1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Andratext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GaTillbakaKnapp)
                .addContainerGap(86, Short.MAX_VALUE))
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

    private void andraAlienIDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAlienIDtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraAlienIDtextActionPerformed

    private void andraAnsvarigAgentIDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAnsvarigAgentIDtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraAnsvarigAgentIDtextActionPerformed

    private void AndratextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndratextActionPerformed
        String AID = andraAlienIDtext.getText();
        String RegDatum = andraRegistreringsdatumtext1.getText();
        String Ras = andraRastext.getText();
        String namn = andraNamntext.getText();
        String telefon = andraTelefontext1.getText();
        String P = andraPlatstext.getText();
        String AA = andraAnsvarigAgentIDtext.getText();
        
        try {
            //Uppdaterar alien tabellen
             String uppdateraAlienQuery = "UPDATE alien SET Registreringsdatum = '" + RegDatum + "', Namn = '" + namn + "', Telefon = '" + telefon + "', Plats = '" + P + "', Ansvarig_Agent = '" + AA + "' WHERE Alien_ID = '" + AID + "'";
             idb.update(uppdateraAlienQuery);

             //Uppdaterar ras
             String uppdateraRasQuery = "";
                if (Ras.equals("Boglodite")) {
                    uppdateraRasQuery = "INSERT INTO boglodite (Alien_ID, Antal_Boogies) VALUES ('" + AID + "', 1) ON DUPLICATE KEY UPDATE Number_of_boglodites = Number_of_boglodites + 1";
                } else if (Ras.equals("Worm")) {
                     uppdateraRasQuery = "INSERT INTO worm (Alien_ID, Langd) VALUES ('" + AID + "', 5,4) ON DUPLICATE KEY UPDATE Number_of_worms = Number_of_worms + 1";
                } else if (Ras.equals("Squid")) {
                     uppdateraRasQuery = "INSERT INTO squid (Alien_ID, Antal_Armar) VALUES ('" + AID + "', 6) ON DUPLICATE KEY UPDATE Number_of_squids = Number_of_squids + 1";
                }
                
            idb.insert(uppdateraRasQuery);
            
            JOptionPane.showMessageDialog(null, "Alien information är uppdaterad");
            //Rensar alla fält
            andraAlienIDtext.setText("");
            andraRegistreringsdatumtext1.setText("");
            andraRastext.setText("");
            andraNamntext.setText("");
            andraTelefontext1.setText("");
            andraPlatstext.setText("");
            andraAlienIDtext.requestFocus();
            
            } catch (InfException ex) {
            Logger.getLogger(AndraAlienAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Något gick fel");
            //JOptionPane.showMessageDialog(null, "Lägg av");
            }   
    }//GEN-LAST:event_AndratextActionPerformed

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        AdminMeny AM = new AdminMeny(idb, agentId);
        AM.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void andraRegistreringsdatumtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraRegistreringsdatumtext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_andraRegistreringsdatumtext1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Andratext;
    private javax.swing.JLabel AnsvarigAgentID;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JLabel Namn;
    private javax.swing.JLabel Plats;
    private javax.swing.JLabel Ras;
    private javax.swing.JLabel Registreringsdatum;
    private javax.swing.JLabel Registreringsdatum1;
    private javax.swing.JLabel Telefon;
    private javax.swing.JTextField andraAlienIDtext;
    private javax.swing.JTextField andraAnsvarigAgentIDtext;
    private javax.swing.JTextField andraNamntext;
    private javax.swing.JTextField andraPlatstext;
    private javax.swing.JTextField andraRastext;
    private javax.swing.JTextField andraRegistreringsdatumtext1;
    private javax.swing.JTextField andraTelefontext1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
