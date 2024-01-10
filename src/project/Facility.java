package project;

import java.util.Scanner;

public class Facility {
    public String facilityID;
    public String type;
    public String desc;
    public int amount;
    
    public Facility(String ID, String ty, String de, int amount){
        this.facilityID = ID;
        this.type = ty;
        this.desc = de;
        this.amount = amount;
    }

    public String getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
     
    public void updateFacility(){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Update Info");
        System.out.println("1: Facility ID");
        System.out.println("2: Facility type");
        System.out.println("3: Facility description");
        System.out.println("4: Display info");
        System.out.println("Select which info to change: ");
        int choice = num.nextInt();
        
        if(choice == 1){
            System.out.println("Please enter your new facility ID");
            String id = num.next();
            num.nextLine();
            setFacilityID(id);
        }
        else if(choice == 2){
            System.out.println("Please enter your new facility type");
            String ty = num.next();
            num.nextLine();
            setType(ty);
        }
        else if(choice == 3){
            System.out.println("Please enter your new facility description: ");
            String de = num.next();
            num.nextLine();
            setDesc(de);
        }
        else if(choice == 4){
            System.out.println("<--- Display info --->");
            System.out.println("Facility ID: "+getFacilityID());
            System.out.println("Facility Type: "+getType());
            System.out.println("Facility Description: "+getDesc());
        }
        else{
            System.out.println("Invalid selection, please try again!");
            updateFacility();
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}