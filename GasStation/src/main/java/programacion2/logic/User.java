package programacion2.logic;
import programacion2.db.PostgreSQL;


public class User {
    private String username;
    private String password;
    private boolean isLogged;
    
    public User(){
        this.isLogged = false;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
    
    public boolean login(){
        PostgreSQL db = new PostgreSQL();
        boolean logged = db.login(this.username, this.password);
        if (logged == true){
            this.isLogged = true;
            return true;
        }else{
            this.username = "";
            this.password = "";
            return false;
        }
    }
}
