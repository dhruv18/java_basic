class foreachloop{     

    public static void main(String[] arg) 
    { 
        { 
            int[] marks = { 125, 132, 95, 116, 110 }; 
            for(int i : marks){
                System.out.println(i);
            }
              
            int highest_marks = maximum(marks); 
            System.out.println("The highest score is " + highest_marks); 
        } 
    } 
    public static int maximum(int[] numbers) 
    {  
        int maxSoFar = numbers[0]; 
          
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
    return maxSoFar; 
    } 
} 
    