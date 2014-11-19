import java.util.*;
	public class DiceMain
	{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	Dice diceSet;
	int NumDice = 0;
	int guess = 0;
	int Num;
	int tries = 1;
	
	
	System.out.println("Guess the Number");
	System.out.println("How many dices do you want to use?");
	
	do
	{
	System.out.print("Enter 1 Dice ,2 Dices or 3 Dices. ");
	NumDice = input.nextInt();
	
	if (NumDice == 1)
	{
	System.out.println("One Dice");
	}
	else if (NumDice == 2)
	{
	System.out.println("Two Dices");
	}
	else if (NumDice == 3)
	{
	System.out.println("Three Dices");
	}
	
	}
	while(NumDice != 1 && NumDice != 2 && NumDice != 3);
	
	if (NumDice == 1)
	{

	diceSet = new DiceOne(NumDice);
	Num = diceSet.Throw();
	System.out.println("Guess the number.");
	
	do
	{
		System.out.print("Please enter a number from 1 to 6. ");
		guess = input.nextInt();
		
		if (guess == Num)
		{
            System.out.println("Your guess is correct. Congratulations!");
			System.out.println("It took you " + tries + " attempt.");
			}
      else if (guess < Num)
      {
            System.out.println("Your guess is smaller than the secret number.");
            tries++;
            }

      else if (guess > Num)
      {
            System.out.println("Your guess is greater than the secret number.");
            tries++;
            }
		} while (guess != Num);
	}
	else if (NumDice == 2)
	{
	diceSet = new DiceTwo(NumDice);
	Num = diceSet.Throw();
	
	do
	{
	System.out.print("Please enter a number from 2 to 12. ");
	guess = input.nextInt();
	
	if (guess == Num)
	{
        System.out.println("Your guess is correct. Congratulations!");
		System.out.println("It took you " + tries + " attempt.");
	}
  else if (guess < Num)
  {
        System.out.println("Your guess is smaller than the secret number.");
        tries++;
        }

  else if (guess > Num)
  {
        System.out.println("Your guess is greater than the secret number.");
        tries++;
        }
	} while (guess != Num);
	}
	
	else if (NumDice == 3)
	{
	diceSet = new DiceThree(NumDice);
	Num = diceSet.Throw();
	
	do
	{
	System.out.print("Please enter a number from 3 to 18. ");
	guess = input.nextInt();
	
	if (guess == Num)
	{
        System.out.println("Your guess is correct. Congratulations!");
		System.out.println("It took you " + tries + " attempt.");
		}
  else if (guess < Num)
  {
        System.out.println("Your guess is smaller than the  number.");
        tries++;
        }

  else if (guess > Num)
  {
        System.out.println("Your guess is greater than the  number.");
        tries++;
        }
	} while (guess != Num);
	}
	}
	}
	