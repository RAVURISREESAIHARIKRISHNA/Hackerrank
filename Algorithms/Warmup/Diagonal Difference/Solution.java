import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                a[i][j] = s.nextInt();
            }
        }
        int sum1 = 0;
        for(int i=0;i<=n-1;i++){
            sum1 += a[i][i];
        }
        int sum2 = 0;//int j;
        for(int i=0,j=n-1;i<=n-1&&j>=0;i++){
            sum2 += a[i][j];j--;
        }
        if(sum2-sum1>0){
            System.out.println(sum2-sum1);
        }
        else{
            System.out.println(sum1-sum2);
        }
    }
}
