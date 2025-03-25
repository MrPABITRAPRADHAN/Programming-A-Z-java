public class multDigit03 {
    public static void main(String[] args) {
        int n =1234;
        int multCount =1;
        while(n>0){
            int r = n%10;
            multCount = multCount*r;
            n = n/10;
        }
        System.out.println("Multiplication of digit is :"+multCount);
    }
}
