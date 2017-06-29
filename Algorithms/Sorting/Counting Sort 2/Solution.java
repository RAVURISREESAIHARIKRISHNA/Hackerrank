import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int frequency[] = new int[100];
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            frequency[a[i]]++;
        }
        for(int i=0;i<=99;i++){
            for(int j=0;j<=frequency[i]-1;j++){
                System.out.print(i+" ");
            }
        }
    }
}
