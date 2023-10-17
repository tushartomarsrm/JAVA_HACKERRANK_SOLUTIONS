import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            try {
                long l=s.nextLong();
                System.out.println(l+" can be fitted in:");
                if (l>=Byte.MIN_VALUE && l<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if (l>=Short.MIN_VALUE && l<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if (l>=Integer.MIN_VALUE && l<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if (l>=Long.MIN_VALUE && l<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
                }
                catch (Exception e){
                    System.out.println(s.next()+" can't be fitted anywhere.");
            }
        }
    }
}
