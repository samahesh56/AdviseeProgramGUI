package com.example.adviseeprogramgui;

import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.TextArea;

public class AdvisorController {

    @FXML
    private ToggleGroup operationToggleGroup;

    @FXML
    private RadioButton addStudent;

    @FXML
    private RadioButton addCourse;

    @FXML
    private TextArea courseTxt;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addressText;

    @FXML
    private TextField admitText;

    @FXML
    private ListView<String> attributeListview;

    @FXML
    private ListView<Course> courseListView;

    @FXML
    private TextField emailText;

    @FXML
    private TextField idText;

    @FXML
    private TextField majorText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField phoneText;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField editTextfield;

    @FXML
    private ListView<Student> studentListview;

    @FXML
    private TextField tuitionText;

    @FXML
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    @FXML
    void clickAddButton(ActionEvent event) {
        if (addStudent.isSelected()) {
            // Perform logic to add/delete/edit a student using nameTextField and idTextField
            Student newStudent = new Student("NewName", "NewID", "NewPhone", "NewEmail", "NewAddress", "NewMajor", "NewAdmitDate", new ArrayList<>());

            studentListview.getItems().add(newStudent);
            // Add/delete/edit the student
        } else if (addCourse.isSelected()) {
            Student selectedStudent = studentListview.getSelectionModel().getSelectedItem();

            Course selectedCourse = courseListView.getSelectionModel().getSelectedItem();

            selectedStudent.getCourseList().add(selectedCourse);
        }
    }

    @FXML
    void clickDeleteButton(ActionEvent event) {

    }

    @FXML
    void clickEditButton(ActionEvent event) {

    }

    @FXML
    void initialize() {

        //ArrayList<Course> courseList = new ArrayList<>();
        //courseList.add(new Course("CMPSC221", 3.0, 100.0));
        //getCourseList().add(new Course("CMPSC221", 3.0, 100.0));

        Student s = new Student("Brian Tran", "bzt5255", "111-111-1111",
                "bzt5255@psu.edu", "69 Fourtwenty Ave Media, PA 69420", "Computer Science",
                "July 7, 2022", new ArrayList<Course>());

        s.getCourseList().add(new Course("CMPSC221", 3.0, 100.0));
        s.getCourseList().add(new Course("CMPSC221", 3.0, 100.0));

        studentList.add(s);

        studentListview.setItems(studentList);
        studentListview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() {
            public void changed(ObservableValue<? extends Student> observableValue, Student oldStudent, Student newStudent) {
                ObservableList<String> attributeList = FXCollections.observableArrayList();
                String name = newStudent.getName();
                String ID = newStudent.getAcademicId();
                String phoneNum = newStudent.getPhoneNum();
                String email = newStudent.getEmail();
                String address = newStudent.getAddress();
                String major = newStudent.getMajor();
                String admitDate = newStudent.getAdmitDate();
                List<Course> courses = newStudent.getCourseList();

                attributeList.add("Name: " + name);
                attributeList.add("ID: " + ID);
                attributeList.add("Phone Number: " + phoneNum);
                attributeList.add("Email: " + email);
                attributeList.add("Address: " + address);
                attributeList.add("Major: " + major);
                attributeList.add("Admit Date: " + admitDate);
                attributeList.add("Courses");

                attributeListview.setItems(attributeList);

                courseTxt.clear();

                // Display course information in the TextArea
                attributeListview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String selectedAttribute) {
                        if ("Courses".equals(selectedAttribute)) {
                            StringBuilder courseInfo = new StringBuilder();

                            // Get the selected student
                            Student selectedStudent = studentListview.getSelectionModel().getSelectedItem();

                            // Check if a student is selected
                            if (selectedStudent != null) {
                                // Get the courses of the selected student
                                List<Course> courses = selectedStudent.getCourseList();

                                // Display course information in the TextArea
                                for (Course course : courses) {
                                    courseInfo.append(course.toString()).append("\n\n");
                                }
                            }

                            courseTxt.setText(courseInfo.toString());
                        } else {
                            // Clear the courseTxt if another attribute is selected
                            courseTxt.clear();
                        }
                    }
                });
            }
        });
    }
}