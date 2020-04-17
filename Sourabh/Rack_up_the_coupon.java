import java.util.*;

public class Rack_up_the_coupon {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(((t%(x+y))==0||(t%(y+z))==0||(t%(x+z))==0||t%x==0||t%y==0||t%z==0)&&(x+y+z)==t)
        {
            System.out.println("Possible to achieve exact amount");
        }
        else
            System.out.println("Overpaid! These scammers owe me");
    }
}