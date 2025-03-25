//Qn. find the factorial of a no. using a function
import java.util.Scanner;
 
public class Qn2 {
    public static void factor(int n){
        int fact = 1;
        for(int i=n; i>=1;i--){
           fact = fact *i;
        }
        System.out.println(fact);
      }
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt();
       System.out.print("factorial of the no. is ");
       factor(n);
    }
}
