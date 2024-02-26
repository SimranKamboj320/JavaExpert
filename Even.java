import java.util.*;

public class JavaExpert{
    public static boolean Even(int n){
        boolean isEven=false;
        if(n%2==0){
            isEven = true;
        }
        return isEven; // return statement added
    }
        
    public static void main(String args[]){
        // Accessing the Even method using the class name
        System.out.println(JavaExpert.Even(60));
    }
}
