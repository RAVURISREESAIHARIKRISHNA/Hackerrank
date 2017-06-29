import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        Solution obj = new Solution();
        obj.partition(arr );
    }
    public void partition(int[] ar) {
        int temp=0;
        int pivot=ar[0];
        int pIndex=ar.length-1;
        for(int i=ar.length-1;i>=1;i--){
            if(ar[i]>=pivot){
                temp=ar[i];
                ar[i]=ar[pIndex];
                ar[pIndex]=temp;
                pIndex-=1;
            }
        }
        temp=ar[pIndex];
        ar[pIndex]=ar[0];
        ar[0]=temp;
        for(int k=0;k<=ar.length-1;k++){
            System.out.print(ar[k]+" ");
        }
        System.out.println();
    }
    
}
