class fibonaci{
    // Fibonacci series is a series where the next term is the sum of pervious two terms.
    //0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    public void check(){
        int first=0,second=1,sum=0;
        for(;sum<=5;)
        {
            System.out.print(first +" ");
            sum=first+second;
            first=second;
            second = sum;
        }
        System.out.println(sum);


    }
}

class factorial{
   // factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
    public void check(){
        int num=5,fac=1;
        for(int i=1;i<=num;i++)
        {
            fac *= i;
        }
        System.out.println(fac);
    }

}
class factorialAndFibonaci{
    public static void main(String[] args) {
       factorial fac = new factorial();
       fac.check();
       fibonaci fi = new fibonaci();
       fi.check();
    }
}