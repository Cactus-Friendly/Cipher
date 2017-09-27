/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciphergit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author nzoel
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea plainTextField;
    @FXML
    private Button cipherButton;
    @FXML
    private RadioButton encryptRadioButton;
    @FXML
    private ToggleGroup RadioButtons;
    @FXML
    private RadioButton decryptRadioButton;
    @FXML
    private TextField seedTextBox;
    @FXML
    private TextArea cipheredTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cipherButton_Click(ActionEvent event) {
    }
    
}
