import java.util.*;

public class Solution
    {
    public static void main(String arg[])
        {
        Scanner s = new Scanner(System.in);
        String ans = "Weird";
        int a;
        try
            {
            a = s.nextInt();
        }catch(java.util.InputMismatchException e){
            
            a=0;
        }
        if(a%2==0)
            {
            //even
            if(a<=5&&a>=2)
                ans = "Not Weird";
            if(a>=6&&a<=20)
                ans = "Weird";
            if(a>20)
                ans = "Not Weird";
        }
        else
        {
            //odd
            ans = "Weird";
        }
        System.out.print(ans);
    }
}
