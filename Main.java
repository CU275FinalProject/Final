package application;
	
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	//encapsulation
	private static String uname;

	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,500,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {  
			e.printStackTrace();
		}
	}
	
	// Constructor Excepetion
	public Main userName(String uname)	{
		if (uname == null || uname.isEmpty()) {
			throw new RuntimeException("Must enter a name in field");
		}
		else	{
			this.setUname(uname);
			return this;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		// display options
		Pitchers opt= new Pitchers();
		// display array of teams and pitchers
		System.out.println("Pitcher Options: ");
		System.out.println(opt.dispOptions());
		
		System.out.println("Please Enter Your Name");
		String name= input.nextLine();
		
		System.out.println("Enter Team:");
		String team= input.nextLine();
		
		System.out.println("Enter Pitcher:");
		String pitcher= input.nextLine();
		
		System.out.println("Pick a year:");
		int year= input.nextInt();
		
		
		
		launch(args);
		
	}

}
