import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        s.nextLine();
        String data;
        int count;
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            data = s.nextLine();
            int k=0;
            count = 0;
            int j=data.length()-1;
            while(k<j){
                count += Math.abs( (int)data.charAt(k++) - (int)data.charAt(j--) );
            }
            arr[i] = count;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
