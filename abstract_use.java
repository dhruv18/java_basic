import  java.util.*;

public  abstract class  abstract_use{

    public  abstract void show(); 


    public static void main(String[] args) {
    a aa = new a();
    aa.show();
    }

}

class a extends abstract_use
{

    public void show()
    {
        System.out.println("show method in a classs");
    }
}
