public class test{
public static void main(String[] args) {

    int a[]={5,32,4,35,12,32,5,32,123};
    int f=-1,s=-2;
    for(int i=0;i<a.length;i++){
        if(a[i]>f){
            s=f;
            f=a[i];
        }
        else if(a[i]>s && s!=f)
        {
            s=a[i];
        }
    }
    System.out.println(s);

}
}
