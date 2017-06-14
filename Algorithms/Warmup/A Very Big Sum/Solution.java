import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        int n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        long sum=0;
        long x;
        for(int i=1;i<=n;i++)
        {
            x=s.nextLong();
            sum+=x;
        }
        System.out.println(sum);
    }
}
