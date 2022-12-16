
public class GitTehtava {

	public static void main(String[] args) {
		
	Dishwasher pesukone = new Dishwasher(1,true);
		
		pesukone.setProgramme(3);
		System.out.println(pesukone.getIsOn());
	}

	

}// Mainin lopetus

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
	printData();
	
}


	public Dishwasher(int chosenone)
	{
		isOn = false;
		programme = chosenone;
		printData();
		
		
	}
	
	public Dishwasher(int chosenone, boolean turnOnOff)
	{
		programme = chosenone;
		isOn = turnOnOff;
		printData();
	
	}
	
	// metodit
	
		public void setProgramme (int program)
		{
			if (program == 1)
			{
				System.out.println("Normal");
			}
			else if (program == 2)
			{
				System.out.println("Auto");
			}
			else
			{
				System.out.println("Intensive");
			}
		}
		
		private void printData()
		{
			System.out.println("Is the dishwasher on: " + isOn);
			System.out.println("Programme: " + programme);
		}
		
		public void turnOnOff()
		{
			if (isOn)
			{
				isOn = false;
			}
			else
			{
				isOn=true;
			}
			}
			
		}

