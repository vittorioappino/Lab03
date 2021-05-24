/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;

public class FXMLController {
	
	private Dictionary dizionario;
	private List<String> inputTextList;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> Menu;

    @FXML
    private TextArea TxtArea;

    @FXML
    private Button BtnSpellCheck;

    @FXML
    private TextArea TxtResult;

    @FXML
    private Label TxtLabelErrors;

    @FXML
    private Button BtnClearText;

    @FXML
    private Label TxtFieldSpeed;


    @FXML
    void doActivation(ActionEvent event) {
    	if(Menu.getValue() !=null) {
    		
    		TxtArea.setDisable(false);
    		TxtResult.setDisable(false);
    		BtnSpellCheck.setDisable(false);
    		BtnClearText.setDisable(false);
    		TxtArea.clear();
    		TxtResult.clear();
    	}else {
    		TxtArea.setDisable(true);
    		TxtResult.setDisable(true);
    		BtnSpellCheck.setDisable(true);
    		BtnClearText.setDisable(true);
    		TxtArea.setText("Seleziona una lingua");
    	}
    }

    @FXML
    void doClearText(ActionEvent event) {
    	TxtArea.clear();
		TxtResult.clear();
		TxtLabelErrors.setText("Number of Errors:");
		TxtFieldSpeed.setText("Spell check Status:");
    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	TxtResult.clear();
    	inputTextList = new LinkedList<String>();
    	
    	if(Menu.getValue() == null ) {
    		TxtArea.setText("Seleziona una lingua!");
    		return;
    	}
    	if(!dizionario.loadDictionary(Menu.getValue())) {
    		TxtArea.setText("Errore nel caricamento del dizionario!");
    		return;
    	}
    	
    	String inputText = TxtArea.getText();   
    	
    	if(inputText.isEmpty()) {
    		TxtArea.setText("Inserisci del testo da correggerre!");
    		return;
    	}
    	
    	inputText = inputText.replaceAll("\n", " ");
    	inputText = inputText.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]]", "");
    	
    	
    	
    }

    @FXML
    void initialize() {
    	assert Menu != null : "fx:id=\"Menu\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtArea != null : "fx:id=\"TxtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert BtnSpellCheck != null : "fx:id=\"BtnSpellCheck\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtResult != null : "fx:id=\"TxtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtLabelErrors != null : "fx:id=\"TxtLabelErrors\" was not injected: check your FXML file 'Scene.fxml'.";
        assert BtnClearText != null : "fx:id=\"BtnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TxtFieldSpeed != null : "fx:id=\"TxtFieldSpeed\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Dictionary model) {
		
		TxtArea.setText("Selezionare una lingua");
		
		Menu.getItems().addAll("English","Italian");
		
		this.dizionario=model;
	}
}


