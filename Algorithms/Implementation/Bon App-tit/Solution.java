import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,k,costed;
        int total = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
            total+=a[i];
        }
        total-=a[k];
        total= total/2;
        //System.out.println("Total"+total);
        costed = s.nextInt();
        if(costed == total){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(costed-total);
        }

    }
}
