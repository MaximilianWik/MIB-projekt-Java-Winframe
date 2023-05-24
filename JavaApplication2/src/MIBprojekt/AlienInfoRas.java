/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIBprojekt;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victus
 */
public class AlienInfoRas extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;

    /**
     * Creates new form AlienInfo
     */
    public AlienInfoRas(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Ras.setModel(new DefaultComboBoxModel<>(new String[]{"Välj Ras", "worm", "squid", "boglodite"}));
        Ras.setBounds(20, 20, 150, 30);

        AlienNamnTextArea.setEditable(false);
        Scrollpane.setBounds(20, 70, 280, 300);

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
        GaTillbakaKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Ras = new javax.swing.JComboBox<>();
        Scrollpane = new javax.swing.JScrollPane();
        AlienNamnTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bilden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MIBprojekt/Ikoner/men-in-black-2-logo.png"))); // NOI18N

        GaTillbakaKnapp.setText("Gå tillbaka");
        GaTillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaTillbakaKnappActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gör en tabell här med selectfråga som visar AlienID, område/plats, datum och ras");

        Ras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Ras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RasItemStateChanged(evt);
            }
        });
        Ras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RasActionPerformed(evt);
            }
        });

        AlienNamnTextArea.setColumns(20);
        AlienNamnTextArea.setRows(5);
        Scrollpane.setViewportView(AlienNamnTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GaTillbakaKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(Ras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(Scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bilden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(GaTillbakaKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(103, Short.MAX_VALUE))
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

    private void GaTillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaTillbakaKnappActionPerformed
        AgentMeny AM = new AgentMeny(idb, agentId);
        AM.setVisible(true);

        dispose();
    }//GEN-LAST:event_GaTillbakaKnappActionPerformed

    private void RasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RasActionPerformed
        /*JComboBox<String> areaComboBox = new JComboBox<>();
        areaComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Örebro", "Västerås", "Borås", "Vilhelmina"}));
        areaComboBox.setBounds(20, 20, 150, 30);
        jPanel1.add(areaComboBox);*/
    }//GEN-LAST:event_RasActionPerformed

    /**
     * Denna metod används för att hantera händelsen när en ras väljs i en
     * ComboBox. Metoden kontrollerar vilken ras som har valts och utför en
     * SQL-fråga för att hämta information om aliens av den valda rasen.
     * Informationen visas sedan i en textkomponent för användaren. Om det
     * uppstår något fel under databasåtkomst loggas felmeddelandet.
     */
    private void RasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RasItemStateChanged
        // Kontrollera om ett objekt har valts i ComboBoxen
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            try {
                // Hämta den valda rasen från ComboBoxen
                String valdRas = (String) Ras.getSelectedItem();

                // Bygg upp SQL-frågan för att hämta alien-information baserat på vald ras
                String fraga = "SELECT Namn, Epost, Registreringsdatum, Telefon FROM alien JOIN " + valdRas + " ON alien.`Alien_ID` = " + valdRas + ".`Alien_ID`";
                System.out.println(fraga);
                
                // Hämta alien-information från databasen
                ArrayList<HashMap<String, String>> alienInfo = idb.fetchRows(fraga);

                // Visa alien-informationen i textkomponenten
                for (HashMap<String, String> alienInfoMap : alienInfo) {

                    String namn = alienInfoMap.get("Namn");
                    String epost = alienInfoMap.get("Epost");
                    String RegDat = alienInfoMap.get("Registreringsdatum");
                    String Tel = alienInfoMap.get("Telefon");

                    AlienNamnTextArea.append("Namn: " + namn + "\n");
                    AlienNamnTextArea.append("Epost: " + epost + "\n");
                    AlienNamnTextArea.append("Telefon: " + Tel + "\n");
                    AlienNamnTextArea.append("Reg. Datum: " + RegDat + "\n");
                    AlienNamnTextArea.append("\n");

                }
            } catch (InfException ex) {
                Logger.getLogger(AlienInfoRas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_RasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlienNamnTextArea;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JComboBox<String> Ras;
    private javax.swing.JScrollPane Scrollpane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
