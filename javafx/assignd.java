// JavaFX Controls
// ComboBox

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.input.*; 
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;


public class assignd extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX - ComboBox");
	
		FlowPane fp = new FlowPane(Orientation.VERTICAL,15,15);
		fp.setAlignment(Pos.CENTER);
		
		Label L1 = new Label();
		
		// Create list and add it to ViewList
	

		ComboBox<String> combo = new ComboBox<>();
		combo.getItems().addAll("IT","CSE", "CIVIL", "MECH", "Others");
		combo.setValue("CSE");

				
		// Event Handling 
		combo.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText("Selected department is " +  combo.getValue());
			}
		});
		
		fp.getChildren().addAll(combo, L1);
		
		Scene myScene = new Scene(fp, 300, 200);
		myStage.setScene(myScene);
		myStage.show();
	}
}
