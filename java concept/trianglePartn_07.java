public class trianglePartn_07 {
    public static void main(String[] args){
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        int n= 4;
        // for(int i=1; i<=n; i++){ //row
        //     for(int j=1; j<=i; j++){  //column
        //         System.out.print(" * ");
        //     }
        //    System.out.println(" ");
        // }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
           System.out.println(" ");
        }

    }
}
