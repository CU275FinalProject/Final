public class YankeesJP extends Yankees	{

	public String team= super.teamName();
	
	@Override
	public String pitcherName() {
		// TODO Auto-generated method stub
		String pName= "James Paxton";
		return pName;
	}
	@Override
	public String birthplace()	{
		String country= "Canada";
		return country;
	}
	@Override
	public String[] personalStats() {
		// TODO Auto-generated method stub
		String[] pStats= {"31", "6'4", "235 lbs", "65", "Left", "Left"};
		return pStats;
	}

	@Override
	public String[] gameStats18() {
		// TODO Auto-generated method stub
		String[] gStats18= {"2018", "2", "33", "196.0", "179", "57", "90", "82", "230", "3.77"};
		return gStats18;
	}

	@Override
	public String[] gameStats19() {
		// TODO Auto-generated method stub
		String[] gStats19= {"2019", "3", "29", "150.2", "138", "55", "71", "64", "186", "3.82"};
		return gStats19;
	}
		
}