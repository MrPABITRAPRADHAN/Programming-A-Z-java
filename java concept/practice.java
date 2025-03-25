public class practice {
    public static void main(String[] args) {
    int n=5;

    for(int c=1; c<=n;c++){
        for(int d=1; d<=c;d++){
            if ((c+d) %2 == 0){
              System.out.print("1");
            }else {
                System.out.print("0");
            }
            
        }
        System.out.println();
    }
 
    }
}
