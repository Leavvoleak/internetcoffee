/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kylin
 */
public class DbUtility {
    
    private static final String Driver ="com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/internetcoffe";
    private static final String PASSWORD = "";
    
    private Connection con;
    
    boolean isconnect =false;
    public Connection getConnection(){
        
        try{
            
            Class.forName(Driver);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected...");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }           
        return con;
    }
    public boolean isConnected(){
        
         try{
            
            Class.forName(Driver);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            isconnect = true;
            System.out.println("Connected...");
            return isconnect;
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
         return isconnect;
    }
   
    public void closeConnection() throws SQLException{
        con.close();
    }
    
}
