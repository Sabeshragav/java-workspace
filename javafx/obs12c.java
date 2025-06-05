// JavaFX Controls
// Layout management – StackPane

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.geometry.*;

public class obs12c extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("Layout Demo");
	
		StackPane sp = new StackPane();
		sp.setAlignment(Pos.CENTER);
			
		Button B1 = new Button("Bottom");
		Button B2 = new Button("Middle");
		Button B3 = new Button("Top");
		
		B1.setPrefSize(200,200);
		B2.setPrefSize(150,150);
		B3.setPrefSize(100,100);
			
		sp.getChildren().addAll(B1,B2,B3);
		
		Scene myScene = new Scene(sp, 350, 350);
		myStage.setScene(myScene);
		myStage.show();
	}
}
