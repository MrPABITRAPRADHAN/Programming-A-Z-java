import java.util.*;

public class Pattern_05 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
      
        //  pattern1 
        System.out.println("pattern 1");
      for(int i=1;i<=4;i++){
         System.out.println();  
         for(int j=1;j<=5; j++){
            System.out.print(" *");
          } 
      }

       //   pattern2
     System.out.println("pattern 2");
      for(int a=1; a<=4; a++){
         System.out.println();
          for(int b= 1; b<=5;b++){
            
            if(a==1 || b==1 || a==4 || b==5){
               System.out.print(" *");
            } else{
               System.out.print("  ");
            }
          }
      }

       //  pattern3
       System.out.println("pattern 3");
       int n=4;
      for(int x=1; x<=n;x++){
         System.out.println();
          for(int y=1; y<=x; y++){
            System.out.print("*");
          }
      } 
      //  pattern 4
      System.out.println("pattern 4");
      for(int p=n; p>=1; p--){
         System.out.println();
          for(int q=1; q<=p;q++){
            System.out.print("*");
          }
      }
      //  pattern 5
      System.out.println("pattern 5");
      // outer loop
     for(int A=1; A<=n; A++){
      // inner loop for space_
      for(int B=1; B<=n-A;B++){
          System.out.print(" ");
      }
      // inner loop for *
      for(int B=1; B<=A;B++){
          System.out.print("*");
      }
      System.out.println();
  }
      // 101010 pattern 
      System.out.println("Pattern 6");
      int t=5;

      for(int c=1; c<=n;c++){
          for(int d=1; d<=c;d++){
              if ((c+d) %2 == 0){
                System.out.print("1");
              }else {
                  System.out.print("0");
              }
              
          }
          System.out.println();
      }

    }
}
 