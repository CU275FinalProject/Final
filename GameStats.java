package application;

public interface GameStats	{
	
	// Obtain game stats for each pitcher
	public double pitcherStats(int a, int b);

	double[] pitcherStats(int year, String pitcher);
	
	public String[] pitcherStats(String pitcher);
}