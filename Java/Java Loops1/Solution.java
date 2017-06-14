import java.util.*;

public class Solution
    {
    public static void main(String arg[])
        {
        Scanner s = new Scanner(System.in);
        int a;
        try
            {
            a = s.nextInt();
            
        }
        catch(java.util.InputMismatchException e)
            {
        a=0;    
        }
        for(int i=1;i<=10;i++)
            {
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}
