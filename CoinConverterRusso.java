/*
Aiden Russo
9/18/22
we are practicing variable declaration, assignment statement, expression, string concatenation and java mathematical operations.
I bieleve this deserves a 100% becuase I complete all the requirements
*/
import java.util.Scanner; // Import Scanner for user input

public class CoinConverterRusso
{
   public static void main(String[] args)
   {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("How much Yuan would you like to convert to USD?"); I made this code for user input but then 2nd guessed myself if it was allowed. 
		float yuan = scanner.nextFloat(); */
		float yuan = 1234;
		description();
		convert(yuan);
   }
   public static void description() //This method displays what the program will do
   {
      System.out.println("Welcome to the Coin Converter\nTell many the number of the pennies you have,\nI will tell you the number of dollar bill, quarters, dimes, nickels and pennies\nHere is the result!");
   }
   public static void convert(float yuan) //This method does the calculations for us
   {
	   int pennies = (int)((yuan * .14) * 100);
		System.out.println((int)yuan + " Is equal to " + pennies); //We assume user input here just becuase I can 
		String[] labels = {"dollars", "quarters", "dimes", "nickles", "pennies"}; //This is a neat trickaroo where if we assume largest to smallest it will convert coins
		int[] coins = {100, 25, 10, 5, 1}; // We do the same trickaroo from above but this time we define the values
		for(int i = 0; i < labels.length; i++) {
			System.out.println((pennies/coins[i]) + " " + labels[i]); //Here it will combine lines 28 and 29 to output the value and coins 
			pennies %= coins[i]; // this gives us our leftover pennies for the loop
		}			
   }
}
