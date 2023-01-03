import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean input = false;
        int userInput;

        System.out.print("Would you like to use our program? (y/n) ");
        if(scanner.next().toLowerCase().charAt(0) == 'y')
            input = true;
    
        while(input == true)
        {
            System.out.print("[1] Prime Factorization, GCD and LCM \n[2] Binomial Theorem\n[3]Combinatorics\nChoose an option: ");
            userInput = scanner.nextInt();
            switch(userInput)
            {
                case 1:
                    int a,b;
                    System.out.println();
                    System.out.print("Give me a number: ");
                    a = scanner.nextInt();
                    System.out.print("Give me a another number: ");
                    b = scanner.nextInt();
                    PrimeGCDLCM prime1 = new PrimeGCDLCM(a,b);
                    System.out.print("Prime factorization of "+a+" = 1 * ");
                    prime1.printPrime(PrimeGCDLCM.primeFact(a));
                    System.out.print("Prime factorization of "+b+" = 1 * ");
                    prime1.printPrime(PrimeGCDLCM.primeFact(b));
                    System.out.println("GCD("+a+","+b+")"+" = "+PrimeGCDLCM.GCD(a,b));
                    System.out.println("LCM("+a+","+b+")"+" = "+PrimeGCDLCM.LCM(a,b));
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Give me a number from 1 to 9: ");
                    binomialTheorem binomial1  = new binomialTheorem(scanner.nextInt());
                    binomial1.printBinomial();
                    break;
                case 3:
                    int numChars = -1;
                    int numNums = -1;
                    while(numChars < 0)
		            {
		    	        System.out.print("How many Characters are in the password?\n");
			            numChars = scanner.nextInt();
			            if(numChars<0)
			            {
				            System.out.print("Number of Characters must be a positive integer.\n");
			            }
		            }
		
                    while(numNums < 0)
                    {
                        System.out.print("How many Numbers are in the password?\n");
                        numNums = scanner.nextInt();
                        if(numNums<0)
                        {
                            System.out.print("Number of Numbers must be a positive integer.\n");
                        }	
                    }
                    Combinatorics comb = new Combinatorics(numChars, numNums);
                 default:
                	 System.out.println();
                	 System.out.println("Please choose from one of the options");
            }

            System.out.print("Would you like to use our program? (y/n) ");
            if(scanner.next().toLowerCase().charAt(0) == 'n')
                input = false;
        }
        System.out.print("Thank you for using my program.");
        scanner.close();
    }
}
