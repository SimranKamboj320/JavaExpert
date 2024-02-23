import java.util.*;

public class JavaExpert{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        double x = sc.nextDouble();
        System.out.println("Second Number: ");
        double y = sc.nextDouble();
        System.out.println("Third Number: ");
        double z = sc.nextDouble();
        System.out.println("Average " + average(x, y, z)+ "\n");
    }

    public static double average(double x, double y, double z){
        return (x+ y+ z)/3;
}
}