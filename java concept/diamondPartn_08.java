public class diamondPartn_08 {
    public static void main(String[] args){
        int n=6;
//top part
        for( int i=1; i<=n; i++){ //printing row number

            for(int j=1; j<=n-i; j++){ //printing space
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){ //printing stars
                System.out.print("* ");
            }
           System.out.println(" ");
        }

//bottom part
         for( int i=1; i<=n-1; i++){ //printing row number

            for(int j=1; j<=i; j++){ //printing space
                System.out.print(" ");
            }

            for(int j=1; j<=n-i; j++){ //printing stars
                System.out.print("* ");
            }
           System.out.println(" ");
        }
    }
}
