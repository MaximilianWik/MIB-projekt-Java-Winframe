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
public class Validering {
    



 public static boolean textFaltIfyllt (JTextField rutaAttKolla){
    boolean resultat = true;

    if (rutaAttKolla.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Rutan är tom, var vänlig och skriv in nåpgot i rutan");
    resultat= false;
    rutaAttKolla.requestFocus();
    }

return resultat;
}
 public static boolean CheckaRas (JTextField RasRuta){
     boolean resultat = true;
     
     return resultat;
 }
 
}