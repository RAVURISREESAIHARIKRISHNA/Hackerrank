import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int score[] = new int[n];
        for(int i=0;i<=n-1;i++){
            score[i] = s.nextInt();
        }
        int high,highc,low,lowc,lock;
        high = low = highc = lowc = lock =0;
        for(int i=0;i<=n-1;i++){
            if(i==0){
                high = low = score[i];
                continue;
            }
            if(high<score[i]){
                high = score[i];
                highc++;
                continue;
            }
            else{
                if(low>score[i]){
                    low = score[i];
                    lowc++;
                }
            }
        }
        System.out.println(highc+" "+lowc);
        
    }
}
