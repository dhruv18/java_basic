
public class palindrom{
    public static void main(String[] args) {
        int a[] = {3,2,3};
        int temp[] = new int[a.length];
        int count =0,j=0,flag=0;
        for(int i=a.length-1;i>=0;i--){
            temp[count] = a[i];
            count++;
        }
        while(j<=a.length-1){
            if(temp[j] == a[j]){
                flag++;
            }
            j++;
        }
        if(flag == a.length){
            System.out.println("it's palindrom");
        }
        else{
            System.out.println("it's not palindrom");
        }
    }
} 