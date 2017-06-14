import java.util.Scanner;
//import java.lang.Math.Math.abs;

public class Solution{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[][] = new int[n][3];
        for(int i =0;i<=n-1;i++){
            for(int j=0;j<=2;j++){
                a[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<=n-1;i++){
            if(Math.abs(a[i][0]-a[i][2])<(Math.abs(a[i][1]-a[i][2]))){
                System.out.println("Cat A");
                continue;
            }
            if(Math.abs(a[i][1]-a[i][2])<(Math.abs(a[i][0]-a[i][2]))){
                System.out.println("Cat B");
                continue;
            }
            if(Math.abs(a[i][0]-a[i][2])==(Math.abs(a[i][1]-a[i][2]))){
                System.out.println("Mouse C");
                continue;
            }
        }
    }
}
