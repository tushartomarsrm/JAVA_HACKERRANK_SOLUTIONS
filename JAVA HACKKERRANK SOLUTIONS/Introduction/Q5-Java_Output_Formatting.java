import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
        String a = s.next(); // Takes input up to whitespaces only
        int b = s.nextInt(); // Takes integer input
        System.out.printf("%-15s%03d\n", a, b); // Prints the output in the specified format
        }
    s.close();
    System.out.println("================================");
    
    }
}
