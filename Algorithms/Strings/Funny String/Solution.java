import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String normal,reverse;
        int n;n=s.nextInt();s.nextLine();String ans[] = new String[n];for(int x=0;x<=n-1;x++){
        normal = s.nextLine();
        reverse = new StringBuilder(normal).reverse().toString();
        boolean fun = true;int a,b;
        for(int i=1;i<=normal.length()-1;i++){
            a = Math.abs((int)normal.charAt(i) - (int)normal.charAt(i-1));
            b = Math.abs((int)reverse.charAt(i) - (int)reverse.charAt(i-1));
            if(a!=b){
                fun = false;
                break;
            }
        }
        if(fun){
            //System.out.println("Funny");
            ans[x]="Funny";
        }else{
            //System.out.println("Not Funny");
            ans[x] = "Not Funny";
        }}for(int i=0;i<=n-1;i++)System.out.println(ans[i]);
    }
}
