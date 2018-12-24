import java.text.SimpleDateFormat;
import java.util.*;


class Calander_use{
    

    public void show()
    {
        System.out.println("hello");
    }


    public static void main(String[] args) {
        



        Calendar c = Calendar.getInstance();
       System.out.println(c.getTime());
       SimpleDateFormat f = new SimpleDateFormat("yy-mm-dd");
       String s = f.format(c.getTime());
       System.out.println(s);

       System.out.println("hello");
    }
}