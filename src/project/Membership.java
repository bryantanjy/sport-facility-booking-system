package project;

abstract public class Membership {

    public String memberID;
    public String name;
    protected String password;
    private String phone;
    public String email;

    public Membership() {
        this.memberID = "a123";
        this.name = "test";
        this.password = "test";
        this.phone = "012-3456789";
        this.email = "booking123@gmail.com";
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    abstract public void register();
    abstract public void login();
    abstract public void updateInfo();
        

}
