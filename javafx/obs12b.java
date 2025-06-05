// JavaFX Controls
// Layout management
// BorderPane

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.geometry.*;

public class obs12b extends Application
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
	
		BorderPane bp = new BorderPane();
		
		Label L1 = new Label("CENTER");
		


		Button B1 = new Button("TOP");
		Button B2 = new Button("RIGHT");
		Button B3 = new Button("BOTTOM");
		Button B4 = new Button("LEFT");
	
		bp.setTop(B1);
		bp.setRight(B2);
		bp.setBottom(B3);
		bp.setLeft(B4);
		bp.setCenter(L1);
		
		BorderPane.setAlignment(B1,Pos.CENTER);
		BorderPane.setAlignment(B2,Pos.CENTER);
		BorderPane.setAlignment(B3,Pos.CENTER);
		BorderPane.setAlignment(B4,Pos.CENTER);
			
		B1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText(B1.getText()+" button clicked.");
			}
		});
		
		B2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText(B2.getText()+" button clicked.");
			}
		});
		
		B3.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText(B3.getText()+" button clicked.");
			}
		});
		
		B4.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText(B4.getText()+" button clicked.");
			}
		});
	
		Scene myScene = new Scene(bp, 300, 100);
		
		myStage.setScene(myScene);
		myStage.show();
	}
}
