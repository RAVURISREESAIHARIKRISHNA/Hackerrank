import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        s.nextLine();
        int arr[] = new int[n];
        String a,b;
        for(int c=0;c<=n-1;c++){
            a = s.nextLine();
            b = s.nextLine();
            for(char ch : "qwertyuiopasdfghjklzxcvbnm".toCharArray()){
                if(a.indexOf(ch)>-1 && b.indexOf(ch) > -1){
                    arr[c]=1;
                    break;
                }
            }
        }
        for(int i=0;i<=n-1;i++){
            if(arr[i]==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
