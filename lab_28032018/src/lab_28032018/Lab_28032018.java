/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_28032018;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wannaphong
 */
public class Lab_28032018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SQLiteTest sql = new SQLiteTest();
        try {
            sql.addUser("วรรณพงษ์", "ภัททิยไพบูลย์");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Lab_28032018.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
