import java.util.concurrent.TimeUnit;

import com.sun.javafx.util.TempState;

class tohot extends Exception {
    public tohot(int temp){
        System.out.println(temp);
    }
}

class tocold extends Exception {
    public tocold(int temp){
        System.out.println(temp);
    }
}

public class ExceptionHandlingWithExample {
    public static void  checkcoffe(int temp) throws tohot, tocold
{
   int hotcoffe =7;
   int coldcoffe = 5;
    if(temp<coldcoffe)
    {   
        throw new tocold(temp);
    }
    if(temp<hotcoffe)
    {
        throw new tohot(temp);
    }

 
    
}

    public static void main(String[] args) throws InterruptedException {
        int temp = 4;
        boolean a = true;
        while(a){
            try{
                checkcoffe(temp);
                System.out.println(+temp+" that is good coco");
                a=false;
            }
            catch(tohot e){
                System.out.println("it's to hot");
                temp += 1;
                
            }
            catch(tocold e){
                System.out.println("it's to cold");
                temp += 1;
            }
            TimeUnit.SECONDS.sleep(2);

        }
       
    }
}