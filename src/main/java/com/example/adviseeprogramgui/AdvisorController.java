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
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    @FXML
    void clickDeleteButton(ActionEvent event) {
        if (addStudent.isSelected()) {
            Student selectedStudent = studentListview.getSelectionModel().getSelectedItem();

        }


    }

    @FXML
    void clickEditButton(ActionEvent event) {
        Student selectedStudent = studentListview.getSelectionModel().getSelectedItem();
        if (selectedStudent != null) {
            // Get the values from the corresponding text fields
            String newName = nameText.getText();
            String newId = idText.getText();
            String newPhone = phoneText.getText();
            String newEmail = emailText.getText();
            String newAddress = addressText.getText();
            String newMajor = majorText.getText();
            String newAdmitDate = admitText.getText();

            studentList.remove(selectedStudent);
            // Update the selected student's attributes
            if (!newName.isEmpty()) {
                selectedStudent.setName(newName);
            }
            if (!newId.isEmpty()) {
                selectedStudent.setAcademicId(newId);
            }
            if (!newPhone.isEmpty()) {
                selectedStudent.setPhoneNum(newPhone);
            }
            if (!newEmail.isEmpty()) {
                selectedStudent.setEmail(newEmail);
            }
            if (!newAddress.isEmpty()) {
                selectedStudent.setAddress(newAddress);
            }
            if (!newMajor.isEmpty()) {
                selectedStudent.setMajor(newMajor);
            }
            if (!newAdmitDate.isEmpty()) {
                selectedStudent.setAdmitDate(newAdmitDate);
            }
            selectedStudent.Payment();

            // Update the attribute list view
            updateAttributeListView(selectedStudent);

            studentList.add(selectedStudent);
            studentListview.setItems(studentList);
        }
    }

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

            if (selectedStudent != null && selectedCourse != null) {
                // Check if the course is not already in the student's course list
                if (!selectedStudent.getCourseList().contains(selectedCourse)) {
                    // Add the selected course to the student's course list
                    selectedStudent.getCourseList().add(selectedCourse);
                    selectedStudent.Payment();

                    // Update the attribute list view to refresh the "Courses" section
                    updateAttributeListView(selectedStudent);
                }
            }
        }
    }

    @FXML
    void initialize() {

        // Create a static list of courses
        ObservableList<Course> courseList = FXCollections.observableArrayList();
        courseList.add(new Course("CMPSC221", 3.0, 100.0));
        courseList.add(new Course("MATH101", 4.0, 95.0));
        courseList.add(new Course("ENGL15", 3.0, 90.0));
        courseList.add(new Course("MUSIC9", 3.0, 50.0));
        courseList.add(new Course("CHEM110", 4.0, 100.0));
        courseList.add(new Course("PHYS212", 4.0, 100.0));
        // Add more courses as needed

        // Set the course list to the courseListView
        courseListView.setItems(courseList);


        Student s = new Student("Brian Tran", "bzt5255", "111-111-1111",
                "bzt5255@psu.edu", "12 Bucklemyshoe Street Exton, PA 12903", "Computer Science",
                "July 7, 2022", new ArrayList<Course>());

        s.getCourseList().add(new Course("CMPSC221", 3.0, 100.0));
        s.getCourseList().add(new Course("MATH101", 4.0, 95.0));
        s.Payment();
        studentList.add(s);

        Student s2 = new Student("Akku Mahesh", "sah3804", "222-222-2222", "sah3804@psu.edu",
                "69 Fourtwenty Ave Media, PA 69420", "Political Science", "May 4, 2022",
                new ArrayList<Course>());
        s2.getCourseList().add(courseList.get(3));
        s2.getCourseList().add(courseList.get(5));
        s2.Payment();
        studentList.add(s2);

        Student s3 = new Student("J. Robert Oppenheimer", "jro8210", "333-333-3333", "jro8210@psu.edu",
                "3 Los Alamos Los Alamos, NM 87544", "Quantum Physics", "May 22, 1929",
                new ArrayList<>());
        s3.getCourseList().add(courseList.get(4));
        s3.getCourseList().add(courseList.get(5));
        s3.Payment();
        studentList.add(s3);



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
                ArrayList<Course> courses = newStudent.getCourseList();
                Double tuition = newStudent.getTuitionPerSem();

                attributeList.add("Name: " + name);
                attributeList.add("ID: " + ID);
                attributeList.add("Phone Number: " + phoneNum);
                attributeList.add("Email: " + email);
                attributeList.add("Address: " + address);
                attributeList.add("Major: " + major);
                attributeList.add("Admit Date: " + admitDate);
                attributeList.add("Courses");
                attributeList.add(String.format("Tuition: $%.2f", tuition));

                attributeListview.setItems(attributeList);

                attributeListview.setOnMouseClicked(event -> {
                    if (attributeListview.getSelectionModel().getSelectedIndex() == attributeList.indexOf("Courses")) {
                        showCoursesDialog(newStudent.getCourseList());
                    }
                });
            }
        });
    }

    private void showCoursesDialog(List<Course> courses) {
        // Implement your logic to display detailed information about the courses here
        // You can create a new window, a dialog, or update the existing attributeListview
        // with the detailed information.

        courseTxt.clear();

        for (Course course : courses) {
            courseTxt.appendText(course.toString() + "\n\n");
        }
    }

    private void updateAttributeListView(Student student) {
        ObservableList<String> attributeList = FXCollections.observableArrayList();
        attributeList.add("Name: " + student.getName());
        attributeList.add("ID: " + student.getAcademicId());
        attributeList.add("Phone Number: " + student.getPhoneNum());
        attributeList.add("Email: " + student.getEmail());
        attributeList.add("Address: " + student.getAddress());
        attributeList.add("Major: " + student.getMajor());
        attributeList.add("Admit Date: " + student.getAdmitDate());
        attributeList.add("Courses");
        attributeList.add(String.format("Tuition: $%.2f", student.getTuitionPerSem()));

        attributeListview.setItems(attributeList);
    }

}