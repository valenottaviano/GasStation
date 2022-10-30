package programacion2.logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import programacion2.gui.LoginFrame;
import programacion2.gui.Menu;

public class GasStation {
    public static User user;
    public static LoginFrame lf; 
    public static Menu menu;
    
    public static void main(String[] args) {
        user = new User();
        lf = new LoginFrame(user);
        menu = new Menu();

        lf.setLocationRelativeTo(null);
        lf.setVisible(true);
        
        while (user.getIsLogged() == false){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GasStation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        lf.setVisible(false);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}
