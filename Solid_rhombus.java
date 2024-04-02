public class JavaExpert{
    public static void Solid_rhombus(int n){
        //Outer Loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
                }
            for(int j=1; j<=n; j++){
            System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void main(String args[]){
        Solid_rhombus(5);
}
}