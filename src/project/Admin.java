package project;
import java.util.Scanner;

public class Admin extends Membership {
    private String adminID;
    private String adminPosition;
    private double salary;
    
    
    public Admin(){
        super();
        this.adminID="TJ2105";
        this.adminPosition="Supervisor";
        this.salary=2000.00;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminPosition() {
        return adminPosition;
    }

    public void setAdminPosition(String adminPosition) {
        this.adminPosition = adminPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void updateInfo(){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Update Info");
        System.out.println("1: Password");
        System.out.println("2: Phone number");
        System.out.println("3: Email address");
        System.out.println("4: Position");
        System.out.println("5: Salary");
        System.out.println("6: Display info");
        System.out.print("Select which info to change: ");
        int choice = num.nextInt();
        
        if (choice == 1) {
            System.out.print("Please enter your new password: ");
            setPassword(num.nextLine());
        } else if (choice == 2) {
            System.out.print("Please enter your new phone number: ");
            setPhone(num.nextLine());
        } else if (choice == 3) {
            System.out.print("Please enter your new email address: ");
            setEmail(num.nextLine());
        } else if (choice == 4) {
            System.out.println("Please enter your new Position: ");
            setAdminPosition(num.next());
        } else if (choice == 5) {
            System.out.println("Please enter your new salary: ");
            setSalary(num.nextDouble());
        }
        else if (choice ==6){
            System.out.println("<--- Display info --->");
            System.out.println(getMemberID());
            System.out.println(getName());
            System.out.println(getPassword());
            System.out.println(getPhone());
            System.out.println(getEmail());
            System.out.println(getAdminPosition());
            System.out.println(getSalary());
        }
        else{
            System.out.println("Invalid selection, please try again!");
            updateInfo();
        }
    }
    @Override
    public void register()
    {
        Scanner registration = new Scanner(System.in);

        System.out.println("<--- Admin Registration --->");
        System.out.print("Enter your admin ID: ");
        String input = registration.next();
        registration.nextLine();
        setAdminID(input);
        setMemberID(input);
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
        System.out.print("Enter position: ");
        String pos = registration.next();
        registration.nextLine();
        setAdminPosition(pos);
        System.out.print("Enter salary: ");
        double salary = registration.nextDouble();
        registration.nextLine();
        setSalary(salary);
        System.out.println("");
        System.out.println("\n");
    }
    @Override
    public void login()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("<--- Admin Login --->");
        System.out.print("Enter Member ID: ");
        String member = input.next();
        System.out.print("Enter password: ");
        String pwd = input.next();

        if (getMemberID().equals(member) && getPassword().equals(pwd)) {
            System.out.println("<<<<<   Welcome " + getName() + "   >>>>>");
        } else if (getMemberID().equals(member)) {
            System.out.println("Invalid password!");
            login();
        } else {
            System.out.println("Invalid MemberID & password!");
            login();
        }
    }  
}
