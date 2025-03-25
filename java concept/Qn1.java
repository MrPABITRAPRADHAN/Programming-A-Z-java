// Qn. entered 3 no. by user and find its avg using a function.
import java.util.*;
public class Qn1 {
    public static void avg(int a, int b, int c){
        int Average =(a+b+c)/2;
        System.out.println(Average);
    }
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first number");
       int a = sc.nextInt();
       System.out.println("enter the second");
       int b = sc.nextInt();
       System.out.println("enter the third");
       int c = sc.nextInt();

       System.out.print("The avg of the no.s is ");
       avg(a, b, c);
    }
}
