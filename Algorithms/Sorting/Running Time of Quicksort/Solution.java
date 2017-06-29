import java.util.Scanner;

public class Solution{
    private static int quickSortCount;
    private static int insertionSortCount;
    public Solution(){
        quickSortCount=insertionSortCount=0;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0;i<=n-1;i++){
            a[i] = b[i] = s.nextInt();
        }
        Solution obj = new Solution();
        obj.quickSort(a , 0 , n-1);
        obj.insertionSort(b);
        System.out.println((insertionSortCount - quickSortCount));
    }
    public void quickSort(int arr[] , int low ,int high){
       if(low < high){
           int partition_index = partition(arr , low , high);
           quickSort(arr , low , partition_index - 1);
           quickSort(arr , partition_index + 1 , high);
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
               quickSortCount++;
           }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;
       quickSortCount++;
       return i + 1;
   }
   public void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1;i<=n-1;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                insertionSortCount++;
                j -= 1;
            }
            arr[j+1] = key;
        }
    }
}
