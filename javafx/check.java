import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class check extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a ComboBox with fruits
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Apple", "Banana", "Orange", "Grape", "Pineapple");
        comboBox.setValue("Select a fruit");

        // Create a ChoiceBox with fruits
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Apple", "Banana", "Orange", "Grape", "Pineapple");
        choiceBox.setValue("Select a fruit");

        // Layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(comboBox, choiceBox);

        // Scene
        Scene scene = new Scene(root, 200, 150);

        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("ComboBox and ChoiceBox Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
