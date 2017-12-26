import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int q = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        int mod = k%n;
        for(int i=0;i<=q-1;i++){
            int x = s.nextInt();
            if(x - mod >= 0){
                System.out.println(arr[x-mod]);
            }else{
                System.out.println(arr[x-mod+arr.length]);
            }
        }
    }
}
