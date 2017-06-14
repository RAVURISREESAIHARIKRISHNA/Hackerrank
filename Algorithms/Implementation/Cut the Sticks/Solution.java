import java.util.Scanner;
import java.util.TreeSet;

public class Solution{
    public static void main(String args[]){
        int n,max=0,maxpos=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        int count[] = new int[n*2];
        int x=0,var;
        count[x++]=n;
        //count[x++]=n;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            // if(i==0)
            //     min = a[i];
            // else{
            //     if(a[i]<min){
            //         min=a[i];
            //     }
            // }
            if(a[i]>max){max = a[i];maxpos=i;}
        }
        int min;
        while(a[maxpos]!=0){
            min = min_of(a,n);
            var=0;
            for(int i=0;i<=n-1;i++){
                if(a[i]==0){
                    continue;
                }
                a[i]-=min;
                if(a[i]!=0){
                    var++;
                }
            }
            count[x++]=var;
        }
        for(int i=0;i<=x-2;i++){
            System.out.println(count[i]);
        }
    }
    public static int min_of(int a[],int n){
        TreeSet<Integer> set = new TreeSet<>();
        boolean lock = true;
        for(int i=0;i<=n-1;i++){
            if(a[i]!=0){
                set.add(a[i]);
                lock = false;
            }
        }
        if(lock){
            return 0;
        }
        return(set.first());
    }
}
