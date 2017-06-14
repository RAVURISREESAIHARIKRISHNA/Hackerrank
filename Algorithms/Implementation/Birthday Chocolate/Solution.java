import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n,d,m;
        n = s.nextInt();//1
        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();//4
        }
        d = s.nextInt();//4
        m = s.nextInt();//1
        int sum,count;
        sum = count = 0;
        for(int i=0;i<=n-m;i++){
            for(int j=i;j<=i+m-1;j++){
                sum += a[j];
            }
            if(sum == d){
                count++;
                sum = 0;
                continue;
            }
            else{
                sum = 0;
            }
        }

        System.out.println(count);
    }
}
