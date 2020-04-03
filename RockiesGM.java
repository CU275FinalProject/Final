public class RockiesGM extends Rockies	{

	public String team= super.teamName();
	
	@Override
	public String pitcherName() {
		// TODO Auto-generated method stub
		String pName= "German Marquez";
		return pName;
	}
	@Override
	public String birthplace()	{
		String country= "Venezuela";
		return country;
	}
	@Override
	public String[] personalStats() {
		// TODO Auto-generated method stub
		String[] pStats= {"25", "6'1", "225 lbs", "45", "Right", "Right"};
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
		String[] gStats19= {"2019", "1", "28", "174.0", "174", "35", "96", "92", "175", "4.76"};
		return gStats19;
	}
		
}