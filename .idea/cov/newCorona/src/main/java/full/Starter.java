package full;

import full.model.RetrieveData;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Starter extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene mainscene = new Scene(new StackPane(new Label("Main Stackpane")), 500,300);
        primaryStage.setScene(mainscene);
        primaryStage.setTitle("Covid Info Zentrum");
        primaryStage.show();
        TextField textField = new TextField(RetrieveData);
        VBox vBox = new VBox(textArea,
                new Label("Sind da Daten?"));
        Scene scene = new Scene(vBox,400,200);
        primaryStage.setScene(scene);
    }
}
