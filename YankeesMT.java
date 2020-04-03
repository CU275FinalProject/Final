public class YankeesMT extends Yankees	{

	public String team= super.teamName();
	
	@Override
	public String pitcherName() {
		// TODO Auto-generated method stub
		String pName= "Masahiro Tanaka";
		return pName;
	}
	@Override
	public String birthplace()	{
		String country= "Japan";
		return country;
	}
	@Override
	public String[] personalStats() {
		// TODO Auto-generated method stub
		String[] pStats= {"31", "6'3", "215 lbs", "19", "Right", "Right"};
		return pStats;
	}

	@Override
	public String[] gameStats18() {
		// TODO Auto-generated method stub
		String[] gStats18= {"2018", "2", "27", "156.0", "141", "35", "68", "65", "159", "3.75"};
		return gStats18;
	}

	@Override
	public String[] gameStats19() {
		// TODO Auto-generated method stub
		String[] gStats19= {"2019", "1", "32", "182.0", "186", "40", "95", "90", "149", "4.45"};
		return gStats19;
	}
		
}