public abstract class Team {
	
	// abstract Team Name method, returns String
	public abstract String teamName();
	
	// abstract Pitcher name Method, returns String
	public abstract String pitcherName();
	
	// static method that sets Birthplace to US unless otherwise directed, returns String
	public String birthplace() {
		String country= "United States";
		return country;
	}
	
	//abstract method for Personal Stats that returns an array 
	public abstract String[] personalStats();
	
	// abstract method for 2018 Game Stats, returns an array
	public abstract String[] gameStats18();
	
	// abstract method for 2019 Game Stats, returns an array
	public abstract String[] gameStats19();
}