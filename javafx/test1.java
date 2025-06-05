import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;

public class test1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("JAVA-FX");
        FlowPane fp = new FlowPane(Orientation.VERTICAL, 25, 25);
        fp.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(fp, 400, 450);
        // RadioButton
        ListView<String> lv = new ListView<>();
        lv.getItems().addAll("IT","CSE", "CIVIL", "MECH", "Others");
    
        fp.getChildren().addAll(lv);
        myStage.setScene(myScene);
        myStage.show();
    }
}