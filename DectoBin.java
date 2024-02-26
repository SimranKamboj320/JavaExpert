import java.util.*;

public class JavaExpert{
    public static void DectoBin(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;
        
        while(decNum>0){
            int rem=decNum%2;
            binNum = binNum + (rem*(int)Math.pow(10,pow));
            pow ++;
            decNum=decNum/2;
        }
        System.out.println("binary "+ myNum + "=" +binNum);   
    }

    public static void main(String args[]){
        DectoBin(5);   
    }
}