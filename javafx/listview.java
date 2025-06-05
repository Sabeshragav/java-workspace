import javafx.application.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.geometry.*;

public class listview extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void init() {

    }

    public void stop() {

    }

    public void start(Stage mystage) {
        mystage.setTitle("ListView");
        FlowPane fp = new FlowPane(Orientation.VERTICAL,25,25);
        fp.setAlignment(Pos.CENTER);
        Label l1 = new Label("Selected department");
        Label l2 = new Label("Selected index");
        ObservableList<String> dept = FXCollections.observableArrayList();
        dept.addAll("IT","CSE","EEE","ECE","CIVIL");
        ListView<String> lv = new ListView<>(dept);
        lv.setPrefSize(200,100);
        lv.setEditable(true);
        fp.getChildren().addAll(lv,l1,l2);
        Scene myScene = new Scene(fp,300,400);
        lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String>changed,String oldval,String newval){
                l1.setText("Selected department "+newval);
            }
        });

        lv.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number>changed,Number oldval,Number newval){
                l2.setText("Selected index "+newval);
            }
        });
        mystage.setScene(myScene);
        mystage.show();

    }
}