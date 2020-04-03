package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SampleController {

    @FXML
    private Label nameOutput;

    @FXML
    private Label pitcherName;

    @FXML
    private Label teamName;

    @FXML
    private Label age;

    @FXML
    private Label country;

    @FXML
    private Label height;

    @FXML
    private Label weight;

    @FXML
    private Label throwhand;

    @FXML
    private Label bats;

    @FXML
    private Label gamesPlayed;

    @FXML
    private Label teamRank;

    @FXML
    private Label era;

    @FXML
    private Label ip;

    @FXML
    private Label h;

    @FXML
    private Label bb;

    @FXML
    private Label so;

    @FXML
    private Label r;

    @FXML
    private Label er;

    @FXML
    private Button closeButton;

    @FXML 
    protected void outputDisplay(String pitcher)	{
    	
    }
    
    
    
    @FXML
    void closeButtonAction(ActionEvent event) {
    	
    	// get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

    }

}
