public class countDigit02{
    public static void main(String[] args) {
        int n = 44354;
        int sum=0;
        while(n>0){
            int r = n%10;
            sum = sum+r;
            n = n/10;
        }
        System.out.println("sum of digit is :"+sum);
    }
}