import java.util.*;
public class checkPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int var =0;
        for(int i=2; i<N; i++){
            if(N%i ==0){
                var = var+1;
            }
        }
        if(var>0){
            System.out.println(N + " is not a prime number");
        }
        else{
            System.out.println(N + " is a prime number");
        }
		sc.close();
    }
}