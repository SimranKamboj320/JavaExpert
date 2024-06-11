//import java.util.*;

public class JavaExpert{
    public static void Inverted_numbers(int n){
        //Outer Loop
        for(int i=0; i<=n; i++){
            for(int j=0; j<=2*(n-i)-1; j++){
                System.out.print(" ");
                }
            for(int j=0; j<=n; j++){
            System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void main(String args[]){
        Inverted_numbers(4);
}
}