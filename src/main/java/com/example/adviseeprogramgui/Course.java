package com.example.adviseeprogramgui;

public class Course {
    private String courseNum;
    private double numCredits;
    private double pricePerCredit;

    public Course() {
        courseNum = "";
        numCredits = 0.0;
        pricePerCredit = 0.0;
    }

    public Course(String courseNumber, double numCredits, double pricePerCredit) {
        this.courseNum = courseNumber;
        this.numCredits = numCredits;
        this.pricePerCredit = pricePerCredit;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNum = courseNumber;
    }

    public void setNumCredits(double numCredits) {
        this.numCredits = numCredits;
    }

    public String getCourseNumber() {
        return courseNum;
    }

    public double getNumCredits() {
        return numCredits;
    }

    public double getPricePerCredit() {
        return pricePerCredit;
    }

    public void setPricePerCredit(double pricePerCredit) {
        this.pricePerCredit = pricePerCredit;
    }

    // course info
    @Override
    public String toString() {
        return "Course: " + courseNum +
                "\nCredits: " + numCredits +
                "\nPrice: " + pricePerCredit;
    }


}
