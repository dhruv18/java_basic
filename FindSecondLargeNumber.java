class FindSecondLargeNumber{
    public static void main(String[] args) {
        
    
    int a[] = {53,34,23,6,42,23,6,3,2,13};
    int first,second;
    first=second=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        if(a[i]>first){
            second=first;
            first=a[i];
        }
        else if(a[i]>second && a[i]!=first){
            second=a[i];
        }
    }
    System.out.println(second);

}}