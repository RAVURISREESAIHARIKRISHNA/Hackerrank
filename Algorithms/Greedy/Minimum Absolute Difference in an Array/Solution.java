import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int min;
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        Solution obj = new Solution();
        obj.sort(arr,0,n-1);
        min = Math.abs(arr[0]-arr[1]);
        for(int i=1;i<=n-2;i++){
            if(Math.abs(arr[i]-arr[i+1])<min){
                min = Math.abs(arr[i]-arr[i+1]);
            }
        }
        System.out.println(min);
    }
    public void sort(int arr[] , int low ,int high){
       if(low < high){
           int partition_index = partition(arr , low , high);
           sort(arr , low , partition_index - 1);
           sort(arr , partition_index + 1 , high);
       }
   }
   public int partition(int arr[] , int low , int high){
       int pivot = arr[high];
       int i = low - 1;
       for(int j = low ; j <=high-1 ;j++){
           if(arr[j] <= pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;
       return i + 1;
   }
}
