import java.util.Scanner;
import java.util.TreeSet;
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        int max = 0;
        int count = 0;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i=0;i<=n-1;i++){
            if(a[i] == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
