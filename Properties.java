
public class Properties {

    public static boolean isPrime( int a)
    {
        boolean check = true;
        for(int i = 2; i < a ; i ++)
        {
            if(a%i != 0)
            {
               check = false;
            }

        }
        return check;
    }

    public static boolean isPrime( long a)
    {
        boolean check = true;
        for(int i = 2; i < a ; i ++)
        {
            if(a%i != 0)
            {
                check = false;
            }

        }
        return check;
    }

    public static boolean isCoprime( int a, int b)
    {
        boolean check = true;
        for(int i = 2; i < a ; i ++)
        {
            if(a%i != 0 && b%i !=0)
            {
                check = false;
            }

        }
        return check;
    }

    public static boolean isCoprime( long a, long b)
    {
        boolean check = true;
        for(int i = 2; i < a ; i ++)
        {
            if(a%i != 0 && b%i !=0)
            {
                check = false;
            }

        }
        return check;
    }


    public static String factor( long a)
    {
        String fact = "";
        for(int i = 2; i < a ; i ++)
        {
            if(a%i == 0)
            {
                fact = fact + i;
            }

        }
        return fact;
    }

    public static int GCD( int a, int b)
    {
        int great = 0;
        for(int i = 2; i < a ; i ++)
        {
            if(a%i == 0 && b%i ==0)
            {
                great = i;
            }

        }
        return great;
    }

    public static long GCD( long a, long b)
    {
        long great = 0;
        for(long i = 2; i < a ; i ++)
        {
            if(a%i == 0 && b%i ==0)
            {
                great = i;
            }

        }
        return great;
    }

    public static int lCM(int a, int b)
    {
        int c = a*b;
        int least=0;

        for(int i = c; i < a ; i--){
            if(i/a ==0&&i/b==0){
                least = i;
            }

        }
        return least;
    }

    public static long lCM(long a, long b)
    {
        long c = a*b;
        long least=0;

        for(long i = c; i < a ; i--){
            if(i/a ==0&&i/b==0){
                least = i;
            }

        }
        return least;
    }


    public static String totient(long a )
    {
        String euler = "1,";
        boolean x = true;
        for(int i =1; i<a;i++)
        {
            for(int j =1; j<i;j++)
            {
                if(i%j !=0&& a%j != 0)
                {
                    x = false;
                }
                else
                    x = true;
            }
            if (x)
                euler = euler + i +",";
        }
        return euler;
    }
}
