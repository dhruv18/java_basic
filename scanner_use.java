import java.util.*;

class scanner_use
{
     public static void main(String[] args) {
     
        
        System.out.print("called");
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String st= sc.nextLine();

        System.out.println("Enter the Int value");
        
        int a=sc.nextInt();

        System.out.println("the value of String is "+st+" and value of int is "+a+".");

      
        sc.close();

    }
}