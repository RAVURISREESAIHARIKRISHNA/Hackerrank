import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int t;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        int a[] = new int[t];
        int k,temp,count,rem;
        for(int i=0;i<=t-1;i++){
            k = s.nextInt();
            temp = k;
            count = 0;
            while(temp>0){
                rem = temp%10;
                if(rem != 0){
                    if(k%rem == 0){
                        count++;
                    }
                }
                temp/=10;
            }
            a[i] = count;
        }
        for(int i=0;i<=t-1;i++){
            System.out.println(a[i]);
        }
    }
}
