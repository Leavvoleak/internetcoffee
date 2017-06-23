
package internet.models;

/**
 *
 * @author Kylin
 */
public class UserDTO {
    
    private String uid,uname,pass,telphone,statusid;
    private double balance;

    public UserDTO(String uid, String uname, String pass, String telphone, String statusid, double balance) {
        this.uid = uid;
        this.uname = uname;
        this.pass = pass;
        this.telphone = telphone;
        this.statusid = statusid;
        this.balance = balance;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
