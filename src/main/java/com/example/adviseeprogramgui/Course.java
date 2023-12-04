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
    public String displayCourseInfo() {
        return String.format("Course Number: %s | Number of Credits: %.1f | Price per Credit: $%.2f", courseNum, numCredits, pricePerCredit);
    }


}
