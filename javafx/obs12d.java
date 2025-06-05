// JavaFX Application - Factorial Calculator
// Layout management - GridPane

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.scene.text.*;
import javafx.geometry.*;

public class obs12d extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX Application");
	
		GridPane gp = new GridPane();
		gp.setHgap(50);
		gp.setVgap(50);
		gp.setPadding(new Insets(50,50,50,50));

		Label L1 = new Label("Enter Name : ");
		Label L2 = new Label("Message : ");
		Label L3 = new Label("Password : ");
		
		TextField tf1 = new TextField();
		tf1.setPrefColumnCount(15);
		TextField tf2 = new TextField();
		tf1.setPrefColumnCount(15);
		PasswordField ps = new PasswordField();
		ps.setPrefColumnCount(15);
		
		Button B1 = new Button("Hello");
		Button B2 = new Button("Welcome");
				
		gp.add(L1,0,0);
		gp.add(L2,0,1);
		gp.add(L3,0,2);
		
		gp.add(tf1,1,0);
		gp.add(tf2,1,1);
		gp.add(ps,1,2);
		
		gp.add(B1,0,3);
		gp.add(B2,1,3);
		
		B1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				tf2.setText(B1.getText()+" "+tf1.getText());
			}			
		});
		
		B2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				tf2.setText(B2.getText()+" "+tf1.getText());
			}			
		});
		
		Scene myScene = new Scene(gp, 400, 250);
		
		myStage.setScene(myScene);
		myStage.show();
	}
}
