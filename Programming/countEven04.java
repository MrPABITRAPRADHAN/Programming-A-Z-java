public class countEven04 {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println("the no. of even digit in_"+ n+ "_is_"+countEvenDigit(n));;
    }

    static int countEvenDigit(int n) {
        int count =0;
        while(n>0){
          int r = n%10;
          if(r%2==0){
              count++;
          }
            n = n/10;
        }
        return count;
    }
}

// wap to define a method to num is spy(sum of each digit no = product of each digit) no or not
