import java.util.*;

public class where_is_the_attack{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String s=sc.next();
        int d=0,o=0,p=0,e=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'D':d++;
                    break;
                case 'O':o++;
                    break;
                case 'P':p++;
                    break;
                case 'E':e++;
                    break;
                                        

            }
        }
        System.out.println(d+" "+o+" "+p+" "+e);
        
    }
}