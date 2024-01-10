package project;
import java.util.Scanner;

class Student extends Membership {
    public String studentID;
    
    public Student(){
        super();
        this.studentID = "CA20000";
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    @Override
    public void register(){
        Scanner registration = new Scanner(System.in);

        System.out.println("<--- Student Registration --->");
        System.out.print("Enter your student ID: ");
        String stud = registration.next();
        registration.nextLine();
        setStudentID(stud);
        setMemberID(stud);
        System.out.print("Enter name: ");
        String nama = registration.nextLine();
        setName(nama);
        System.out.print("Set password: ");
        String pass = registration.next();
        registration.nextLine();
        setPassword(pass);
        System.out.print("Enter phone number: ");
        String pho = registration.next();
        registration.nextLine();
        setPhone(pho);
        System.out.print("Enter email address: ");
        String ema = registration.next();
        registration.nextLine();
        setEmail(ema);
        System.out.println("\n");

    }
    @Override
    public void login()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("<--- Login --->");
        System.out.print("Enter Member ID: ");
        String member = input.next();
        System.out.print("Enter password: ");
        String pwd = input.next();
        
        if (getMemberID().equals(member) && getPassword().equals(pwd)){
            System.out.println("<<<<<   Welcome " + getName() + "   >>>>>");
        }
        else if (getMemberID().equals(member)){
            System.out.println("Invalid password!");
            login();
        }
        else {
            System.out.println("Invalid MemberID & password!");
            login();
         }    
    }
    @Override
    public void updateInfo(){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Update Info");
        System.out.println("1: Password");
        System.out.println("2: Phone number");
        System.out.println("3: Email address");
        System.out.println("4: Student ID");
        System.out.println("5: Display Info");
        System.out.print("Select which info to change: ");
        int choice = num.nextInt();
        
        if (choice == 1) {
            System.out.print("Please enter your new password: ");
            String pass = num.next();
            num.nextLine();
            setPassword(pass);
        } else if (choice == 2) {
            System.out.print("Please enter your new phone number: ");
            String pho = num.next();
            num.nextLine();
            setPhone(pho);
        } else if (choice == 3) {
            System.out.print("Please enter your new email address: ");
            String mail = num.next();
            num.nextLine();
            setEmail(mail);
        } 
        else if (choice == 4) {
            System.out.print("Please enter your new Student ID: ");
            String ID = num.next();
            num.nextLine();
            setStudentID(ID);
        }
        else if (choice == 5){
            System.out.println("<--- Display info --->");
            System.out.println("Student ID :"+getStudentID());
            System.out.println("Name :"+getName());
            System.out.println("Phone :"+getPhone());
            System.out.println("Email :"+getEmail());
        }
        else {
            System.out.println("Invalid selection, please try again!");
            updateInfo();
        }
    }
    }
