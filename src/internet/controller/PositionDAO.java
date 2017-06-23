
package internet.controller;

import internet.models.DbUtility;
import internet.models.PositionDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kylin
 */
public class PositionDAO {

    //Store All Data for use to list item on table 
    private final ArrayList<PositionDTO> mylist = new ArrayList<>();

    private DbUtility dbUtility = null;

    public void insert(PositionDTO dto) throws SQLException {
        try {
            String sql = "INSERT INTO tblposition VALUES(?,?,?)";
            dbUtility = new DbUtility();
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ps.setString(1, dto.getPosid());
            ps.setString(2, dto.getPosname());
            ps.setString(3, dto.getPosdesc());
            ps.execute();

        } finally {
            if (!dbUtility.getConnection().isClosed()) {
                dbUtility.closeConnection();
            }
        }
    }
    
    public void Update(PositionDTO pos){
        try{
            String sql = "";
            dbUtility = new DbUtility();
            PreparedStatement ps = dbUtility.getConnection().prepareStatement(sql);
            ps.setString(1, pos.getPosid());
            ps.setString(2, pos.getPosname());
            ps.setString(3, pos.getPosdesc());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
    }

}
