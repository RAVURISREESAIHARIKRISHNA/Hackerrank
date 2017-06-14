import java.util.*;

public class Solution {

    public static void main(String arg[])
      {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        try
            {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
        }catch(java.util.InputMismatchException e)
            {
            a=b=c=0;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}
