package programacion2.logic;

public class Oil {
    private String oilId;
    private double max;
    private double available;
    
    public Oil(String p_oilId, double p_max, double p_available){
        this.oilId = p_oilId;
        this.max = p_max;
        this.available = p_available;
    }

    public String getOilId() {
        return oilId;
    }

    public void setOilId(String oilId) {
        this.oilId = oilId;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }
    
}
