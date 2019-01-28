
class findMaximum{
    public static void main(String[] args) {
        
    
    int a[] = {3,1,5,32,55,3};
    int t=a[0];
    for(int i=1;i<a.length;i++){
       
        if(t<a[i]){
            t=a[i];
        }
    }
    System.out.println(t);


}

}