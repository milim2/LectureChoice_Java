/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author irene
 */
public class MainController implements Initializable {

    
    // member vars
    private Stage stage; // remember its stage reference here
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    @FXML
    private void HandleMenuOpen(ActionEvent event) {
        // open file-- create fileChooser dialog
        FileChooser fileChooser = new FileChooser();
        // ----------
        fileChooser.showOpenDialog(null); // show windows
        }
        
//        fileChooser.setTitle("Open Course List File...");
//        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"),
//                new FileChooser.ExtensionFilter("DAT", "*.dat"), 
//                new FileChooser.ExtensionFilter("TXT", "*.txt"));
//        file = fileChooser.showOpenDialog(stage);
//        if(file == null) return;
//        
//        // pass file to Model component to read
//        model.readCoursefile(file);
//    }
//
//    @FXML
//    private void handleMenuSave(ActionEvent event) {
//        // save file
//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Save Course List File...");
//        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"),
//                new FileChooser.ExtensionFilter("DAT", "*.dat"), 
//                new FileChooser.ExtensionFilter("TXT", "*.txt"));
//        file = fileChooser.showOpenDialog(stage);
//        if(file == null) return;
//        
//        // pass file to Model component to read
//        model.saveCoursefile(file);
//    }
//
//    @FXML
//    private void handleMenuClose(ActionEvent event) {
//        // terminate program
//        Platform.exit();
//    }
//
//    @FXML
//    private void handleMenuAbout(ActionEvent event) {
//    }
//    
//    private Stage stage = null;
//    
//    public void setStage(Stage stage){
//        this.stage = stage;
//    }
//    
//  
      // remember stage reference -- 
    public void setStage(Stage stage){
        this.stage = stage;
    }

    
}

