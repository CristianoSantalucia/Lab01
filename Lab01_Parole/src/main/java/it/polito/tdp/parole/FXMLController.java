package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController
{
	Parole model; 

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtParola;
    @FXML
    private Button btnInserisci;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnReset;
    @FXML
    private TextArea txtPerformance;

	// 
	@FXML
	void doInsert(ActionEvent event)
	{
		long t1 = System.nanoTime(); // 
		model.addParola(""+txtParola.getText());
		long t2 = System.nanoTime(); // 

		aggiornaTesto();
		txtPerformance.setText(""+(t2-t1)/1e3+" nanoosecondi"); // 
	}
	@FXML
	void doReset(ActionEvent event)
	{
		long t1 = System.nanoTime(); // 
		
		model.reset();
		
		long t2 = System.nanoTime(); // 
		
		aggiornaTesto();

		txtPerformance.setText(""+(t2-t1)/1e3+" nanoosecondi"); // 
	}
	@FXML
	void cancellaParola()
	{
		long t1 = System.nanoTime(); // 

		String s = txtResult.getSelectedText();
		model.cancella(s);
		
		long t2 = System.nanoTime(); //

		aggiornaTesto();
		
		txtPerformance.setText(""+(t2-t1)/1e3+" nanoosecondi"); // 
	}
	private void aggiornaTesto()
	{
		txtParola.clear();
		txtResult.clear();
		txtResult.setText(model.stampaLista());
	}

	@FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
    }

	public void setModel(Parole model)
	{
		this.model = model;
	}
}
