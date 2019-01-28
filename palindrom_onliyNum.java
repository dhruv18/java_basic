class palindrom_onliyNum{
    public static void main(String[] args) {
        
    
    int num=121,reminder,reverseint=0,temp;
    temp=num;

    while(num!=0){
        reminder = num%10;
        reverseint = reverseint*10 + reminder;
        num = num/10;
    }
    if(temp==reverseint){
        System.out.println("it's palindrom");
    }
    else{
        System.out.println("it's not palindrom");
    }
}
}