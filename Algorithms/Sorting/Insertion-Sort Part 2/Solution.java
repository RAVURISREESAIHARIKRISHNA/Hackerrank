import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<=n-1 ; i++){
            a[i] = s.nextInt();
        }
        Solution obj = new Solution();
        obj.insertionSort(a);
    }
    public void insertionSort(int arr[]){
        for(int i=1 ; i <= arr.length-1 ; i++){
            int key = arr[i];
            int j = i-1;
            while( j>=0 && arr[j]>key){
                arr[j+1] = arr[j--];
            }
            arr[j+1] = key;
            //Insertion Sort Completed
            //Now Printing
            for(int k=0 ;k<=arr.length-1;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
