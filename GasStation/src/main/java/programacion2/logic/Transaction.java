package programacion2.logic;

public class Transaction {
    private int idTransaction;
    private String datetime;
    private String idOil;
    private String nameOil;
    private double currentPriceLiter;
    private double amount;
    private String type;
    

    public Transaction(int idTransaction, String datetime, String idOil, String nameOil, double currentPriceLiter, double amount, String type) {
        this.idTransaction = idTransaction;
        this.datetime = datetime;
        this.idOil = idOil;
        this.nameOil = nameOil;
        this.currentPriceLiter = currentPriceLiter;
        this.amount = amount;
        this.type = type;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getIdOil() {
        return idOil;
    }

    public void setIdOil(String idOil) {
        this.idOil = idOil;
    }

    public String getNameOil() {
        return nameOil;
    }

    public void setNameOil(String nameOil) {
        this.nameOil = nameOil;
    }

    public double getCurrentPriceLiter() {
        return currentPriceLiter;
    }

    public void setCurrentPriceLiter(double currentPriceLiter) {
        this.currentPriceLiter = currentPriceLiter;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
