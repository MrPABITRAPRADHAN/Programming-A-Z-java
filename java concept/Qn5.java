//Qn. take two no as x and n. and find the value of X^n raised to it.
import java.util.*;
public class Qn5 {
    public static void power(int x, int n){
        int y = x^n;
        System.out.println(y);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();

        System.out.println("The value of X^n is : ");
        power(x, n);
    }
}
