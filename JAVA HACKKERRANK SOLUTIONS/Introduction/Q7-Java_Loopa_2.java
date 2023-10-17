import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        for (int i=0;i<q;i++){
            int a=s.nextInt();int b=s.nextInt();int n=s.nextInt();
            for (int j=0;j<n;j++){
                a+=b* (int) Math.pow(2,j);
                System.out.format("%d ",a);
            }
            System.out.println();
        }
    }
}
