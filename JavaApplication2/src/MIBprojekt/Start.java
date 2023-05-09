/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MIBprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filip, maximilian, anton
 */
public class Start {
    
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
        
        new LogInFonster(idb).setVisible(true);
        
        try {
            idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
            
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
     
        }
    }
    
}
