package com.example.adviseeprogramgui;

public abstract class People implements Payable {
    private String firstName;
    private String middleName;
    private String lastName;
    private String academicId;
    private String phoneNum;
    private String email;
    private String address;

    public People() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.academicId = "";
        /*
        this.phoneNum = new Phone("", "", ""); // Initialize Phone with empty values
        this.email = new Email("", ""); // Initialize Email with empty values
        this.address = new Address("", "", "", ""); // Initialize Address with empty values
         */
        this.phoneNum = "";
        this.email = "";
        this.address = "";
    }

    public People(String fN, String mN, String lN, String id, String pN, String e, String a) {
        this.firstName = fN;
        this.middleName = mN;
        this.lastName = lN;
        this.academicId = id;
        this.phoneNum = pN;
        this.email = e;
        this.address = a;
    }

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void Payment() {
    }

    public abstract String display();
}
