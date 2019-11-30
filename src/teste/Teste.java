package teste;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Teste extends Application {
    public static void main(String[] args) {

        launch(args);  
    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent layout = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(layout,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
                
                
    
    }
    
}
