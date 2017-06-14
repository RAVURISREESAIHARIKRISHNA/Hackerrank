import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n+1];
        int count=1;
        for(int i=1;i<=n;i++){
            k = s.nextInt();
            if(i>1 &&k==a[count-1]){
                continue;
            }else{
                a[count++] = k;
            }
        }
        // System.out.println("***********");
        // for(int i=1;i<=count;i++){
        //     System.out.println(a[i]);
        // }
        // System.out.println("***********");

        int m;
        m = s.nextInt();
        int arr[] = new int[m];
        for(int j=0;j<=m-1;j++){
            k = s.nextInt();
            for(int i=1;i<=count;i++){
                if(k<=a[i]&&k>=a[i+1]){
                    arr[j] = i+1;
                    break;
                }
            }
        }
        for(int i=0;i<=m-1;i++){
            System.out.println(arr[i]);
        }
    }
}
