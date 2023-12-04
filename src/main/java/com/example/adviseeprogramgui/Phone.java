package com.example.adviseeprogramgui;

public class Phone {
    private String brand;
    private String model;
    private String number;

    public Phone(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Model: %s | Number: %s", brand, model, number);
    }
}
