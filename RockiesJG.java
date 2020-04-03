public class RockiesJG extends Rockies	{

	public String team= super.teamName();
	
	@Override
	public String pitcherName() {
		// TODO Auto-generated method stub
		String pName= "John Gray";
		return pName;
	}

	@Override
	public String[] personalStats() {
		// TODO Auto-generated method stub
		String[] pStats= {"28", "6'4", "227 lbs", "55", "Right", "Right"};
		return pStats;
	}

	@Override
	public String[] gameStats18() {
		// TODO Auto-generated method stub
		String[] gStats18= {"2018", "4", "31", "172.1", "180", "52", "102", "98", "183", "5.12"};
		return gStats18;
	}

	@Override
	public String[] gameStats19() {
		// TODO Auto-generated method stub
		String[] gStats19= {"2019", "2", "26", "150.0", "147", "56", "70", "64", "150", "3.84"};
		return gStats19;
	}
		
}