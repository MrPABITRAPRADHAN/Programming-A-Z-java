
import java.util.*;

public class findHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a>b){
            a = a-b;
            System.out.println(a);
        }
        else if(a<b){
            b = b-a;
            System.out.println(b);
        }
        else if (a == b){
            System.out.println(b);
        }
        
    }
}