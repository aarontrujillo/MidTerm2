import java.util.*;

	public class DiceOne extends Dice
	{
	Random rand = new Random();
	private int numbers;
	private int roll;
	
	public DiceOne(int dices)
	{
	super(1);
	roll = dices;
	}
	
	public int Throw()
	{
	for (int i = 0; i < roll; i++)
	{
	numbers = rand.nextInt(6) + 1;
	}
	return numbers;
	}
	}