import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,max;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        max = s.nextInt();
        int a[] = new int[n];
        int count=0;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            if(a[i]<=max){
                continue;
            }else{
                count+=(a[i]-max);
                max = a[i];
            }
        }
        System.out.println(count);
    }
}
