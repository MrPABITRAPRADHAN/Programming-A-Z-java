import java.util.*;
public class switch_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int btn = sc.nextInt();

        // if(btn == 1) {
        //   System.out.println("hello");
        // } else if(btn == 2){
        //   System.out.println("Namaste");
        // } else if(btn == 3){
        //   System.out.println("Banjour");
        // } else {
        //   System.out.println("invalid btn");
        // }
        
        switch(btn){
          case 1:System.out.println("Hello");
          break;
          case 2:System.out.println("Namaste");
          break;
          case 3:System.out.println("Banjour");
          break;
          default:System.out.println("Invalid button");
    
        }
    }
}
