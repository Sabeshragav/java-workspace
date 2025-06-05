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

public class test extends Application {
    public static void main(String []args) {
        launch(args);		
    }
	
    public void init() {}
    public void stop() {}

    public void start(Stage myStage) {
        myStage.setTitle("JAVAFX");
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


        
        Button bt = new Button("Submit");

        // bt.setOnAction(new EventHandler<ActionEvent>(){
        //     public void handle(ActionEvent ae){
        //         StringBuffer s = new StringBuffer();
        //         if(cb1.isSelected()==true)
        //             str.append(" OOP ");
        //         if(cb3.isSelected()==true)
        //             str.append(" MATH ");
        //         if(cb2.isSelected()==true)
        //             str.append(" DPCO ");
        //         l1.setText("Selected Subjects are "+s.toString());
                
        //     }
        // });

        cb1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                StringBuffer str = new StringBuffer();
                if (cb1.isSelected() == true)
                    str.append(" OOP ");
                l1.setText(str.toString());
                
                    
            }
        });
        cb2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                StringBuffer str = new StringBuffer();
                if (cb2.isSelected() == true)
                    str.append(" DPCO ");
                l1.setText(str.toString());
            }
        });
        cb3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                StringBuffer str = new StringBuffer();
                if (cb3.isSelected() == true)
                    str.append(" MATHS ");
                l1.setText(str.toString());
            }
        });
        fp.getChildren().addAll(l1,cb1,cb2,cb3);
        myStage.setScene(myScene);
        myStage.show();
    }
}
