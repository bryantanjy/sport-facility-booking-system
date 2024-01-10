package projectGUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHUN
 */
public class Booking {
    protected String studentID;
    protected String bookingID;
    protected int numOfCourt;
    protected String activity;
    protected String schedule;

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the bookingID
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * @param bookingID the bookingID to set
     */
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    /**
     * @return the numOfCourt
     */
    public int getNumOfCourt() {
        return numOfCourt;
    }

    /**
     * @param numOfCourt the numOfCourt to set
     */
    public void setNumOfCourt(int numOfCourt) {
        this.numOfCourt = numOfCourt;
    }

    /**
     * @return the activity
     */
    public String getActivity() {
        return activity;
    }

    /**
     * @param activity the activity to set
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    
}
