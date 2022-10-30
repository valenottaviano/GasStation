package programacion2.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import programacion2.logic.Oil;
import programacion2.logic.Transaction;

public class PostgreSQL {
    private final String url = "jdbc:postgresql://babar.db.elephantsql.com:5432/cnhskkud";
    private final String user = System.getenv("db");
    private final String password = System.getenv("pass");
    private Connection conn = null;

    public void connect() {
        this.conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Database connected.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public boolean login(String username, String password){
        connect();
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username='"+ username+ "' AND password='"+ password + "';";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                try{
                    rs.getString("username");
                    this.conn.close();
                    return true;
                }catch(SQLException ex){
                    this.conn.close();
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     }
    
    public boolean venta(String oilId, Double amount) throws SQLException{
        ArrayList<Oil> oils = updateTanks();
        for(Oil o: oils){
        if(o.getOilId().equals(oilId)){
            if(o.getAvailable()-amount < 0.0){
                    return false;
                }
            }
        }
        connect();
        try {
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO public.transaction_log (id_oil, amount, type) VALUES ('"
                    + oilId+ "', "+ "-"+amount+", 'V');";
            stmt.executeUpdate(query);
            stmt.close();
            this.conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
            this.conn.close();
            return false;
        }
    }
    
    public boolean compra(String oilId, Double amount) throws SQLException{
        ArrayList<Oil> oils = updateTanks();
        for(Oil o: oils){
            if(o.getOilId().equals(oilId)){
                if(o.getAvailable()+amount >= 10000.0){
                    return false;
                }
            }
        }
        connect();
        try {
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO public.transaction_log (id_oil, amount, type) VALUES ('"
                    + oilId+ "', "+amount+", 'C');";
            stmt.executeUpdate(query);
            stmt.close();
            this.conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
            this.conn.close();
            return false;
        }
    }
    
    public ArrayList<Oil> updateTanks(){
        ArrayList<Oil> oils = new ArrayList<Oil>();
        connect();
        
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT id_oil, SUM(amount) AS available FROM transaction_log GROUP BY id_oil;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                try{
                    Oil o = new Oil(rs.getString("id_oil"),
                    10000,
                    rs.getDouble("available"));
                    oils.add(o);
                }catch(SQLException ex){
                    this.conn.close();
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return oils;
    }
    
    public ArrayList<Transaction> getTransactions(){
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        connect();
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT " +
                            "datetime," +
                            "id_transaction," +
                            "transaction_log.id_oil," +
                            "name_oil," +
                            "current_price_liter," +
                            "amount," +
                            "type " +
                            "FROM transaction_log " +
                            "INNER JOIN oil_types " +
                            "ON transaction_log.id_oil = oil_types.id_oil " +
                            "ORDER BY id_transaction DESC";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                try{
                    Transaction t = new Transaction(
                            rs.getInt("id_transaction"),
                            rs.getString("datetime"),
                            rs.getString("id_oil"),
                            rs.getString("name_oil"),
                            rs.getDouble("current_price_liter"),
                            rs.getDouble("amount"),
                            rs.getString("type")
                    );
                    transactions.add(t);
                }catch(SQLException ex){
                    this.conn.close();
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transactions;
    }
}
