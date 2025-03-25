//Qn. find the odd no. from 1-10..
import java.util.*;

public class Qn3 {
    public static void FindOdd() {
      for(int i= 0; i<=10; i++){
        if(i%2 != 0){
            System.out.println(i);
        }
      }
    }
    public static void main(String[] args) {
      int n = 10;

      FindOdd();
    }
}
