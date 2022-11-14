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
            System.out.print("(1) Prime Factorization, GCD and LCM: ");
            userInput = scanner.nextInt();
            switch(userInput)
            {
                case 1:
                    int a,b;
                    System.out.print("Give me a number: ");
                    a = scanner.nextInt();
                    System.out.print("Give me a another number: ");
                    b = scanner.nextInt();
                    PrimeGCDLCM prime1 = new PrimeGCDLCM(a,b);
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
