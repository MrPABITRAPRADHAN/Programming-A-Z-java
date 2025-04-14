public class sumOfEachDigit {
    public static void main(String[] args) {
        int n = 4444;

        System.out.println(calc(n));

    }

    static int calc(int n) {
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }
            n = sum;
        }
        return n;
    }
}

//? wap to define a method to check the user entered number is happy num or not.(sum of square of each digit until get it single digit and the single digit should be 1 )
//97

//? wap to print nearest prime num for the given num.