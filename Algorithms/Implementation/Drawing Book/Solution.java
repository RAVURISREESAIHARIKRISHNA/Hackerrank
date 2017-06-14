import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,p;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        p = s.nextInt();
        int a = p/2;
        int b = (n/2)-(p/2);
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
