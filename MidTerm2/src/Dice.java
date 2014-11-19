public abstract class Dice
	{
	
	private int rolls;
	
	public Dice(int bounces)
	{
	rolls = bounces;
	}
	
	public abstract int Throw();
	}