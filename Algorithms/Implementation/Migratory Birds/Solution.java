import java.util.Scanner;
import java.util.TreeSet;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        int f[][] = new int[n][2];
        int k = 0;
        boolean found;
        for(int i=0;i<=n-1;i++){
            a[i]=s.nextInt();
            found = false;
            for(int j=0;j<=n-1;j++){
                if(a[i] == f[j][0]){
                    f[j][1]++;
                    found = true;
                    break;
                }
            }
            if(!found){
                f[k][0] = a[i];
                f[k][1]++;
                k++;
                found = false;
            }

        }
        // for(int i=0;i<=n-1;i++){
        //     System.out.println(f[i][0]+" "+f[i][1]);
        // }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<=n-1;i++){
            if(f[i][0]!=0){
                set.add(f[i][1]);
            }
        }
        int high = set.last();
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int j=0;j<=n-1;j++){
            if(f[j][1] == high){
                set1.add(f[j][0]);
            }
        }
        System.out.println(set1.first());
    }
}
