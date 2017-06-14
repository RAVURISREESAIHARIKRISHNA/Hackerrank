import java.util.Scanner;
import java.util.TreeSet;

public class Solution{
    public static void main(String args[]){
        int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[101];
        for(int i=0;i<=n-1;i++){
            k = s.nextInt();
            a[k]++;
        }
        int max=0;
        for(int i=0;i<=n-1;i++){
            if(a[i]+a[i+1]>max){
                max = a[i]+a[i+1];
            }
        }
        System.out.println(max);
    }
}
