package ComSci;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class App extends Application {
	private static Scene scene;
	private static Parent appRoot;

    @Override 
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		appRoot = FXMLLoader.load(getClass().getResource("App.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
		
		stage.setRoot(root);
    }

	public static void login() throws Exception
	{
		scene.setRoot(appRoot);
	}
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
