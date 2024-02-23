import java.util.*;

public class JavaExpert{
    public static double Average(int a, int b, int c){
        int sum=a+b+c;
        double average=(double)sum/3;
        return average;
    }

    public static void main(String args[]){
        System.out.println(Average(2, 3, 4));
}
}
