//import java.util.*;

public class JavaExpert{
    public static void Inverted_Half_pyramid_numbers(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
                }
                for(int j=1; j<=n-i;j++){
                    System.out.print(n);
                }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Inverted_Half_pyramid_numbers(6);
}
}