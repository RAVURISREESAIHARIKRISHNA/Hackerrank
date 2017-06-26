import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a,b;
        a = s.nextLine();
        b = s.nextLine();
        int arr[] = new int[26];
        for(int i=0;i<=a.length()-1;i++){
            arr[(int)a.charAt(i) - 97]++;
        }
        for(int i=0;i<=b.length()-1;i++){
            arr[(int)b.charAt(i) - 97]--;
        }
        int sum=0;
        for(int i=0;i<=25;i++){
            sum += Math.abs(arr[i]);
        }
        System.out.println(sum);
    }
}
