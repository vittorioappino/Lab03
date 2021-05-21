/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	private Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton MenuLanguage;

    @FXML
    private TextArea TxtArea;

    @FXML
    private TextArea TxtResult;

    @FXML
    private Label TxtLabelErrors;

    @FXML
    private Label TxtFieldSpeed;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert MenuLanguage != null : "fx:id=\"MenuLanguage\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtArea != null : "fx:id=\"TxtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtResult != null : "fx:id=\"TxtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtLabelErrors != null : "fx:id=\"TxtLabelErrors\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtFieldSpeed != null : "fx:id=\"TxtFieldSpeed\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Dictionary model) {
		this.model=model;
	}
}


