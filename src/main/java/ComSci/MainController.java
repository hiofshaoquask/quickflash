package ComSci;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class MainController {
    @FXML
    private TextField passFld;

    @FXML
    private TextField userFld;

    @FXML
    private Button loginBtn;

    @FXML
    private void onLogin(ActionEvent event) throws Exception {
        App.switchLogin();
    }

    public void initialize() throws Exception {
    }
}