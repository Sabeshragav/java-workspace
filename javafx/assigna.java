// JavaFX Controls
// ListView
// Single selection - by item and index

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

public class assigna extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX - ListView");
	
		FlowPane fp = new FlowPane(Orientation.VERTICAL,15,15);
		fp.setAlignment(Pos.CENTER);
		
		Label L1 = new Label();
		Label L2 = new Label();
		
		// Create list and add it to ViewList
		ObservableList<String> dept = FXCollections.observableArrayList( 
"IT","CSE", "CIVIL", "MECH", "Others");
		ListView<String> lv = new ListView<String>(dept);
		lv.setPrefSize(100,75);
		
		//lv.getItems().add("AUTO");
		//lv.getItems().remove("Others");
		
		MultipleSelectionModel<String> lvsel = lv.getSelectionModel();
		
		// Event Handling – ChangeListener - Item
		lvsel.selectedItemProperty().addListener(new ChangeListener<String>()
		{
			public void changed(ObservableValue<? extends String> changed, 
String oldval, String newval)
			{
				L1.setText("Selected department is "+newval);
			}
		});
		
		// Event Handling – ChangeListener - Index
		lvsel.selectedIndexProperty().addListener(new ChangeListener<Number>()
		{
			public void changed(ObservableValue<? extends Number> changed, 
Number oldval, Number newval)
			{
				L2.setText("Index of department is "+newval);
			}
		});
		
		fp.getChildren().addAll(lv, L1, L2);
		
		Scene myScene = new Scene(fp, 300, 200);
		myStage.setScene(myScene);
		myStage.show();
	}
}