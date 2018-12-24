import java.util.*;

//class 1 dog child
 class dog extends inheritance{
    dog()
    {
        super(15);
    }
    public void dogMethod(){
        System.out.println(" inside the dog methode");
    }
}

//class 2 cat chaild
 class cat extends inheritance{
    
    cat(){
        super(10);
    }
    public void catMethod(){
        System.out.println("inside the cat method");
    }
}


//Parent class inheritance------------
public  class inheritance{

   private int age;

    inheritance(){}

    inheritance(int age) //constructor-----
    {
        this.age = age;
    }
    public int  getage(){ //get the private variable age;-----
        return age;
    }
    public void eat(String nameEnimal)//eat mehod called by the childs.---
    {
        String name=nameEnimal;
        System.out.println("Parent mehtod eat is called throw chaild object "+name);
    }


    public static void main(String[] args) {
        inheritance en = new inheritance();
        dog d = new dog();
        d.dogMethod();
        System.out.println("age of the Dog "+d.getage());
        d.eat("dog");

        cat c = new cat();
        c.catMethod();
        System.out.println("age of the Cat "+c.getage());
        c.eat("cat");


        
    }


}