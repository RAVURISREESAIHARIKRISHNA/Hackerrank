import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        s.nextLine();
        int arr[][] = new int[n][26];
        String temp;
        for(int i=0;i<=n-1;i++){
            temp = s.nextLine();
            for(int j=0;j<=temp.length()-1;j++){
                arr[i][((int)temp.charAt(j))-97] = 1;
            }
        }
        int count=0;
        boolean cas;
        for(int i=0;i<=25;i++){
            for(int j=0;j<=n-1;j++){
                if(arr[j][i]!=1){
                    break;
                }
                if(j==n-1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
