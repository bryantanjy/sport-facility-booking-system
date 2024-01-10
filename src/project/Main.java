package project;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        System.out.println("Hi, Thanks for choosing our system");
        Scanner reply = new Scanner (System.in);
        System.out.println("New user detected, please follow the instructions below");
        System.out.println("Are u a Student or an Admin?");
        System.out.println("(1-Student 2-Admin)");
        int message = reply.nextInt();
        System.out.println("PLease fill in the form below: ");
        if (message == 1)
        {
            Membership newStudent = new Student();
            newStudent.register();
            System.out.println("Please login again");
            newStudent.login();
            while (message!=3)
            {
                System.out.println("Please choose one function below: ");
                System.out.println("1-Booking\n2-Update Information\n3-Exit");
                message = reply.nextInt();
                reply.nextLine();
            switch(message)
            {
                case 1: 
                System.out.println("How many booking you wanna make?");
                int num = reply.nextInt();
                reply.nextLine();
                Booking[] book1;
                book1 = new Booking[num];
                float total=(float)0.00;
                for(int i=0;i<num;i++)
                    {
                        book1[i]=new Booking((Student)newStudent);
                        System.out.println("\n\nFor booking number "+(i+1));
                        book1[i].setBookingID(i+1);
                        System.out.println("How many court you wanna book?");
                        int balas = reply.nextInt();
                        reply.nextLine();
                        book1[i].setNumOfCourt(balas);
                        book1[i].setPrice(balas);
                        System.out.println("Which activity:");                            System.out.println("<--- ACTIVITY --->");
                        System.out.println("A1: BADMINTON");
                        System.out.println("A2: PING PONG");
                        System.out.println("A3: TENNIS");
                        System.out.println("A4: BASKETBALL");
                        System.out.println("A5: NETBALL");
                        System.out.println("A6: SQUASH");
                        System.out.println("B1: VOLLEYBALL");
                        System.out.println("B2: FUTSAL");
                        System.out.println("Please select the activity: ");
                        String act = reply.next();
                        reply.nextLine();
                        book1[i].setActivity(act);
                        System.out.println("Please select which schedule u want to book: ");
                        System.out.println("1:\t1200-1400");
                        System.out.println("2:\t1400-1600");
                        System.out.println("3:\t1600-1800");
                        int sch = reply.nextInt();
                        reply.nextLine();
                        book1[i].getSchedule().setSession(sch);
                        System.out.println("The price for this booking is "+book1[i].getPrice());
                        total=total+book1[i].getPrice();
                        }
                        System.out.println("\n\nPlease double check your booking information");
                        System.out.println("Student Name:\t"+newStudent.getName());
                        System.out.println("Student member id:\t"+newStudent.getMemberID());
                        System.out.println("Student phone:\t"+newStudent.getPhone());
                        System.out.println("==========Booking Information==========");
                
                        for(int j=0;j<num;j++)
                        {
                            System.out.println("Booking No."+(j+1));
                            System.out.println("BookingID\tNumOfCourt\tPrice\tActivity\tSchedule");
                            System.out.println(book1[j].getBookingID()+"\t\t"+book1[j].getNumOfCourt()+"\t\t"+book1[j].getPrice()+"\t"+book1[j].getActivity()+"\t\t"+book1[j].getSchedule().getSession());
                        }
                        System.out.println("\nThe total price is: "+total);
                        System.out.println("\n\nThe System will proceed to payment page");
                        System.out.println("Please select which type of payment are u prefer: (1:E-WALLET 2:CARD PAYMENT)");
                        Scanner payment = new Scanner(System.in);
                        int type = payment.nextInt();
                        payment.nextLine();
                        if(type ==1)
                        {
                            System.out.println("Please give us your e-wallet information: ");
                            System.out.println("E-wallet ID :");
                            String id = payment.next();
                            payment.nextLine();
                            System.out.println("\nTNG - Touchngo\nBOO - BOOST\nBIG - BIGPAY");
                            System.out.println("Which e-wallet you are using? ");
                            String typ = payment.next();
                            payment.nextLine();
                            String payID = newStudent.memberID+id;
                            System.out.println("Payment ID: "+payID);
                            Payment pay = new Ewallet(id,typ,payID,total);
                            System.out.println("\n\n\nReceiving payment.....");
                            System.out.println("Payment Received!!!");
                            System.out.println("Here is your receipt");
                            System.out.println("\n\n===========Receipt==========");
                            String Ump = "UMP";
                            String rec = Ump.concat(((Ewallet)pay).getEwalletID());
                            pay.getreceiptID().setreceiptID(rec);
                            System.out.println("ReciptID: "+pay.getreceiptID().getreceiptID());
                            System.out.println("Name: "+newStudent.getName());
                            System.out.println("StudentID: "+newStudent.getMemberID());
                            System.out.println("============================");
                            Detail detObj = new Receipt();
                            System.out.print("Address: ");
                            detObj.address();
                            System.out.println("============================");
                            for(int j=0;j<num;j++)
                            {   
                                System.out.println("Booking No."+(j+1));
                                System.out.println("BookingID\tNumOfCourt\tPrice\tActivity\tSchedule");
                                System.out.println(book1[j].getBookingID()+"\t\t"+book1[j].getNumOfCourt()+"\t\t"+book1[j].getPrice()+"\t"+book1[j].getActivity()+"\t\t"+book1[j].getSchedule().getSession());
                            }
                            System.out.println("=============================");
                            System.out.println("\nThe total price is: "+total); 
                            }
                        else
                        {
                            System.out.println("Please enter your card number: ");
                            String number = payment.next();
                            payment.nextLine();
                            String payID = newStudent.memberID+number;
                            System.out.println("PLease enter card holder name: ");
                            String na = payment.nextLine();
                            Payment card = new CreditDebitCard(number,na,payID);
                            String Ump = "UMP";
                            String rec = Ump.concat(((CreditDebitCard)card).getName());
                            card.getreceiptID().setreceiptID(rec);
                            System.out.println("\n\n\nReceiving payment.....");
                            System.out.println("Payment Received!!!");
                            System.out.println("Here is your receipt");
                            System.out.println("\nReciptID: "+card.getreceiptID().getreceiptID());
                            System.out.println("Name: "+newStudent.getName());
                            System.out.println("StudentID: "+newStudent.getMemberID());
                            System.out.println("============================");
                            for(int j=0;j<num;j++)
                            {   
                                System.out.println("Booking No."+(j+1));
                                System.out.println("BookingID\tNumOfCourt\tPrice\tActivity\tSchedule");
                                System.out.println(book1[j].getBookingID()+"\t\t"+book1[j].getNumOfCourt()+"\t\t"+book1[j].getPrice()+"\t"+book1[j].getActivity()+"\t\t"+book1[j].getSchedule().getSession());
                            }
                            System.out.println("=============================");
                            System.out.println("\nThe total price is: "+total);
                        }
            
                        break;
                case 2:
                        newStudent.updateInfo();
                {
                    int re;
                    do{
                        System.out.println("Still want to continue update?");
                        System.out.println("1-YES 2-NO");
                        re = reply.nextInt();
                        reply.nextLine();
                        if (re == 2)
                        {
                            break;
                        }
                        newStudent.updateInfo();
                    }while(re==1);
                }
                break;

                case 3:
                    message=3;
                    break;
                    
                default:
                System.out.println("Please select only one from above!!!");
            }
        }
        }
        else
        {
            Scanner mess = new Scanner(System.in);
            Membership newAdmin = new Admin();
            newAdmin.register();
            System.out.println("Please login again\n");
            newAdmin.login();
            System.out.println("How many facility u wanna add in?");
            int i = mess.nextInt();
            Facility[] fac1;
            fac1 = new Facility[i];
            for (int j=0;j<i;j++){
                System.out.println("\nFor Facility number"+(j+1));
                System.out.println("Please enter the facility ID: ");
                String id = mess.next();
                mess.nextLine();
                System.out.println("=======Type======");
                System.out.println("A1: BADMINTON");
                System.out.println("A2: PING PONG");
                System.out.println("A3: TENNIS");
                System.out.println("A4: BASKETBALL");
                System.out.println("A5: NETBALL");
                System.out.println("A6: SQUASH");
                System.out.println("B1: VOLLEYBALL");
                System.out.println("B2: FUTSAL");
                System.out.println("=================");
                System.out.println("Please enter facility type: ");
                String ty = mess.next();
                mess.nextLine();
                System.out.println("Please enter facility description :");
                String de = mess.next();
                mess.nextLine();
                System.out.println("Please enter the amount of the facility :");
                int am = mess.nextInt();
                mess.nextLine();
                System.out.println("\n");
                fac1[j]=new Facility(id,ty,de,am);
            }
            System.out.println("These are the facility information that added to the list");
            for(int j=0;j<i;j++){
                System.out.println("Facility No."+(j+1));
                System.out.println("Facility ID :"+fac1[j].getFacilityID());
                System.out.println("Facility type :"+fac1[j].getType());
                System.out.println("Facility Description :"+fac1[j].getDesc());
                System.out.println("Facility amount available :"+fac1[j].getAmount());
                System.out.println("---------------------------------------------");
            }
            
            System.out.println("Do you want to make and update to the facility? ");
            System.out.println("1-YES\t2-NO");
            int rep=mess.nextInt();
            mess.nextLine();
            while (rep==1) 
            {
                System.out.println("Which facility you want to update?");
                int upd=mess.nextInt();
                if(upd>(fac1.length+1))
                {
                    System.out.println("Don't have so much facilities");
                    System.out.println("Please enter again!!!");
                }
                else
                {
                    fac1[upd-1].updateFacility();
                    System.out.println("Do you still want to continue update facility information? ");
                    System.out.println("1-Yes\t2-No");
                    rep=mess.nextInt();
                    mess.nextLine();       
                }
            } 
        }
}
}
