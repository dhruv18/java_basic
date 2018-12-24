
class getandset
{
    int max;

    public int get(){

        return this.max;
    }
    public void set(int a)
    {
        this.max=a;
    }
}
class thisdemo
{
    public static void main(String[] args)
    {
        getandset gs = new getandset();
        getandset gs2 = new getandset();
        gs.set(50);
        gs2.set(100);
        System.out.println("Value of first gs is"+gs.get());
        System.out.println("Value of second gs2 is"+gs2.get());
        
        
    }
}