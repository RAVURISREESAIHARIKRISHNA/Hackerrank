import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        int a1,a2,a3,b1,b2,b3;
        Scanner s = new Scanner(System.in);
        a1 = s.nextInt();
        a2= s.nextInt();
        a3 = s.nextInt();
        b1 = s.nextInt();
        b2 = s.nextInt();
        b3 = s.nextInt();
        int ap=0;int bp=0;
        ap = ((a1>b1)?1:0 ) +((a2>b2)?1:0)+((a3>b3)?1:0);
        bp = ((b1>a1)?1:0)+((b2>a2)?1:0)+((b3>a3)?1:0);
        System.out.println(ap+" "+bp);
    }
}
