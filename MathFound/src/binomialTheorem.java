public class binomialTheorem {
    private static int n;//value of user input
    
    //unicode for printing out exponents correctly
    String[] power = {"", "", "\u00B2"/*power of 2 */, "\u00B3"/*power of 3 */, "\u2074"/* power of 4 */, "\u2075"/* power of 5 */, "\u2076"/* power of 6 */, "\u2077"/* power of 7 */, "\u2078"/* power of 8 */, "\u2079"/* power of 9 */};

    //Constructors (sets the value on n)
    public binomialTheorem(){
        n = 5;
    }

    public binomialTheorem(int x){
        n = x;
    }

    //--------------------------------------------------------------------------------------
    //  Based off of the combination theorem      C =        n!
    //                                                 (n - r)! * r!
    //--------------------------------------------------------------------------------------
    public static int combination(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }

    //--------------------------------------------------------------------------------------
    //  Returns the factorial of the inserted number x
    //--------------------------------------------------------------------------------------
    public static int factorial(int x){
        int fact = 1;
        for(int i = 1; i <= x; i++){ //multiplies every number from 1 to x
            fact = fact*i;
        }
        return fact;
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Based of the binomial theorem    (x + y)^n = ∑ n to k=0 C(n,k) a^n-k b^k (https://mathsathome.com/wp-content/uploads/2021/10/the-binomial-theorem-formula-1024x577.png)
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void printBinomial(){
        for(int k = 0; k < n + 1; k++){  
            if(combination(n, k) != 1)// if the coefficient is one, then don't print it
                System.out.print(combination(n, k));
            if((n - k) != 0) // if the exponent of x is zero, then don't print x
                System.out.print("x"+power[n - k]);
            if(k != 0) // if the exponent of x is zero, then don't print y
                System.out.print("y"+power[k]);
            if(k != n) // at very last iteration of the loop, don't print out a + (so the polynomial won't have a plus sign at the end)
                System.out.print(" + ");
        }
        System.out.println();
    }

}