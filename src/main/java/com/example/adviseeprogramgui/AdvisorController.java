package com.example.adviseeprogramgui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;

public class AdvisorController {

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
    private TextArea attributeTextArea;

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

    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    @FXML
    void clickAddButton(ActionEvent event) {

    }

    @FXML
    void clickDeleteButton(ActionEvent event) {

    }

    @FXML
    void clickEditButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ArrayList<Course> c = new ArrayList<>();
        c.add(new Course("CMPSC221", 3.0, 100.0));
        c.add(new Course("MATH230", 4.0, 75.0));
        Student s = new Student("Brian", "", "Tran", "bzt5255", "111-111-1111",
                "bzt5255@psu.edu", "69 Fourtwenty Ave Media, PA 69420", "Computer Science",
                "July 7, 2022", c);
        studentList.add(s);
        studentListview.setItems(studentList);
        studentListview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() {
            public void changed(ObservableValue<? extends Student> observableValue, Student oldStudent, Student newStudent) {
                ObservableList<String> attributeList = FXCollections.observableArrayList();
                attributeList.add(newStudent.getFirstName());
                attributeList.add(newStudent.getMiddleName());
                attributeList.add(newStudent.getLastName());
                attributeList.add(newStudent.getAcademicId());
                attributeList.add(newStudent.getPhoneNum());
                attributeList.add(newStudent.getEmail());
                attributeList.add(newStudent.getAddress());
                attributeList.add(newStudent.getMajor());
                attributeList.add(newStudent.getAdmitDate());
                attributeListview.setItems(attributeList);
            }
        });
    }
}
