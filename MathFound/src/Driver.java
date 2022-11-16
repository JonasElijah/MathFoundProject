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
            System.out.print("[1] Prime Factorization, GCD and LCM \n[2] Binomial Theorem\nChoose an option: ");
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
                    System.out.print("Give me a number from 1 to 10: ");
                    binomialTheorem binomial1  = new binomialTheorem(scanner.nextInt());
                    binomial1.printBinomial();
                    break;
            }

            System.out.print("Would you like to use our program? (y/n) ");
            if(scanner.next().toLowerCase().charAt(0) == 'n')
                input = false;
        }
        System.out.print("Thank you for using my program.");
        scanner.close();
    }
}
