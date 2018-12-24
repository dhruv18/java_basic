import java.util.*;

public class Array_Multidimension{
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        int t=0;

        for(int i=0;i<4;i++){
            for(int k=0;k<4;k++){
                a[i][k] = t;
                t++;
            }
        }
        System.out.println(a[2][2]);
       
       
    }
}