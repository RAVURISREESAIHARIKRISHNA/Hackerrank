import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();

        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
        }
        int count = 0;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                if((a[i]+a[j])%k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
