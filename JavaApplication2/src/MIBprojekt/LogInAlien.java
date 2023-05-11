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
public class LogInAlien extends javax.swing.JFrame {
    private InfDB idb;
    //private int alienId;

    /**
     * Creates new form LogInAlien
     */
    public LogInAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        //this.alienId = alienId;
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
        AnvNamnAlien = new javax.swing.JTextField();
        AnvLabel = new javax.swing.JLabel();
        AnvLabel1 = new javax.swing.JLabel();
        LosenAlien = new javax.swing.JPasswordField();
        LoggaInAlien = new javax.swing.JButton();
        GaTillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        AnvNamnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnvNamnAlienActionPerformed(evt);
            }
        });

        AnvLabel.setForeground(new java.awt.Color(255, 255, 255));
        AnvLabel.setText("Epost");

        AnvLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AnvLabel1.setText("Lösenord");

        LosenAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LosenAlienActionPerformed(evt);
            }
        });

        LoggaInAlien.setText("Logga In");
        LoggaInAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaInAlienActionPerformed(evt);
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
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnvLabel1)
                        .addGap(401, 401, 401))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LosenAlien)
                            .addComponent(AnvNamnAlien)
                            .addComponent(LoggaInAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AnvLabel)
                        .addGap(412, 412, 412))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnvLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AnvNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AnvLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LoggaInAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GaTillbakaKnapp)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void AnvNamnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnvNamnAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnvNamnAlienActionPerformed

    private void LosenAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LosenAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LosenAlienActionPerformed

    //Logga in knapp Alien
    private void LoggaInAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaInAlienActionPerformed
        /*AlienMeny AM = new AlienMeny(idb);
        AM.setVisible(true);
        
        dispose();'*/
        try {
            String Epost = AnvNamnAlien.getText();
            String Losen = new String(LosenAlien.getPassword());
            String alienID = idb.fetchSingle("SELECT Alien_ID FROM Alien WHERE Epost = '"+Epost+"' AND Losenord = '"+Losen+"'");

            if (alienID != null) {
                int alienId = Integer.parseInt(alienID);
                AlienMeny AM = new AlienMeny(idb, alienId);
                AM.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Felaktig e-postadress eller lösenord.", "Fel", JOptionPane.ERROR_MESSAGE);
                AnvNamnAlien.setText("");
                LosenAlien.setText("");
                AnvNamnAlien.requestFocus();
            }
        } catch (InfException ex) {

        } 
    }//GEN-LAST:event_LoggaInAlienActionPerformed

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        AlienEllerAgent AEA = new AlienEllerAgent(idb);
        AEA.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnvLabel;
    private javax.swing.JLabel AnvLabel1;
    private javax.swing.JTextField AnvNamnAlien;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JButton LoggaInAlien;
    private javax.swing.JPasswordField LosenAlien;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
