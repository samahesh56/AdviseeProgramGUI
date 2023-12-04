package com.example.adviseeprogramgui;

public class Email {
    private String type;
    private String address;

    public Email(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
