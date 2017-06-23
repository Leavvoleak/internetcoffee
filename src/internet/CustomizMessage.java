/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Kylin
 */
public class CustomizMessage {
    
    private JOptionPane jOptionPane;
    
    public void getMsg(String msg){
        String mess = "<html><head><title><h2>Hello</h2></title><body><h3 style='color:#44619d;'>In this error I will how to display multiple message</h3><strong>"+msg+"</strong></body></html> ";
        jOptionPane = new NarrowOption();
        jOptionPane.setMessage(mess);
        jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = jOptionPane.createDialog(null,"INFORMATION");
        dialog.setVisible(true);
    }
    
    
    
    class NarrowOption extends JOptionPane{
        
        public NarrowOption(){}
        
        public int getPosition(){
            return 100;
        }
    }
    
    public static void main(String[] args) {
        new CustomizMessage().getMsg("Khmer");
    }
}
