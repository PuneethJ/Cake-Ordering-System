/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foody;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Winston
 */
public class SqlConnection {
     public static Connection Connector(){
        try {
            String s ="jdbc:mysql://localhost:3306/foody1?zeroDateTimeBehavior=convertToNull";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection(s, "root","Yash@123");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" "+e);
          return null;   
          
        }
        
    }
}
