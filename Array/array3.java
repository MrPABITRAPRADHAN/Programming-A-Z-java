import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    // wap to print the occurance or frequency of each element in the array
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " many elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("=====================");
        System.out.println("The array element is: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);

        }

    }
}
