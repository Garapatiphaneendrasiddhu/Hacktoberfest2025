import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++)
        {
            if(n % i == 0 && isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        
        for(int i = 2; i<num/2; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
