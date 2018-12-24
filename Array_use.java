import java.util.*;


class Array_use {

    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a={};    
        int[] b = { 5, 6, 7 };
        int[] c = new int[5];

        //scan for array c;
        for (i = 0; i <= 4; i++) {
            c[i] = sc.nextInt();
        }
        i = 0;
        printarray(c);

    }                       

    public static void printarray(int[] d) {

        int item;
        for (i = 0; i < d.length; i++) {
            item = d[i];
            System.out.print(item);
        }
        System.out.println();

        int first_value=d[0];
        
        //for each loop
        for(int i : d)
        {
            if(i>first_value)
            {
              first_value=i;
            }
        }
        System.out.println("the biggest value is "+first_value);
        System.out.println("hello");
        System.out.println("test");
    }
   

}