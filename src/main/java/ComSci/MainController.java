package ComSci;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class MainController 
{
    @FXML
    private TextField passFld;

    @FXML
    private TextField userFld; 

    @FXML
    private Button loginBtn;

    @FXML
    private void onLogin(ActionEvent event) 
    {
        System.out.println("Hello");
    }

    public void initialize() 
    {
    }
}