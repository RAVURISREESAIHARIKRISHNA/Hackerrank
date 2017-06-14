import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }
}
