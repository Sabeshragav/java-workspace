// JavaFX Controls
// ChoiceBox

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

public class assignc extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX - ChoiceBox");
	
		FlowPane fp = new FlowPane(Orientation.VERTICAL,15,15);
		fp.setAlignment(Pos.CENTER);
		
		Label L1 = new Label();
		
		// Create list and add it to Choicebox
		ObservableList<String> dept = FXCollections.observableArrayList( 
"IT","CSE", "CIVIL", "MECH", "Others");
		ChoiceBox<String> choice = new ChoiceBox<String>(dept);
		choice.setValue("IT");
		
		
		SingleSelectionModel<String> choicesel = choice.getSelectionModel();
		
		// Event Handling – ChangeListener - Item
		choicesel.selectedItemProperty().addListener(new ChangeListener<String>()
		{
			public void changed(ObservableValue<? extends String> changed, 
String oldval, String newval)
			{
				L1.setText("Selected department is "+newval);
			}
		});
				
		fp.getChildren().addAll(choice, L1);
		
		Scene myScene = new Scene(fp, 300, 200);
		myStage.setScene(myScene);
		myStage.show();
	}
}
