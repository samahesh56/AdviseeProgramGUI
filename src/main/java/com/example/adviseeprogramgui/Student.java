package com.example.adviseeprogramgui;

import java.util.ArrayList;

public class Student extends People {
    private String major;
    private String admitDate;
    private ArrayList<Course> courseList;
    private double tuitionPerSem;

    public Student(String name, String id, String pN, String e, String a, String major,
                   String admitDate, ArrayList<Course> courseList) {
        super(name, id, pN, e, a);

        this.major = major;
        this.admitDate = admitDate;
        this.courseList = courseList;

        // calculates payment when constructing the object

        double payment = 0;
        for (int i = 0; i < courseList.size(); i++) {
            payment += courseList.get(i).getNumCredits() * courseList.get(i).getPricePerCredit();
        }
        this.tuitionPerSem = payment;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuitionPerSem() {
        return tuitionPerSem;
    }

    public void setTuitionPerSem(double tuitionPerSem) {
        this.tuitionPerSem = tuitionPerSem;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public void Payment() {

        // calculates payment again
        double payment = 0;
        for (int i = 0; i < courseList.size(); i++) {
            payment += courseList.get(i).getNumCredits() * courseList.get(i).getPricePerCredit();
        }
        this.tuitionPerSem = payment; //calculations tuition per sem my multiplying credits times price per credit for each course
    }

    @Override
    public String display() {
        String courseListString = "";
        for (Course course : getCourseList()) {
            courseListString += course.toString() + "\n";
        }

        return String.format("Name: %s \n" +
                        "id: %s\n" +
                        "Phone: %s\n" +
                        "Email: %s\n" +
                        "Address: %s\n" +
                        "Major: %s\n" +
                        "TuitionPerSem: $%.2f\n" +
                        "Admit Date: %s\n" +
                        "%s", getName(), getAcademicId(), getPhoneNum(),
                getEmail(), getAddress(), getMajor(), getTuitionPerSem(), getAdmitDate(), courseListString);
    }

    public String toString() {
        return String.format("'%s'", getName());
    }
}
