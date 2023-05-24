/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIBprojekt;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author filip
 */

/**
 * En hjälpklass för validering av användarinput.
 */
public class Validering {

    
    /**
     * Kontrollerar om en textfält är ifyllt.
     * Om textfältet är tomt, visas ett felmeddelande och fokus sätts på textfältet.
     * @param rutaAttKolla textfältet som ska kontrolleras
     * @return true om textfältet är ifyllt, annars false
     */
    
    public static boolean textFaltIfyllt(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) { // Om textfältet är tomt
            JOptionPane.showMessageDialog(null, "Rutan är tom, var vänlig och skriv in nåpgot i rutan");
            resultat = false;
            rutaAttKolla.requestFocus(); // Sätter fokus på textfältet
        }

        return resultat;
    }

    public static boolean CheckaRas(JTextField RasRuta) {
        boolean resultat = true;

        return resultat;
    }

}
