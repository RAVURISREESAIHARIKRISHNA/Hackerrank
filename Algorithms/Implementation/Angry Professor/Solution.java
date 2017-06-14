import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,k,t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        int a[];
        String arr[] = new String[t];
        int b=0;
        int count;
        for(int f=1;f<=t;f++){
            n = s.nextInt();
            k = s.nextInt();
            a = new int[n];
            count = 0;
            for(int i=0;i<=n-1;i++){
                a[i] = s.nextInt();
                if(a[i]<=0){
                    count++;
                }
            }
            if(k<=count){
                //System.out.println("YES");
                arr[b++]="NO";
            }else{
                //System.out.println("NO");
                arr[b++]="YES";
            }
        }
        for(int i=0;i<=t-1;i++){
            System.out.println(arr[i]);
        }
    }
}
