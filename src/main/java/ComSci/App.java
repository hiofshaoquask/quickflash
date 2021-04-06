package ComSci;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class App extends Application {
	private static Scene primaryScene;
    private static Parent loginRoot;
    private static Parent appRoot;

    @Override 
    public void start(Stage stage) throws Exception
    {
        loginRoot = FXMLLoader.load(getClass().getResource("Main.fxml"));
		appRoot = FXMLLoader.load(getClass().getResource("App.fxml"));
        
        primaryScene = new Scene(loginRoot);
        stage.setTitle("Quick Learn");
        stage.setScene(primaryScene);
        stage.show();
    }

    public static void switchDefault() throws Exception
    {
        primaryScene.setRoot(loginRoot);
    }

    public static void switchLogin() throws Exception
    {
        primaryScene.setRoot(appRoot);
    } 
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
