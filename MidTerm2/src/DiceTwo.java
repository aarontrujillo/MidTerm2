public class DiceTwo extends DiceOne
{
	private int numbers;
	private int roll;

	public DiceTwo(int dices)
{
	super(2);
	roll = dices;
	}

	public int Throw()
{
	for (int i = 0; i < roll; i++)
	{
		numbers += rand.nextInt(6) + 1;
		}
	return numbers;
	}
}