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

public class obs13 extends Application
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
		
		Label L1 = new Label("Enter Number : ");
		L1.setFont(new Font("Times New Roman Bold",15));
		Label L2 = new Label("Factorial : ");
		L2.setFont(new Font("Times New Roman Bold",15));
		
		TextField tf1 = new TextField();
		tf1.setPrefColumnCount(20);
		tf1.setMinHeight(25);
		TextField tf2 = new TextField();
		tf2.setPrefSize(20,25);
		
		tf1.setFont(new Font("Times New Roman Bold",10));
		tf2.setFont(new Font("Times New Roman Bold",10));
		
		Button B1 = new Button("Clear");
		Button B2 = new Button("Submit");
		Button B3 = new Button("Exit");
		
		B1.setFont(new Font("Times New Roman Bold Italic",15));
		B2.setFont(new Font("Times New Roman Bold Italic",15));
		B3.setFont(new Font("Times New Roman Bold Italic",15));
		
		B1.setPrefWidth(75);
		B2.setPrefWidth(75);
		B3.setPrefWidth(75);
		

		gp.add(L1,0,0);
		gp.add(L2,0,1);
		
		gp.add(tf1,1,0);
		gp.add(tf2,1,1);
		
		gp.add(B1,0,2);
		HBox hb = new HBox(75);
		hb.getChildren().addAll(B2,B3);
		gp.add(hb,1,2);
				
		B1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				tf1.setText("Enter Number.");
				tf2.setText("");
				tf1.setStyle("-fx-background-color: pink; -fx-text-fill: red;");
			}			
		});
		
		B2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				int n = Integer.parseInt(tf1.getText());
				long fact=1;
				for(int i=1;i<=n;i++)
					fact=fact*i;
				tf2.setText(Long.toString(fact));
			}			
		});
		B3.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				myStage.close();
			}			
		});
		
		tf1.setOnMouseClicked(new EventHandler<MouseEvent>()
		{
			public void handle(MouseEvent me)
			{
				tf1.setStyle("-fx-background-color: white; -fx-text-fill: black;");
				tf1.clear();
			}
		});
		
		Scene myScene = new Scene(gp, 500, 300);
		
		myStage.setScene(myScene);
		myStage.show();
	}
}
