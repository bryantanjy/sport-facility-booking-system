package project;

public class CreditDebitCard extends Payment{
    public String cardNo;
    private String name;

    public CreditDebitCard(String cardNo, String name, String paymentID){
        super(paymentID);
        this.cardNo = cardNo;
        this.name = name;
    }
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
