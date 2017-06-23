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
public class ModuleDTO {
    
    // declaration fields
    private String mid;
    private String mname;
    public ModuleDTO(){}
    public ModuleDTO(String mid, String mname) {
        this.mid = mid;
        this.mname = mname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
    public String toString(){
        return "";
    }
}
