package project;
public class Booking {

    public String bookingID;
    public int numOfCourt;
    public float price;
    public String activity;
    private Schedule schedule;
    private Payment paymentID;
    private Student studentID;
    
    public Booking(Student studentID){
        bookingID="A000";
        numOfCourt=0;
        price=(float) 0.00;
        paymentID = new Payment(bookingID);
        this.studentID=studentID;
        schedule = new Schedule();
    }

    
    
    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(int num) {
        bookingID = "A00"+num;
    }

    public int getNumOfCourt() {
        return numOfCourt;
    }

    public void setNumOfCourt(int numOfCourt) {
        this.numOfCourt = numOfCourt;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(int numofCourt) {
        price = (float) (4.00*numOfCourt);
    }
    
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Student getStudentID() {
        return studentID;
    }

    public void setStudentID(Student studentID) {
        this.studentID = studentID;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    
}

