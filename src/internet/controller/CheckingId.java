/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet.controller;

import internet.models.DbUtility;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kylin
 */
public class CheckingId {
    private DbUtility dbUtility;
    public String checkDuplicated(String id,String tableName,String col) throws SQLException{
        String result = null;
        dbUtility = new DbUtility();
        String sql = "SELECT * FROM tblmodule";
        try {
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  result = rs.getString(1);
                
            }
            
        }finally{
            if(!dbUtility.getConnection().isClosed()){
                dbUtility.closeConnection();
            }
        }
       return result;
    }
    
    public static void main(String[] args) {
        String st = null;
        try {
            st = new CheckingId().checkDuplicated("M-001","tblmodule", "mid");
        } catch (SQLException ex) {
            Logger.getLogger(CheckingId.class.getName()).log(Level.SEVERE, null, ex);
        }
        String fixed = "M-001";
        if(st.equals(fixed)){
            JOptionPane.showMessageDialog(null, "Duplicated");
        }
    }
}
