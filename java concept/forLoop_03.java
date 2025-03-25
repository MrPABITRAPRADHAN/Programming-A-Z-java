public class forLoop_03 {
    public static void main(String[] args) {
        System.out.println("for loop");
        for(int count = 1; count<10; count++ ){
            System.out.println(count);
        }

        System.out.println("While loop");
        int i = 0;
        while(i<11){
            System.out.println(i);
            i = i+1;
        }

        System.out.println("Do while loop");
        int j =0;
        do{
            System.out.println(j);
            j = j+1;
        } while(j<11);
    }
}
