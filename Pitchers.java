package application;

import java.util.ArrayList;

public class Pitchers	{
	
	public static ArrayList<String> dispOptions()	{
		ArrayList<String> teams= new ArrayList<String>();
		teams.add("Colorado Rockies");
		teams.add("New York Yankees");
		teams.add("Boston Red Sox");
		
		ArrayList<String> pitchers= new ArrayList<String>();
		pitchers.add("German Marquez");
		pitchers.add("Eduardo Rodriguez");
		pitchers.add("Masahiro Tanaka");
		pitchers.add("Jon Gray");
		pitchers.add("Kyle Freeland");
	    pitchers.add("Rick Porcello");
	    pitchers.add("Brandon Workman");
	    pitchers.add("Masahiro Tanaka");
	    pitchers.add("J.A. Happ");
	    pitchers.add("James Paxton");
		
	    ArrayList<String> combo= new ArrayList<String>();
	    combo.add(teams.get(0));
	    combo.add(pitchers.get(0));
	    combo.add(pitchers.get(1));
	    combo.add(pitchers.get(2));
	    combo.add(teams.get(1));
	    combo.add(pitchers.get(3));
	    combo.add(pitchers.get(4));
	    combo.add(pitchers.get(5));
	    combo.add(teams.get(2));
	    combo.add(pitchers.get(6));
	    combo.add(pitchers.get(7));
	    combo.add(pitchers.get(8));
	

		  System.out.println("");
		  System.out.println("Pitcher Options: ");
		  System.out.print("Team: \t");

		  for(int i = 0; i <= teams.size()-1; i++){
		      System.out.print(teams.get(i) + "\t");
		   }

		   System.out.println("");
		   System.out.println("Exam Mark: \t");
		   for(int i = 0; i <= pitchers.size()-1; i++){
		      System.out.print(pitchers.get(i) + "\t");
		   }
		   System.out.println("");
	    return combo;
	}
	
}