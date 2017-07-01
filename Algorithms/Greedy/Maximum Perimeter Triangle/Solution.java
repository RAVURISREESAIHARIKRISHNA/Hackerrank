import java.util.Scanner;
import java.util.Arrays;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int i = n-3;
        //The intention of using while loop is to preserve the value of i
        while(i>=0 && arr[i]+arr[i+1] <= arr[i+2]/*If Cannot Form Triangle*/){
            i -= 1;//As Triangle cannot be forme ....Move ON
        }
        if(i>=0){//If a Triangle with Largest can be Formed
            /*
            All the Conditions are already obeyed as we worked on the Sorted Array
            which contains all the lengths in sorted array
            Condition 1:
                As we are parsing from back this is satisfied
            Condition 2:
                This cannot be occur,as we are taking the largest side first.Though there
                is a multiple permutations,we need not care as we are taking the Largest 
                possible one(Sorted array)
            Condition 3:
                The way of approach is self-explanatory
            */
            System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
        }else{
            //We completed the parsing of the array but did not find any match
            System.out.println(-1);
        }
    }
}
