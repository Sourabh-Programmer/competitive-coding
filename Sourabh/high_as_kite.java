import java.io.*;
import java.util.*;

public class high_as_kite {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "/";
        String p = "\\";
        
        for(int i=0;i<n;i++)
        {
             System.out.print("  "+s+p+"  ");
        }
        System.out.println();
         for(int i=0;i<n;i++)
        {
             System.out.print(" "+s+"  "+p+" ");
        }
         System.out.println();
         for(int i=0;i<n;i++)
        {
             System.out.print(s+"    "+p);
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
             System.out.print(p+"    "+s);
        }
        System.out.println();
         for(int i=0;i<n;i++)
        {
             System.out.print(" "+p+"  "+s+" ");
        }
         System.out.println();
         for(int i=0;i<n;i++)
        {
             System.out.print("  "+p+s+"  ");
        }
           
    }
}