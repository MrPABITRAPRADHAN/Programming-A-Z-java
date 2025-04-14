class triangle{
    public static void main(String[] args) {

      //           * 
      //         * * * 
      //       * * * * * 
      //     * * * * * * * 
      //   * * * * * * * * * 
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        

      //           1 
      //         2 2 2 
      //       3 3 3 3 3
      //     4 4 4 4 4 4 4
      //   5 5 5 5 5 5 5 5 5
        // int n = 5;
        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }



        
        //           1 
        //         1 2 3
        //       1 2 3 4 5
        //     1 2 3 4 5 6 7
        //   1 2 3 4 5 6 7 8 9
        // int n = 5;
        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }



        //           A 
        //         A B C
        //       A B C D E
        //     A B C D E F G 
        //   A B C D E F G H I
        // int n = 5;
        //  for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         // System.out.print((char)(i+64) +" ");
        //         System.out.print((char)(k+64) +" ");
        //     }
        //     System.out.println();
        // }


        // * * * * * * * * * 
        //   * * * * * * *
        //     * * * * *
        //       * * *
        //         *
        // int n = 5;
        //  for (int i = n; i >0; i--) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

     
        // 1
        // 1 2
        // 1 2 3 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1 

        // int n = 7;
        // int st = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=st; j++){
        //         // System.out.print("O ");
        //         System.out.print(j+" ");
        //     }
        //     if(i<n/2+1){ 
        //         st++;
        //     }else{
        //         st--;
        //     }
        //     System.out.println("");
        // }


        //         1
        //       1 2 1
        //     1 2 3 2 1
        //   1 2 3 4 3 2 1
        // 1 2 3 4 5 4 3 2 1

        // int n =5;
        // for(int i =1 ; i<=n; i++){
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print(k+" ");
        //     }
        //     for(int k = i - 1; k >= 1; k--){
        //         System.out.print(k+" ");
        //     }
            
        //     System.out.println();
        // }


        //         1
        //       2 1 2 
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5

        // int n =5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k= i; k>=1; k--){
        //         System.out.print(k+" ");
        //     }
        //     for(int k =2; k<=i; k++){
        //         System.out.print(k+" ");
        //     }

        //     System.out.println("");
        // }


        //         1
        //       1 2 1
        //     1 2 3 2 1
        //   1 2 3 4 3 2 1
        //     1 2 3 2 1
        //       1 2 1
        //         1


        int n = 7;
        int sp =n/2;
        int st = 1;
        for(int i=1; i<=n; i++){
            for(int j =1 ; j<=sp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<2*i; k++){
                System.out.print(k+" ");
            }
            // for(int k = i - 1; k >= 1; k--){
            //    System.out.print(k+" ");
            // }

            if(i<n/2+1){
             sp--;
            }else{
              sp++;
            }
           
            System.out.println();
        }
      }
}
