import java.util.*;

class a
{
   // a(){}
    a()
  {
      System.out.println("class a constructor");
    }
}

class b extends a
{
    b(){
        System.out.println("class b constructor");
    }
}

class c extends b
{

    c(){
        System.out.println("class c  constructor");
    }  
}

public class constructorCalling{

    public static void main(String[] args) {
        
        c b1 = new c();

    }
}