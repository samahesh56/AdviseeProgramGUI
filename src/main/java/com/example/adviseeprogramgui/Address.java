package com.example.adviseeprogramgui;

public class Address {
    private String streetNo;
    private String city;
    private String state;
    private String zipcode;

    public Address(String streetNo, String city, String state, String zipcode) {
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s %s", streetNo, city, state, zipcode);
    }
}
