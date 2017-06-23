package internet.controller;

import internet.models.DbUtility;
import internet.models.ModuleDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kylin
 */

/*
 I hate this, Don't make me angry again.
 I will reject this condition!
 Low algorithsm so go away from me
 */
public class ModuleDAO {

    private static ArrayList<ModuleDTO> list = new ArrayList<>();

    private DbUtility dbUtility = null;

    public void insertModule(ModuleDTO module) throws SQLException {

        try {
            String sql = "INSERT INTO tblmodule VALUES(?,?)";
            dbUtility = new DbUtility();
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ps.setString(1, module.getMid());
            ps.setString(2, module.getMname());

            ps.execute();

        } finally {
            if (!dbUtility.getConnection().isClosed()) {
                dbUtility.closeConnection();
            }
        }
    }

    public void deleteModule(String id) throws SQLException {

        try {
            String sql = "DELETE * FROM tblmodule WHERE mid = ?";
            dbUtility = new DbUtility();
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } finally {
            if (!dbUtility.getConnection().isClosed()) {
                dbUtility.closeConnection();
            }
        }
    }

    public ArrayList<ModuleDTO> listModule() throws SQLException {

        try {
            String sql = "SELECT * FROM tblModule";
            dbUtility = new DbUtility();
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                list.add(new ModuleDTO(rs.getString(1), rs.getString(2)));

            }
            return list;
        } finally {
            if (!dbUtility.getConnection().isClosed()) {
                dbUtility.closeConnection();
            }
        }

    }

    public boolean update(ModuleDTO module) throws SQLException {
        dbUtility = new DbUtility();
        String sql = "UPDATE TABLE tblmodule SET mname =? WHERE mid =?";
        PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
        ps.setString(1, module.getMid());
        ps.setString(2, module.getMname());
        int i = ps.executeUpdate();
        if (i > 0) {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw e;
                }
            }
            if (!dbUtility.getConnection().isClosed()) {
                try {
                    this.dbUtility.getConnection().close();
                } catch (SQLException e) {
                    throw e;
                }
            }
            return true;
        }
        return false;
    }
   
}
