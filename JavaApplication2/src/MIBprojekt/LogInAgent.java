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
public class LogInAgent extends javax.swing.JFrame {
    
    public static InfDB idb;

    /**
     * Creates new form LogInAgent
     */
    public LogInAgent(InfDB idb) {
        initComponents();
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
        Bilden1 = new javax.swing.JLabel();
        AnvNamnAgent = new javax.swing.JTextField();
        AnvLabel2 = new javax.swing.JLabel();
        AnvLabel3 = new javax.swing.JLabel();
        LosenAgent = new javax.swing.JPasswordField();
        LoggaInAgent = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        AnvNamnAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnvNamnAgentActionPerformed(evt);
            }
        });

        AnvLabel2.setForeground(new java.awt.Color(255, 255, 255));
        AnvLabel2.setText("Epost");

        AnvLabel3.setForeground(new java.awt.Color(255, 255, 255));
        AnvLabel3.setText("Lösenord");

        LosenAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LosenAgentActionPerformed(evt);
            }
        });

        LoggaInAgent.setText("Logga In");
        LoggaInAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaInAgentActionPerformed(evt);
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
                .addComponent(Bilden1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnvLabel3)
                        .addGap(401, 401, 401))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LosenAgent)
                            .addComponent(AnvNamnAgent)
                            .addComponent(LoggaInAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnvLabel2)
                        .addGap(411, 411, 411))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnvLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AnvNamnAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnvLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LosenAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LoggaInAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GaTillbakaKnapp)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnvNamnAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnvNamnAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnvNamnAgentActionPerformed

    private void LosenAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LosenAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LosenAgentActionPerformed

    
    //Logga in knapp
    private void LoggaInAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaInAgentActionPerformed
               /* AgentMeny AM = new AgentMeny();
                AM.setVisible(true);
                dispose();
        */
        try {
            String Epost = AnvNamnAgent.getText();
            String Losen = new String(LosenAgent.getPassword());
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Epost = '"+Epost+"' AND Losenord = '"+Losen+"'");

            if (agentID != null) {
                int agentId = Integer.parseInt(agentID);
                AgentMeny AM = new AgentMeny(idb);
                AM.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Felaktig e-postadress eller lösenord.", "Fel", JOptionPane.ERROR_MESSAGE);
                AnvNamnAgent.setText("");
                LosenAgent.setText("");
                AnvNamnAgent.requestFocus();
            }
        } catch (InfException ex) {

        } 
    }//GEN-LAST:event_LoggaInAgentActionPerformed

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        AlienEllerAgent AEA = new AlienEllerAgent(idb);
        AEA.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnvLabel2;
    private javax.swing.JLabel AnvLabel3;
    private javax.swing.JTextField AnvNamnAgent;
    private javax.swing.JLabel Bilden1;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JButton LoggaInAgent;
    private javax.swing.JPasswordField LosenAgent;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
