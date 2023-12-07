package com.example.adviseeprogramgui;

public abstract class People implements Payable {
    private String name;
    private String academicId;
    private String phoneNum;
    private String email;
    private String address;

    public People() {
        this.name = "";
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

    public People(String name, String id, String pN, String e, String a) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
