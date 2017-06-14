import java.util.Scanner;
//import java.util.TreeSet;
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        int diff;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            if(a[i]<38){
                continue;
            }
            diff = mul(a[i]) - a[i];
            if(diff < 3){
                //Round
                a[i] = mul(a[i]);
            }

        }
        for(int i=0;i<=n-1;i++){
            System.out.println(a[i]);
        }

    }

    public static int mul(int x){
        int i;
        for(i=0;i<=20;i++){
            if(5*i > x){
            break;
            }
        }
        return i*5;
    }
}
