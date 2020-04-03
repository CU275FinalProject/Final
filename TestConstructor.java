public class TestConstructor {
	public static void main(String[] args) {
		
	int pitcher= 1;
	
		String name= "Margaret";
	
	int year = 2018;
	
	String[] game;
	
	
	// determine which years stats to use for the pitcher
	switch (year) {
	case 2018:	
		game= myPitcher.gameStats18();
	default:
		game= myPitcher.gameStats19();
	}
	
	// determine which pitcher to create an instance of
	if (pitcher == 1)	{
		RockiesGM myPitcher= new RockiesGM();
	}
		
	// display screen
	// first customized portion from scanner
	System.out.println("Hello " + name + ", here are the stats for " + myPitcher.pitcherName()
			+ "'s " + year + " season.\n");
		// display personal stats
		
				// create new array to use for stat display
				String[] personal= myPitcher.personalStats();
				
				// display Team, Name, Nationality, and Age
					//Team
				System.out.print("Team:\t" + myPitcher.team + "\t\t");
					// Home Country
				System.out.println("Home Country:\t" + myPitcher.birthplace() + "\n");
					// Pitchers name
				System.out.print("Name:\t" + myPitcher.pitcherName() + "\t\t");
					//display age
				System.out.println("Age:\t" + personal[0] + "\n");
				
				//display basic personal info
				System.out.println("Basic Player Information:");
					//Height, Weight, and Jersey Number on line 1
				System.out.print("Height:\t" + personal[1] + "\t\t");
				System.out.print("Weight:\t" + personal[2] + "\t\t");
				System.out.println("Jersey Number:\t" + personal[3] + "\n");
				
					// Throws and Bats on line 2
				System.out.print("\tThrows:\t" + personal[4] + "\t\t");
				System.out.println("Bats:\t" + personal[5] + "\n");
				
			// display game stats
				System.out.println("Pitcher Game Statistics");
				// Year, Team Rank, and Games Played = line 1
				System.out.print("Year:\t" + game[0] + "\t");
				System.out.print("Team Rank:\t" + game[1] + "\t");
				System.out.println("Games Played:\t" + game[2] + "\n");
				// IP, hits, and walks
				System.out.print("Innings Pitched:\t" + game[3] + "\t");
				System.out.print("Hits:\t" + game[4] + "\t");
				System.out.println("Walks:\t" + game[5] + "\n");
				// Runs, Earned Runs, and Strike Outs
				System.out.print("Runs:\t" + game[6] + "\t");
				System.out.print("Earned Runs:\t" + game[7] + "\t");
				System.out.println("Strike Outs:\t" + game[8] + "\n");
				// ERA
				System.out.print("\t\tERA (9 * IP / ER):\t" + game[9] + "\t");
	}
}