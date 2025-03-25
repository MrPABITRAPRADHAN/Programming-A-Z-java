public class FindPower01 {
    
   public static void main(String[] args){
         int n = 2;
         int p = 3;
         System.out.println("power of "+n+" "+" is :");
         System.out.println(powerr(n,p));
   }

   public static int powerr(int n, int p){
     int pow = 1;
     for(int i=1; i<=p; i++){
         pow = pow * n;
     }
     return pow;
   }
}

// wap to count how many digit are preeesent in given number
// wap to define a method to ccount how many even digit are present in given num
// wap to define a method to print sum of odd digit preesent in the number