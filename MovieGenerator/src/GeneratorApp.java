import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

/**
 * This class runs the movie generator app using JavaFX.
 * 
 * @author Matt Stilling
 */
public class GeneratorApp extends Application {

	public void start(final Stage stage) {
		stage.setTitle("Movie Generator");
		BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 750, 500);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

}
