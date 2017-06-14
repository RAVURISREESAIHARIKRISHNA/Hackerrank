import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        int size;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        //int a[] = new int[size];
        int sum=0,x;
        for(int i=0;i<=size-1;i++)
        {
            x=s.nextInt();
            sum+=x;
        }
        System.out.println(sum);
    }
}
