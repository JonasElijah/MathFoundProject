public class PrimeGCDLCM {
    private static int a, b;

    public PrimeGCDLCM()
    {
        a = 32;
        b = 64;
    }

    public PrimeGCDLCM(int x, int y)
    {
        a = x;
        b = y;
    }

    public static int[] primeFact(int a)
    {
        int c = 0;
        int[] result = new int[1024];
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
            {
               result[c] = i;
               c++;
               a /= i;
               i = 1;
            }    
        }
        result[c] = a;
        return result;
    }
    
    public void printPrime(int[] x)
    {
        int i = 0;
        while(x[i] != 0)
        {
            System.out.print(x[i]);
            if(x[i+1] != 0)
                System.out.print(" * ");
            i++;
        }
        System.out.println();
    }
    
    public static int LCM(int a, int b)
    {
        int[] primeFact1 = primeFact(a);
        int[] primeFact2 = primeFact(b);
        
        int[] result = new int[1024];
        int[] urmom = new int[1024];
        int answ = 1, count = 0;
        
        int c = 0, z = 0;
        for(int i = 0; i < 1024; i++)
        {
            
            if(findNum(primeFact2, primeFact1[i]) == 1)
            {
                result[c] = primeFact1[i];
                c++;
            }
            
            if(findNum(primeFact1, primeFact2[i]) == 1)
            {
                result[c] = primeFact2[i];
                c++;
            }
            
            if(primeFact1[i] != 0 && findNum(urmom, primeFact1[i]) == 1 && findNum(primeFact2, primeFact1[i]) == 0)
            {
                result[c] = (int) Math.pow(primeFact1[i], primeMax(primeFact1, primeFact2, primeFact1[i]));
                urmom[z] = primeFact1[i];
                c++;
                z++;
            }
            
        }
        while(result[count] != 0)
        {
            answ *= result[count];
            count++;
        }
        
        return answ;
    }
    
    public static int GCD(int a, int b)
    {
        int[] primeFact1 = primeFact(a);
        int[] primeFact2 = primeFact(b);
        
        int[] result = new int[1024];
        int[] urmom = new int[1024];
        int answ = 1, count = 0;
        
        int c = 0, z = 0;
        for(int i = 0; i < 1024; i++)
        {
            if(primeFact1[i] != 0 && findNum(urmom, primeFact1[i]) == 1 && findNum(primeFact2, primeFact1[i]) == 0)
            {
                result[c] = (int) Math.pow(primeFact1[i], primeMin(primeFact1, primeFact2, primeFact1[i]));
                urmom[z] = primeFact1[i];
                c++;
                z++;
            }
        }
        while(result[count] != 0)
        {
            answ *= result[count];
            count++;
        }
        
        return answ;
    }
    
    public static int findNum(int[] array, int target)
    {
        int value = 1;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == target)
            {
                value = 0;
                break;
            }
        }
        return value;
    }

    public static int primeMax(int[] x, int[] y, int z)
    {
        int countx = 0, county = 0, c = 0;
        
        while(x[c] != 0)
        {
            if(x[c] == z)
            {
                countx++;
            }
            c++;
        }
        
        c = 0;
        while(y[c] != 0)
        {
            if(y[c] == z)
            {
                county++;
            }
            c++;
        }
        
        return Math.max(county, countx);
        
    }
    
    public static int primeMin(int[] x, int[] y, int z)
    {
        int countx = 0, county = 0, c = 0;
        
        while(x[c] != 0)
        {
            if(x[c] == z)
            {
                countx++;
            }
            c++;
        }
        
        c = 0;
        while(y[c] != 0)
        {
            if(y[c] == z)
            {
                county++;
            }
            c++;
        }
        
        return Math.min(county, countx);
        
    }
    
    public int getIntA(){return a;}
    public void setIntA(int x){a = x;}
    public int getIntB(){return b;}
    public void setIntB(int x){b = x;}
}
