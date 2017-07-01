import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n+1];
        int ans[] = new int[n];
        int k = 0;
        for(int i=1;i<=n;i++){
            arr[i] = s.nextInt();
        }
        int first_index , second_index;
        for(int x = 1;x<=n;x++){
            first_index = second_index = 0;
            for(int l=1;l<=n;l++)
                if(arr[l] == x){
                    first_index = l;
                    // System.out.println(first_index);
                    l = n;
                }
            for(int l=1;l<=n;l++)
                if(arr[l] == first_index){
                    second_index = l;
                    // System.out.println(second_index);
                    // System.out.println("\n\n");
                    l = n;
                }
            if(first_index!=0 && second_index!=0){
                ans[k++] = second_index;
            }
        }
        for(int i=0;i<=k-1;i++){
            System.out.println(ans[i]);
        }
    }
}
