import java.util.*;

class Examples {
    Scanner sc = new Scanner(System.in);

    int a = 0, c = 0, aa[];

    // example 1;
    public void exception_using_forloop() {
        Random r = new Random();

        for (int a = 0; a <= 20; a++) {
            try {
                // int b = r.nextInt(max==20 - min==10+1)+min==10;
                int b = r.nextInt(10);// o to 9 between
                c = 10 / b;
                System.out.println(b);
            } catch (Exception e) {
                c = 0;
                System.out.println("exception handled");
            }
        }
        System.out.println("-----------------------------2");
    }

    // examole 2;
    public void multiplecatch() {
        try {
            // a = 5 / 0;
            aa = new int[5];
            aa[2] = 15;
            // System.out.println(a);
            System.out.println(aa[2]);
        } catch (ArithmeticException e) {
            System.out.println("arithmatic catch block");

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("-----------------------------3");
    }

    // example 3;
    public void useofthroww() {
        try {
            int a = 10;
            if (a <= 10) {
                throw new myException("hello throw form user defined exception");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// user defined exception class
class myException extends Exception {
    public myException(String msg) {
        super(msg);
        System.out.println(msg);

    }
}

public class Exception_handling {
    public static void main(String[] args) {
        // example 1;
        Examples e1 = new Examples();
        e1.exception_using_forloop();
        // example 2;
        e1.multiplecatch();
        // exmaple 3;
        e1.useofthroww();

    }
}
