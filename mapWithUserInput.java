import java.util.*;

 class parent{

    static  Map<String,Integer> myinfo = new HashMap<>();
    String name;
    Integer age;
    public parent(){}

    public  void addmap(String a,Integer b)
    {
       this.name=a;
       this.age=b;
        myinfo.put(this.name,this.age);
    }
    public void showmap()
    {
        System.out.println(myinfo.values());
    }
}

class mapWithUserInput 
{
    public static void main(String[] args) {
        parent pt = new parent();
        System.out.println("Please enter the no of entery");
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        String  takename;
        Integer takeage;

        for(int i=0;i<=a-1;i++){

            System.out.println("enter the {0} value :"+i);
            takename = sc.next();
            takeage = sc.nextInt();
            pt.addmap(takename, takeage);
        }

        pt.showmap();


        
    }

    
    
}