//import java.util.*;

public class JavaExpert{
    public static void Inverted_Rotated_Half_Pyramid(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
                }
                for(int j=1; j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Inverted_Rotated_Half_Pyramid(5);
}
}