//Qn. find the greater of two no.s . .
import java.util.*;
public class Qn4 {
    public static void greater(int a, int b){
        if(a>b){
            System.out.println(a + " is greater ");
        }
        else{
            System.out.println(b + " is greater");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the First no.");
      int a = sc.nextInt();
      System.out.print("Enter the second ");
      int b = sc.nextInt();

      greater(a, b);
    }
}
