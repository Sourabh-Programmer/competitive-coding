import java.util.*;

public class math_test {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("Fail");
        }
        else
        {
            for(int i=1;i<n;i+=2)
            {
                System.out.print(i+" "+(i-1)+" ");
            }
        }
        
    }
}