
public class GitTehtava {

	public static void main(String[] args) {
		

	}

}//

class Dishwasher
{
	private int programme;
	private boolean isOn;
	
	
	public boolean getIsOn()
	{
		return isOn;
	}
	
	// default constructor
	public Dishwasher()
	{
	
	programme = 0;
	isOn=false;
	
}


	public Dishwasher(int chosenone)
	{
		isOn = false;
		programme = chosenone;
		
		
	}
	
	public Dishwasher(int chosenone, boolean turnOnOff)
	{
		programme = chosenone;
		isOn = turnOnOff;
	
	}
}
