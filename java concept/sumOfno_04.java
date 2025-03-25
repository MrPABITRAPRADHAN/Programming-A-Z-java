import java.util.*;

public class sumOfno_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i, sum=0;
        // System.out.println("The numbers are");
        for(i=1; i<=n;i++){
            // System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
