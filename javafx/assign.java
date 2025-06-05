//javafx
//checkbox,radiobtn,toggle,listview,button

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

public class assign extends Application {
    public static void main(String []args) {
        launch(args);		
    }
	
    public void init() {}
    public void stop() {}

    public void start(Stage mystage) {
        mystage.setTitle("JAVAFX");
        FlowPane fp = new FlowPane(Orientation.VERTICAL, 25, 25);
        fp.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(fp, 500, 500);

        // Checkbox
        CheckBox cb1 = new CheckBox("OOP");
        CheckBox cb2 = new CheckBox("DPCO");
        CheckBox cb3 = new CheckBox("MATHS");
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        Label l1 = new Label("Select subjects by checkbox ");
        cb1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cb1.isSelected() == true)
                    l1.setText("OOP selected");
            }
        });
        cb2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cb2.isSelected() == true)
                    l1.setText("DPCO selected");
            }
        });
        cb3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (cb3.isSelected() == true)
                    l1.setText("MATHS selected");
            }
        });

        Separator sp1 = new Separator();

        // RadioButton
        RadioButton rb1 = new RadioButton("Male");
        RadioButton rb2 = new RadioButton("FeMale");
        HBox hb = new HBox(35);
        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        hb.getChildren().addAll(rb1,rb2);
        Label l2 = new Label("Select Gender ");
        rb1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                l2.setText("Gender is Male");
            }
        });
        rb2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                l2.setText("Gender is FeMale");
            }
        });

        Separator sp2 = new Separator();

        // ToggleButton
        ToggleButton tb = new ToggleButton("Toggle btn");
        Label l3 = new Label("Click Toggle btn");
        tb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (tb.isSelected() == true)
                    l3.setText("Toggle btn is ON");
                else
                    l3.setText("Toggle btn is OFF");
            }
        });

        Separator sp3 = new Separator();

        // ListView
        Label l4 = new Label("");
        Label l5 = new Label("");
        ObservableList<String> dept = FXCollections.observableArrayList();
        dept.addAll("IT", "CSE", "EEE", "ECE", "CIVIL");
        ListView<String> lv = new ListView<>(dept);
        lv.setPrefSize(200, 100);
        lv.setEditable(true);
        lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> changed, String oldval, String newval) {
                l4.setText("Selected department " + newval);
            }
        });

        lv.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> changed, Number oldval, Number newval) {
                l5.setText("Selected index " + newval);
            }
        });

        Separator sp4 = new Separator();

        // Button
        Button b1 = new Button("Complete");
        Label l6 = new Label("");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                l6.setText("Completed");
            }
        });

        fp.getChildren().addAll(cb1, cb2, cb3, l1, sp1, hb, l2, sp2, tb, l3, sp3, lv, l4, l5, sp4, b1, l6);

        
        mystage.setScene(myScene);
        mystage.show();
    }
}
