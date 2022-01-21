import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * This class runs the movie generator app using JavaFX.
 * 
 * @author Matt Stilling
 */
public class GeneratorApp extends Application {
	
	Scene startScene, movieScene;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Movie Generator");
		
		// Starting Scene
		BorderPane startLayout = new BorderPane();
		startScene = new Scene(startLayout, 750, 500);
		
		Label welcomeLabel = new Label("Welcome to Movie Generator");
		startLayout.setTop(welcomeLabel);
		BorderPane.setAlignment(welcomeLabel, Pos.TOP_CENTER);
		
		Button generateButton = new Button("Generate Movie");
		generateButton.setOnAction(event -> primaryStage.setScene(movieScene));
		startLayout.setCenter(generateButton);
		
		Button exitButton1 = new Button("Exit");
		exitButton1.setOnAction(event -> Platform.exit());
		startLayout.setBottom(exitButton1);
		BorderPane.setAlignment(exitButton1, Pos.BOTTOM_RIGHT);
		
		// Movie Scene (shows movie info after movie is generated)
		BorderPane movieLayout = new BorderPane();
		
		Label generatedMovieLabel = new Label("Generated Movie: TBA");
		movieLayout.setTop(generatedMovieLabel);
		BorderPane.setAlignment(generatedMovieLabel, Pos.TOP_CENTER);
		
		VBox movieInfo = new VBox(5);
		Label movieLabel = new Label("This will contain movie info");
		Button returnButton = new Button("Return to Generate Page");
		returnButton.setOnAction(event -> primaryStage.setScene(startScene));
		movieInfo.getChildren().addAll(movieLabel, returnButton);
		movieLayout.setCenter(movieInfo);
		
		Button exitButton2 = new Button("Exit");
		exitButton2.setOnAction(event -> Platform.exit());
		movieLayout.setBottom(exitButton2);
		BorderPane.setAlignment(exitButton2, Pos.BOTTOM_RIGHT);
		
		movieScene = new Scene(movieLayout, 750, 500);
		
		primaryStage.setScene(startScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch();
	}

}
