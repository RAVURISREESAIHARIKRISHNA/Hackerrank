import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        double inst_miles=0;
        for(int i = n-1,j=0;i>=0;i--,j++){
            inst_miles +=  (arr[i] * Math.pow(2 ,j ));
        }
        System.out.println((long)inst_miles);
    }
}
