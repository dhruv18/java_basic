import java.util.*;
public class Switch_case{
    public static void main(String[] args) {
        int month = 4;
        String season="";
        switch(month)
        {
            case 12:
            case 1:
            case 2:
            season = "winter";
            break;
            case 3:
            case 4:
            case 5:
            season = "spring";
            break;
            default:
            break;
        }
        System.out.println(season);
    }
}