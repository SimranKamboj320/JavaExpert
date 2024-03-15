//import java.util.*;

public class JavaExpert{
    public static void hollow_rectangle(int totRows, int totcols){
        //Outer Loop
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totcols; j++){
                if(i==1||i==totRows||j==1||j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollow_rectangle(4,5);
}
}