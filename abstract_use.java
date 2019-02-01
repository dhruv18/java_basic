//if i know the partial implementation of the class the use abstract class.....
//abstract class are same as the default classses
//we can define the variable,mehtods,constructors.
//abstract does not support multiple inheritance.

abstract class mobile {
   public mobile(){//we can use costructor.->but we can use it buy super in subclass.
        int b=10;
        System.out.println("constructor call using super.in subcalsss...(-.-)");
     }

    public void mobileName(){
        System.out.println("Name From Mobile class");
    }
  abstract public void camera();
  abstract  public void flashlight();

  public int b; //in abstract we have no buydefault modifiers.


}

abstract class dhruv extends mobile{
  
  
    public void camera(){
        
        System.out.println("dhruv implemented camera");
        System.out.print(" but does not know flashlight");
        System.out.println(" so dhruv also be abstract");
    }
   abstract public void flashlight();
}

class kishan extends dhruv{
    kishan(){
        super();///--->call mobile constructor
    }
    public void flashlight(){
      
        System.out.println("kishan extends dhruv");
        System.out.print(" now kishan implementd the flashlight");
        System.out.print(" so all the mobiles method are implementd");
        System.out.println(" so kishan does not required to abstract");
    }
}
class abstract_use extends kishan{
    // Now i cam use all the mobile function only extending the kishan..
   
    public static void main(String[] args) {
     
        kishan k = new kishan();
       
        k.mobileName();
        k.camera();
        k.flashlight();
       
        
    }
}