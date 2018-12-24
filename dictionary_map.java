import java.math.BigInteger.*;
import java.util.*;
class dictionary_map{
 
  static Map <String,Long> MyInfo = new HashMap<String,Long>();
     
    public static void main(String[] args) {
    
      
    
    MyInfo.put("Dhruv Age",19L);
    MyInfo.put("Dhruv RollNO", 22L);
    MyInfo.put("Dhruv Mobile",88888888888L);
    

    System.out.println("age of the Dhruv is "+MyInfo.get("dhruv")); 
    System.out.println(MyInfo.values());
    System.out.println("the size of the disconary is "+MyInfo.size());
    //for clear the disconary
  System.out.println("is the clear disconary "+MyInfo.isEmpty());  
    MyInfo.clear();
    System.out.println("is the clear disconary now "+MyInfo.isEmpty());
    }






    //check for is kishan is available in the MyInfo;
    
    public String checkkey(String dhruv)
    {
    this.dhruv=dhruv;
    return MyInfo.containsKey(dhruv);
    }
}