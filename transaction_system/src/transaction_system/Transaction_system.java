/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction_system;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Edris
 */
public class Transaction_system {

    /**
     * @param args the command line arguments
     */
    Connection con = null;
    Statement state = null;
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        try
        {
            con = dbConnect.connect();
            Home Home = new Home();
            Home.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
    
}
