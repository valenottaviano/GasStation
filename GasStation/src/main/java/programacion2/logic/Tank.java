package programacion2.logic;

import java.sql.SQLException;
import programacion2.db.PostgreSQL;

public class Tank {
    private String oilId;
    private double amount;
    private PostgreSQL db;
    
    public Tank(String p_oilId, Double p_amount){
        this.oilId = p_oilId;
        this.amount = p_amount;
        this.db = new PostgreSQL();
    }
    
    public boolean venta() throws SQLException{
        return db.venta(this.oilId, this.amount);
    }
    public boolean compra() throws SQLException{
        return db.compra(this.oilId, this.amount);
    }

    public String getOilId() {
        return oilId;
    }

    public void setOilId(String oilId) {
        this.oilId = oilId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
