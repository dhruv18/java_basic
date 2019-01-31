/*
IMPORTANT:------
1-All the static data's are acces without creating the object of it's class.
2-static block and static variables are executed in order they are present in a program.
3
Examples:= className.Static Data;

1.static variables.
    1-it can have one copy for all objects.
    2-Declare Globally in class.Not  in  mehtods.
    3-Cannot Assign the nonstatic Variable to Static Variable.
    Example{
        int b;
        static int a=b;---------->"3 Error"
        void shwo(){
            static int b=20;------->"2 Error"
        }
    }

2.Static Methods.
    1-Can not acces the Global Nonstatic variable in staticMethods.
    2-Can not Use the this,super Keyword in this.
    3-Can Only Call the Other StaticMethods.
    Example{
        int a = 10;
        void show(){};
        static void test(){
            a++; ----->"1 Error"
            show();------->"3 Error"
        }
    }
3.Static Blocks
    1.Only Executed Once When class is loaded.
    2.Use for initialize the static Variables
        With some Computations;
    Example{
        static int a=20;
        static int b;

        static{
            b=a*5;
        }

    }

*/
class Student{
    int Rollno=0;
    String Name ;
    static int countForRollNo=0;
    static String colledge;
    Student(int r,String n){
        this.Rollno=getRollNO();;
        this.Name=n;
    }
    static int getRollNO(){
        countForRollNo++;
        return countForRollNo;
    }
    static void Setcolledge(String c){
        colledge =c;
    }
    void getStudentInfo(){
        System.out.println("name is "+this.Name);
        System.out.println("RollNo is "+this.Rollno);
        System.out.println("COlledge is "+colledge);
        System.out.println("----------------------");
    }

}
class StaticKeyWord{
    public static void main(String[] args) {
        Student.colledge="Nirma";
        Student s1 = new Student(20, "dhruv");
        Student s2 = new Student(22, "Kishan");
        s1.getStudentInfo();
        s2.getStudentInfo();

    }
}