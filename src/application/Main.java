package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//aqui é o link que carrega a view
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);//ajusta o menu para ele ficar fixado ao tamanho da janela
			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");//titulo da janela criada
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
