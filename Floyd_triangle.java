public class JavaExpert{
    public static void Floyd_triangle(int n){
        //Outer Loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
                }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Floyd_triangle(5);
}
}