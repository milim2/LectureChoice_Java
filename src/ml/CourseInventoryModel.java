/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 *
 * @author irene
 */
public class CourseInventoryModel {
    // member vars
    private ArrayList<Course> courses;
    private ArrayList<String> categories; // use HashMap
    // more member vars
    
    // ctor
    public CourseInventoryModel(){
        courses = new ArrayList<Course>(); // create arraylist - open file and get the lines
    }
    // read data file and put course items to ArrayList -- parse DAT file
    public void readCourseFile(File file){
        if(file.isDirectory()){
            
        } 
        else {
            // if it's not a directory
           
        }
    }
    // save ArrayList of courses to a file -- save DAT file
    public void saveCourseFile(File file){
        
    }
    
    // add other interfaces; getCourse(), getCourseCount(), etc.
    
    
    
}
