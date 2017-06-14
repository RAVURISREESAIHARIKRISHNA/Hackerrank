import java.util.Scanner;
//import java.util.TreeSet;
public class Solution{
    public static void main(String args[]){
        int s,t,a,b,m,n;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        t = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        m = in.nextInt();
        n = in.nextInt();

        int apple[] = new int[m];
        int orange[] = new int[n];

        int applein=0;
        int orangein = 0;
        for(int i=0;i<=m-1;i++){
            apple[i] = in.nextInt();
            if(inRange(a+apple[i],s,t)){
                applein++;
            }
        }
        for(int i=0;i<=n-1;i++){
            orange[i] = in.nextInt();
            if(inRange(b+orange[i],s,t)){
                orangein++;
            }
        }
        System.out.println(applein);
        System.out.println(orangein);

    }

    public static boolean inRange(int x , int s , int t){
        if(x>=s&&x<=t){
            return true;
        }
        return false;
    }
}
