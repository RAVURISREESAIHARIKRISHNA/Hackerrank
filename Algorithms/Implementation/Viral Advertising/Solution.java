import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int liked = 2;
        for(int i=1;i<=n;i++){
            if(i==1){
                count+=liked;
                continue;
            }else{
                liked = liked * 3;
                liked = liked/2;
                count+=liked;
            }
        }
        System.out.println(count);
    }
}
