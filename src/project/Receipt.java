package project;

public class Receipt implements Detail{
    private String receiptID;

    public String getreceiptID() {
        return receiptID;
    }

    public void setreceiptID(String receiptID) {
        this.receiptID = receiptID;
    }
    @Override
    public void address()
    {
        System.out.println("Universiti Malaysia,"+POSTCODE+" Pekan, Pahang");
    }
}