//if we does not have eny logic for  class then  we go for interface.
//interface can help to achive the multiple inheritacne
//method inside interface are public and abstract.
//all the inherited class should implement all the mehods present in interface..

//no constructor in interface.becous all are buydefault p..,s..,f...;
interface camera {
    // right now i dont no the logic for this two methods.
    // method inside interface are public and abstract.
    void cameraSenser();

    int b = 10;// b is buydefault public,static and final

    // below is possible from java 8.
    // we can implement mathod inside interface
    // but it shold be default accesmodifier
    default void camera() {
        System.out.println(b+" Pixel Camera");
    }
}

interface flashlight{
    default void light(String a){
        System.out.println(a+" flash light");
    }
    void lightPossition();
}

class interfaceUse implements camera,flashlight {
  public  void cameraSenser(){
      System.out.println("CAMERA SENSER DEFIEND IN USING IMPLEMENTING INTERFACE");
    }
    public void lightPossition(){
        System.out.println("LIGHT POSSITION DEFINED USING IMPLEMENTING INTERFACE");
    }
    public static void main(String[] args) {
        interfaceUse i = new interfaceUse();
        i.camera();
        i.cameraSenser();
        i.light("\"WHITE\"");
        i.lightPossition();
        

    }

}