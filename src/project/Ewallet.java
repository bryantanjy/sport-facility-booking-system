package project;
public class Ewallet extends Payment{
    public String ewalletID;
    public String type;
    public double total;
    
    public Ewallet(String ewalletID, String type, String paymentID, double total){
        super(paymentID);
        this.ewalletID = ewalletID;
        this.type = type;
        this.total= total;
    }

    public String getEwalletID() {
        return ewalletID;
    }

    public void setEwalletID(String ewalletID) {
        this.ewalletID = ewalletID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}