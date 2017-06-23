/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet.controller;

import internet.models.DbUtility;
import internet.models.TestDTO;
import java.sql.PreparedStatement;

/**
 *
 * @author Kylin
 */
public class TestDAO {
    
    public void insert(TestDTO dto){
        DbUtility dbUtility;
        String sql = "INSERT INTO tbl VALUES(?,?,?)";
        dbUtility = new DbUtility();
        try{
        PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
       ps.setString(1, dto.getId());
       ps.setString(2, dto.getName());
        ps.executeQuery();
        
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    
}
