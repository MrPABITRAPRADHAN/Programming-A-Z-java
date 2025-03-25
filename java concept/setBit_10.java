// set Bit..
import java.util.*;
public class setBit_10 {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int BitMask = 1<<pos;

        int newNum = BitMask | n;
        System.out.println(newNum);

        // clear bit
        int pos2 = 2;
        int BitMask2 = 1<<pos2;
        int notBitmask = ~(BitMask2);
        int NEWNUM = notBitmask & n;
        System.out.println(NEWNUM);
    }    
}
