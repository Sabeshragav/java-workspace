// JavaFX Controls
// Layout management
// FlowPane, HBox, VBox

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.geometry.*;

public class obs12a extends Application
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
	
		FlowPane fp = new FlowPane(Orientation.VERTICAL,25,25);
		fp.setAlignment(Pos.CENTER);
		HBox hb = new HBox(35);
		VBox vb = new VBox(25);
		
		Separator sp1 = new Separator();
		sp1.setPrefWidth(100);
		Separator sp2 = new Separator();
		sp2.setPrefWidth(100);
		Separator sp3 = new Separator();
		sp3.setPrefWidth(100);
		
		Label L1 = new Label("JavaFX Layout Demo.");
		Label L2 = new Label("Initial state.");
		
		CheckBox C1 = new CheckBox("IT");
		CheckBox C2 = new CheckBox("CSE");
		CheckBox C3 = new CheckBox("Others");
	
		Button B1 = new Button("Clear");
		Button B2 = new Button("Submit");
	
		vb.getChildren().addAll(C1,C2,C3);
		hb.getChildren().addAll(B1,B2);
	
		fp.getChildren().addAll(L1,sp1,vb,sp2,hb,sp3,L2);
	
		B1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				C1.setSelected(false);
				C2.setSelected(false);
				C3.setSelected(false);
				
				L2.setText("Selection cleared.");
			}
		});
		
		B2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				StringBuffer str = new StringBuffer("Selected values are : ");
				
				if(C1.isSelected()==true)
					str.append("IT ");
				if(C2.isSelected()==true)
					str.append("CSE ");
				if(C3.isSelected()==true)
					str.append("Others ");
				
				L2.setText(str.toString());
			}
		});
	
		Scene myScene = new Scene(fp, 300, 300);
		myStage.setScene(myScene);
		myStage.show();
	}
}
