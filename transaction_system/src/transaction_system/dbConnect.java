/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Edris
 */
public class dbConnect {
    public static Connection connect()
    {
        Connection con = null;
        Statement state = null;
        
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction_system?zeroDateTimeBehavior=convertToNull","root", "");
            state = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.print(e);
        }
        return con;
        
    }
}
