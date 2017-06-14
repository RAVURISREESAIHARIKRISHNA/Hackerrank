import java.util.*;

public class Solution
    {
    public static void main(String arg[])
        {
        Scanner s = new Scanner(System.in);
        int a=0;
        Double b=0.0;
        String c;
        try
            {
            a = s.nextInt();
            b = s.nextDouble();
            
           // d// = c;
        }
        catch(java.util.InputMismatchException e){
            
        }
        s.nextLine();
        c = s.nextLine();
        System.out.print("String: ");
        System.out.println(c);
        System.out.println("Double: "+b);
        System.out.print("Int: "+a);
    }
}
