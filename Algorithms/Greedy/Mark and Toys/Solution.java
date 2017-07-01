import java.util.Scanner;
import java.util.Arrays;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0 , cost = 0;
        for(int i=0;i<=n-1;i++){
            if(cost+arr[i] <= k){
                sum++;
                cost += arr[i];
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}
