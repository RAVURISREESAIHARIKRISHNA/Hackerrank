import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        s.nextLine();
        int arr[] = new int[n];
        String temp;
        for(int i=0;i<=n-1;i++){
            temp = s.nextLine();
            int count=0;
            for(int j=0;j<=temp.length()-2;j++){
                if(temp.charAt(j)==temp.charAt(j+1)){
                    count++;
                }
            }
            arr[i] = count;
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
