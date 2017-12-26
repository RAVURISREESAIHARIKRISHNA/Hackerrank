import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<=t-1;i++){
            int n = s.nextInt();
            int m = s.nextInt();
            int start = s.nextInt();
            
            if(((m+start)-1)%n==0){
                System.out.println(n);
            }else{
                
                System.out.println((m+start-1)%n);
            }
        }
    }
}
