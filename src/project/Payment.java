package project;

public class Payment{
    protected String paymentID;
    protected Receipt receiptID;

    public Payment(String paymentID){
        this.paymentID = paymentID;
        receiptID = new Receipt();
    }
    
    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    
    public Receipt getreceiptID() {
        return receiptID;
    }

    public void setreceiptID(Receipt receiptID) {
        this.receiptID = receiptID;
    }
    

}