// JavaFX Controls
// ListView
// Multiple selection

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

public class assign6b extends Application
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
		Scene myScene = new Scene(fp, 300, 200);
		
		Label L1 = new Label();
		Label L2 = new Label();
		
		// Create list and add it to ViewList
		ObservableList<String> dept = FXCollections.observableArrayList( 
"IT","CSE", "CIVIL", "MECH", "Others");
		ListView<String> lv = new ListView<String>(dept);
		lv.setPrefSize(100,75);
				
		MultipleSelectionModel<String> lvsel = lv.getSelectionModel();
		lvsel.setSelectionMode(SelectionMode.MULTIPLE);
		
		// Event Handling – ChangeListener - Item
		lvsel.selectedItemProperty().addListener(new ChangeListener<String>()
		{
			public void changed(ObservableValue<? extends String> changed, 
String oldval, String newval)
			{
				StringBuffer str = new StringBuffer();
				ObservableList<String> selvalues = lvsel.getSelectedItems();
				
				for(String s:selvalues)
					str.append(s+" ");
				
				L1.setText("Selected department is "+str.toString());
			}
		});
		
		fp.getChildren().addAll(lv, L1);
		
		
		myStage.setScene(myScene);
		myStage.show();
	}
}
