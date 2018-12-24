import java.util.*;


class coin
{
    Random rd = new Random();
    public String flip()
    {
        Random rd = new Random();
        int a=Math.abs(rd.nextInt());

        if(a%2==0)
        {
            return "TAIL";
        }
        else{
            return "HEAD";
        }
    }
}

class HeadTail{

    public static void main(String[] args){
        
      coin cn = new coin();  
      for(int i=1;i<10;i++)
        System.out.println("hello"+ cn.flip());


    }
}