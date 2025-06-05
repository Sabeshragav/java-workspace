

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.*;
import java.lang.*;

public class obs11 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void init() {

    }

    public void stop() {

    }

    public void start(Stage myStage) {
        myStage.setTitle("Mouse-Key Handling");
        FlowPane fp = new FlowPane(Orientation.VERTICAL, 25,25);
        fp.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(fp, 500, 200);
        myStage.setScene(myScene);
        Label l1 = new Label("Key Event Handling");
        Label l2 = new Label("Press a key");
        Label l3 = new Label("Mouse Event Handling");
        Label l4 = new Label("Mouse Positon");
        fp.getChildren().addAll(l1, l2,l3,l4);
        
        
        myScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                l1.setText("Key pressed is " + ke.getCode().toString());
            }
        });

        myScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                l1.setText("Key released is " + ke.getCode().toString());
            }
        });

        myScene.setOnKeyTyped(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                StringBuffer str = new StringBuffer();
                str.append(ke.getCharacter());
                l2.setText("Key Typed = "+str.toString());
            }
        });

        myScene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                int count = me.getClickCount();
                StringBuffer str1 = new StringBuffer();
                switch (me.getButton()) {
                    case PRIMARY:
                        str1.append("PRIMARY BUTTON");
                        break;
                    case MIDDLE:
                        str1.append("MIDDLE BUTTON ");
                        break;
                    case SECONDARY:
                        str1.append("SECONDARY BUTTON ");
                        break;
                }
                if (count > 1)
                    str1.append(" DOUBLE CLICKED");
                else
                    str1.append(" CLICKED");
                l3.setText(str1.toString());
            }
        });

        myScene.setOnMouseMoved(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                double x = me.getSceneX();
                double y = me.getSceneY();
                String s = "Mouse position = ("+ x + "," + y +")";
                l4.setText(s.toString());
            }
        });

        myStage.setScene(myScene);
        myStage.show();
    }
}