import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int a[] = new int[n];
        double pos,neg,zero;
        pos = neg = zero = 0;
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            if(a[i]>0){
                pos++;
            }
            if(a[i]<0){
                neg++;
            }
            if(a[i]==0){
                zero++;
            }
        }
        //System.out.println(pos);System.out.println(neg);System.out.println(zero);
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}
