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
public class AlienInfo extends javax.swing.JFrame {

    private InfDB idb;
    private int agentId;

    /**
     * Creates new form AlienInfo
     */
    public AlienInfo(InfDB idb, int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        Omrade.setModel(new DefaultComboBoxModel<>(new String[]{"Välj Område", "Örebro", "Västerås", "Vilhelmina", "Borås"}));
        Omrade.setBounds(20, 20, 150, 30);

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
        Omrade = new javax.swing.JComboBox<>();
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

        Omrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Omrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OmradeItemStateChanged(evt);
            }
        });
        Omrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmradeActionPerformed(evt);
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
                            .addComponent(Omrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(Omrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void OmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmradeActionPerformed
        /*JComboBox<String> areaComboBox = new JComboBox<>();
        areaComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Örebro", "Västerås", "Borås", "Vilhelmina"}));
        areaComboBox.setBounds(20, 20, 150, 30);
        jPanel1.add(areaComboBox);*/
    }//GEN-LAST:event_OmradeActionPerformed


    private void OmradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OmradeItemStateChanged
        //Metoden börjar med en "if" sats som kontrollerar vilket object som valts i ComboBoxen

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            try {
                //"valtOmråde" blir en lokal variabel för det område som står i ComboBoxen

                String valtOmrade = (String) Omrade.getSelectedItem();

                //Uppbyggnaden av SQL fråga som kör in Sringen "valtOmrade" och vad vi vill få ut för data från tabellen
                String fraga = "SELECT Namn, Epost, Alien_ID, Registreringsdatum, Ansvarig_Agent, Telefon FROM alien JOIN Plats on alien.`Plats` = plats.`Plats_ID` WHERE Benamning = '" + valtOmrade + "'";

                //Här körs SQL frågan i databasen och tar in datan och värden i en ArrayList av Hashmap. 
                //Varje HashMap representerar en rad där nyckeln är kolumnernas namn i SQL-frågan
                // och värderna som är kolumnernas värde (Det som står i kolumnerna)
                ArrayList<HashMap<String, String>> alienInfoList = idb.fetchRows(fraga);

                //Detta ser till att ingeting står i rutan när vi öppnar sidan för att välja område
                AlienNamnTextArea.setText("");

                //Detta är iteration för "for" loopen för varje rad i HashMapen "alienInfoList"
                for (HashMap<String, String> alienInfoMap : alienInfoList) {

                    // Dessa statesment hämtar varje värde i HashMapen, 
                    //som man ser så hämtar den värderna från varje kolumn som vi vill ha info ifrån i SQL frågan
                    String namn = alienInfoMap.get("Namn");
                    String epost = alienInfoMap.get("Epost");
                    String AlienID = alienInfoMap.get("Alien_ID");
                    String RegDat = alienInfoMap.get("Registreringsdatum");
                    String agent = alienInfoMap.get("Ansvarig_Agent");
                    String Tel = alienInfoMap.get("Telefon");
                    //Här så användar vi en "append" metod för att sätta in värderna i text-rutan 
                    //("\n" betyder "enter" på tangentbordet, man går neråt i rad)

                    AlienNamnTextArea.append("Namn: " + namn + "\n");
                    AlienNamnTextArea.append("Epost: " + epost + "\n");
                    AlienNamnTextArea.append("Telefon: " + Tel + "\n");
                    AlienNamnTextArea.append("Alien ID: " + AlienID + "\n");
                    AlienNamnTextArea.append("Reg. Datum: " + RegDat + "\n");
                    AlienNamnTextArea.append("Ansvarig Agent: " + agent + "\n");
                    AlienNamnTextArea.append("\n");

                }
            } catch (InfException ex) {
                Logger.getLogger(AlienInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_OmradeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AlienNamnTextArea;
    private javax.swing.JLabel Bilden;
    private javax.swing.JButton GaTillbakaKnapp;
    private javax.swing.JComboBox<String> Omrade;
    private javax.swing.JScrollPane Scrollpane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
