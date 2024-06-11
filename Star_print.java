public class JavaExpert{
    public static void Star_print(int n){
        //Outer Loop
        for(int i=1; i<=n-2; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" ");
                }
            for(int j=1; j<=n; j++){
            System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void main(String args[]){
        Star_print(5);
}
}