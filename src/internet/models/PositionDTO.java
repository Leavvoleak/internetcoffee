/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet.models;

/**
 *
 * @author Kylin
 */
public class PositionDTO {
    
    private String posid;
    private String posname;
    private String posdesc;

    public PositionDTO(String posid, String posname, String posdesc) {
        this.posid = posid;
        this.posname = posname;
        this.posdesc = posdesc;
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

    public String getPosdesc() {
        return posdesc;
    }

    public void setPosdesc(String posdesc) {
        this.posdesc = posdesc;
    }
    
}
