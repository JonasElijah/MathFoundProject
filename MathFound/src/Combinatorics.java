import java.math.BigInteger;

public class Combinatorics {

	public Combinatorics(int x, int y) {
		int numChars = x;
		int numNums = y;
		int numDigits;
		BigInteger numPasswords;
		BigInteger charactersOnly;
		BigInteger numbersOnly;
        final BigInteger amountOfChars = BigInteger.valueOf(52);
        final BigInteger amountOfNumbers = BigInteger.valueOf(10);
		
		
		numDigits = numChars + numNums;
		if(numDigits == 0)
		{
			System.out.print("You have entered 0 Numbers and Characters, so there are 0 combinations.");
			return;
		}
		
		numPasswords  = (amountOfChars.pow(numChars)).multiply((amountOfNumbers.pow(numNums)));
		System.out.print("The number of possible passwords with " + numChars + " characters and " + + numNums + " numbers is: " + numPasswords  + ".\n");
		
		charactersOnly  = (amountOfChars.pow(numChars));
		System.out.print("The number of possible passwords with " + numChars + " characters is: " + charactersOnly + ".\n");
		
		numbersOnly  = (amountOfNumbers.pow(numNums));
		System.out.print("The number of possible passwords with " + numNums + " numbers is: " + numbersOnly + ".\n");

		
		
	}
}
