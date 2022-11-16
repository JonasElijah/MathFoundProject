public class binomialTheorem {
    //https://en.wikipedia.org/wiki/Unicode_subscripts_and_superscripts

    String[] power = {"\u2070", "\u00B9", "\u00B2", "\u00B3", "\u2074", "\u2075", "\u2076", "\u2077", "\u2078", "\u2079"};
    
    public binomialTheorem()
    {
        int a = 5;
        for(int i = 0; i < a + 1; i++)
        {
            System.out.print("x"+power[a - i]+"y"+power[i]+" + ");
        }
    }

    public binomialTheorem(int a)
    {
        for(int i = 0; i < a + 1; i++)
        {  
            if(combination(a, i) != 1)
                System.out.print(combination(a, i));
            if(power[a - i] != "\u2070")
                System.out.print("x"+power[a - i]);
            if(power[i] != "\u2070")
                System.out.print("y"+power[i]);
            if(i != a)
                System.out.print(" + ");
        }
        System.out.println();
    }

    public static int combination(int n, int r)
    {
        return factorial(n)/(factorial(n-r)*factorial(r));
    }

    public static int factorial(int x)
    {
        int fact = 1;
        for(int i = 1; i <= x; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

}