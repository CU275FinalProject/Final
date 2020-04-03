public class RockiesKF extends Rockies	{

	public String team= super.teamName();
	
	@Override
	public String pitcherName() {
		// TODO Auto-generated method stub
		String pName= "Kyle Freeland";
		return pName;
	}

	@Override
	public String[] personalStats() {
		// TODO Auto-generated method stub
		String[] pStats= {"26", "6'4", "201 lbs", "21", "Left", "Left"};
		return pStats;
	}

	@Override
	public String[] gameStats18() {
		// TODO Auto-generated method stub
		String[] gStats18= {"2018", "1", "33", "202.1", "182", "70", "64", "64", "173", "2.85"};
		return gStats18;
	}

	@Override
	public String[] gameStats19() {
		// TODO Auto-generated method stub
		String[] gStats19= {"2019", "4", "22", "104.1", "126", "39", "85", "78", "79", "6.73"};
		return gStats19;
	}
		
}