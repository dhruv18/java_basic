import java.util.*;

class parent {

   public void parent() {
        System.out.println("parent class mehtod");
    }

    public void p(String s) {
        System.out.println("parent class p() : "+s);
    }
    public void p1(String s) {
        System.out.println("parent class p() : "+s);
    }
    
}

class child extends parent {
    public void child() {
        System.out.println("child class method");
    }

    public void p(String s) {
        System.out.println("chaild class p() : "+s);
    }
    public void p2(String s) {
        System.out.println("parent class p() : "+s);
    }
    
}

public class CascadingObjects extends child {
    public static void main(String[] args) {

        CascadingObjects mainn = new CascadingObjects();
        //---------Casting Chaild class to Parent class object store
        // 1 method to do casting;
        parent cp = new child();// type casting chaild class reference is stored in parent class object;

        // 2 mehtod to do casting;
        child c = new child();
        parent cp2 = (parent) c;// type casting chaild class reference is stored in parent class object;

        // 3 method is to store in Object..Object is super class of all class wriiten by
        // java to store sum methods
       Object cp3 = new child();
       System.out.println(cp3.toString());

       cp.parent();
       cp.p("calling from cp object which has -> parent cp = new chaild()");
     //  cp2.child();
       mainn.p("calling form Main class object which extends the chaild class");
    }
}