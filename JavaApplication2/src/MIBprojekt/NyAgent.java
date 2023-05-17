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
public class NyAgent extends javax.swing.JFrame {
    private InfDB idb;
    private int agentId;

    /**
     * Creates new form NyAlien
     */
    public NyAgent(InfDB idb, int agentId) {
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
        Teltext = new javax.swing.JTextField();
        AgentIDtext = new javax.swing.JTextField();
        Namntext = new javax.swing.JTextField();
        AnstallDatum = new javax.swing.JTextField();
        Registreringsdatum = new javax.swing.JLabel();
        AlienID = new javax.swing.JLabel();
        Epost = new javax.swing.JLabel();
        Lösenord = new javax.swing.JLabel();
        Namn = new javax.swing.JLabel();
        Telefon = new javax.swing.JLabel();
        Plats = new javax.swing.JLabel();
        AnsvarigAgentID = new javax.swing.JLabel();
        Områdetext = new javax.swing.JTextField();
        Losentext = new javax.swing.JTextField();
        Admintext = new javax.swing.JTextField();
        LäggTillAagentKnapp = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();
        Eposttxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        Teltext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeltextActionPerformed(evt);
            }
        });

        Namntext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamntextActionPerformed(evt);
            }
        });

        AnstallDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnstallDatumActionPerformed(evt);
            }
        });

        Registreringsdatum.setForeground(new java.awt.Color(255, 255, 255));
        Registreringsdatum.setText("Namn");

        AlienID.setForeground(new java.awt.Color(255, 255, 255));
        AlienID.setText("AgentID");

        Epost.setForeground(new java.awt.Color(255, 255, 255));
        Epost.setText("Telefon");

        Lösenord.setForeground(new java.awt.Color(255, 255, 255));
        Lösenord.setText("Anställnings Datum");

        Namn.setForeground(new java.awt.Color(255, 255, 255));
        Namn.setText("Administratör");

        Telefon.setForeground(new java.awt.Color(255, 255, 255));
        Telefon.setText("Epost");

        Plats.setForeground(new java.awt.Color(255, 255, 255));
        Plats.setText("Lösenord");

        AnsvarigAgentID.setForeground(new java.awt.Color(255, 255, 255));
        AnsvarigAgentID.setText("Område");

        Områdetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmrådetextActionPerformed(evt);
            }
        });

        LäggTillAagentKnapp.setText("Lägg till Agent");
        LäggTillAagentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LäggTillAagentKnappActionPerformed(evt);
            }
        });

        GaTillbakaKnapp.setText("Gå tillbaka");
        GaTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaTillbakaKnappActionPerformed(evt);
            }
        });

        Eposttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EposttxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Admintext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Eposttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Losentext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Områdetext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Plats, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AnsvarigAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LäggTillAagentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AgentIDtext)
                            .addComponent(AlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Registreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(Namntext, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Teltext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AnstallDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Epost, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(AlienID)
                    .addComponent(Epost)
                    .addComponent(Lösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Teltext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgentIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namntext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnstallDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefon)
                    .addComponent(Namn)
                    .addComponent(Plats)
                    .addComponent(AnsvarigAgentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Losentext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admintext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Områdetext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eposttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(LäggTillAagentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GaTillbakaKnapp)
                .addGap(15, 15, 15))
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

    private void AnstallDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnstallDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnstallDatumActionPerformed

    private void OmrådetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmrådetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OmrådetextActionPerformed

    private void NamntextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamntextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamntextActionPerformed

    private void TeltextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeltextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeltextActionPerformed

    //LäggTillAlienKnapp 
    private void LäggTillAagentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LäggTillAagentKnappActionPerformed
        // TODO add your handling code here:
         
        laggTillNyAgent();
         
    }//GEN-LAST:event_LäggTillAagentKnappActionPerformed
        //Om finns tid, försöka generera epost istället för att skriva in.
    
    private void laggTillNyAgent() {
        
        try {
            String AID = AgentIDtext.getText();
            String namn = Namntext.getText();
            String Tel = Teltext.getText();
            String AnsDat = AnstallDatum.getText();
            String Admin = Admintext.getText();
            String epost = Eposttxt.getText();
            String Losen = Losentext.getText();
            String Omrade = Områdetext.getText();
            
            String checkaEpost = "SELECT Epost FROM agent WHERE Epost = '" + epost + "'";
            
            if(idb.fetchSingle(checkaEpost)!= null){
                
            JOptionPane.showMessageDialog(this, "Epost existerar redan! Var vänlig slå in en ny!");
            return;
            
            }
            
            String fraga = "INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Epost, Losenord, Omrade) VALUES ('" + AID + "', '" + namn + "', '" + Tel + "', '" + AnsDat + "', '" + Admin + "', '" + epost + "', '" + Losen + "', '" + Omrade + "')";
              idb.insert(fraga);
            JOptionPane.showMessageDialog(this, "Ny Agent har lagts till!");
            AgentIDtext.setText("");
            Namntext.setText("");
            Teltext.setText("");
            AnstallDatum.setText("");
            Admintext.setText("");
            Eposttxt.setText("");
            Losentext.setText("");
            Områdetext.setText("");
            AgentIDtext.requestFocus();    
      
        } catch (InfException ex) {
            
            Logger.getLogger(NyAgent.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Finns redan en Agent med detta ID");
        }
        
    }   
    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        AdminMeny AM = new AdminMeny(idb, agentId);
        AM.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void EposttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EposttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EposttxtActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admintext;
    private javax.swing.JTextField AgentIDtext;
    private javax.swing.JLabel AlienID;
    private javax.swing.JTextField AnstallDatum;
    private javax.swing.JLabel AnsvarigAgentID;
    private javax.swing.JLabel Bilden;
    private javax.swing.JLabel Epost;
    private javax.swing.JTextField Eposttxt;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JTextField Losentext;
    private javax.swing.JButton LäggTillAagentKnapp;
    private javax.swing.JLabel Lösenord;
    private javax.swing.JLabel Namn;
    private javax.swing.JTextField Namntext;
    private javax.swing.JTextField Områdetext;
    private javax.swing.JLabel Plats;
    private javax.swing.JLabel Registreringsdatum;
    private javax.swing.JLabel Telefon;
    private javax.swing.JTextField Teltext;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
