// JavaFX Controls
// Menu

import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.layout.*; 
import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.*;
import javafx.scene.input.*; 
import javafx.scene.text.*;
import javafx.geometry.*;

public class menu extends Application
{
	public static void main(String []args)
	{
		launch(args);		
	}
	
	public void init(){}
	public void stop(){}
	
	public void start(Stage myStage)
	{
		myStage.setTitle("JavaFX - Menu");
	
		BorderPane bp = new BorderPane();
		
		Label L1 = new Label();
		L1.setWrapText(true);
		L1.setTextAlignment(TextAlignment.JUSTIFY);
		L1.setMaxWidth(150);	
		
		// create menubar
		MenuBar mb = new MenuBar();
		
		// create menu with mnemonic
		Menu file = new Menu("_File");
		Menu edit = new Menu("_Edit");
		Menu help = new Menu("_Help");
		
		// create menuitems
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		MenuItem close = new MenuItem("Close");
		MenuItem exit = new MenuItem("Exit");
		
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		
		MenuItem Help = new MenuItem("Help");
		MenuItem about = new MenuItem("About");
		
		// add menuitems to menu
		file.getItems().addAll(open, save, close, new SeparatorMenuItem(), exit);
		
		edit.getItems().addAll(cut, copy, paste);
		help.getItems().addAll(Help, new SeparatorMenuItem(), about);
		
		// add menu to menu bar
		mb.getMenus().addAll(file,edit,help);
		
		// place menubar in scene using border layout
		bp.setTop(mb);
		bp.setCenter(L1);
		
		// Event hadnling 
		about.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText("This is a demo program for JavaFX Menu and event handling.");
			}
		});
		
		exit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				Platform.exit();
			}
		});
		
		// Add keyboard accelerators 
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
		exit.setAccelerator(KeyCombination.keyCombination("shortcut+X"));
	
		help.setAccelerator(KeyCombination.keyCombination("shortcut+H"));
		about.setAccelerator(KeyCombination.keyCombination("shortcut+A"));
		
		
		// Context Menu
		ContextMenu cm = new ContextMenu();
		
		MenuItem clear = new MenuItem("Clear");
		MenuItem  restore = new MenuItem("Restore");

		cm.getItems().addAll(clear, restore);
		L1.setContextMenu(cm);
		
		clear.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText("");
			}
		});
		
		restore.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L1.setText("This is a demo program for JavaFX Menu and event handling.");
			}
		});
		
		// Submenus 
		// Radiobuttons in menus
		
		Menu gender = new Menu("Gender");
		
		RadioMenuItem male = new RadioMenuItem("Male");
		RadioMenuItem female = new RadioMenuItem("Female");
		
		ToggleGroup tg = new ToggleGroup();
		male.setToggleGroup(tg);
		female.setToggleGroup(tg);
		male.setSelected(true);
		
		gender.getItems().addAll(male,female);
		
		// Submenus
		// Checkboxes in menus
		
		Menu dept = new Menu("Dept");
		
		CheckMenuItem it = new CheckMenuItem("IT");
		CheckMenuItem cse = new CheckMenuItem("CSE");
		CheckMenuItem others = new CheckMenuItem("Others");
		
		dept.getItems().addAll(it,cse,new SeparatorMenuItem(), others);
		
		// add the two menus to main menu 
		Menu btn = new Menu("_Button");
		btn.getItems().addAll(gender,dept);
		
		// add menus to menubar
		mb.getMenus().add(btn);
		
		// Menu button
		
		MenuButton mbtn = new MenuButton("Footer");
		MenuItem status = new MenuItem("Status");
		MenuItem hitcount = new MenuItem("Hit count");
		mbtn.getItems().addAll(status,hitcount);
		
		Label L2 = new Label();
		HBox hb = new HBox(10);
		hb.getChildren().addAll(mbtn, L2);
		bp.setBottom(hb);
		
		status.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L2.setText("JavaFX Menu demonstrated!");
			}
		});
		
		hitcount.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				L2.setText("Hit count = 232");
			}
		});
		
		Scene myScene = new Scene(bp, 300, 200);
		myStage.setScene(myScene);
		myStage.show();
	}
}
