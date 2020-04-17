import java.util.*;
  
class Solution 
{ 
    public static void primeFactors(int number) 
    {
        int n = number;
        List <Integer>primeFactor = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) 
        {
            while (n % i == 0) 
            {
                primeFactor.add(i);
                n /= i;
           }
        }
        int res=1;
        for(int i=0;i<primeFactor.size();i++)
        {
            if(primeFactor.get(i)>4)
            {
                res=res*2;
            }
            else
                res=res*primeFactor.get(i);
        }
        System.out.println(res);
    } 
  
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        primeFactors(n); 
    } 
}