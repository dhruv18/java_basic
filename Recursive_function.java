import java.util.*;

class Recursive_function{


    public static int Sumetion(int a)
    {
        if(a<=0)
        {
            return 0;
        }
        else return a + Sumetion(a-1);
    }

    public static int Factorial(int a)
    {
        if(a<=0)
        { 
            return 1;
        }

        else 
        {
            return a*Factorial(a-1);
        }
    }


    public static int Exponential(int a,int b)
    {
        if(b<=0)
        {
            return 1;
        }
        else
        {
            return a*Exponential(a, b-1);
        }
    }
    

    public static void main(String[] args) {
       System.out.println(Sumetion(5));
       System.out.println(Factorial(5)); 
       System.out.println(Exponential(5,3));
    }
}