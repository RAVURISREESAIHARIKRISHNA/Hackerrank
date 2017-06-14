import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n;
        boolean found;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[][] = new int[n][2];
        int k=0;
        int x;
        for(int i=0;i<=n-1;i++){
            x = s.nextInt();
            found = false;
            for(int j=0;j<=n-1;j++){
                if(x==a[j][0]){
                    a[j][1]++;
                    found = true;
                    break;
                }
            }
            if(!found){
                a[k][0]=x;
                a[k][1]++;
                k++;
            }
        }
        // for(int i=0;i<=n-1;i++){
        //     System.out.println(a[i][0]+"  "+a[i][1]);
        // }
        int count = 0;
        for(int i=0;i<=n-1;i++){
            if(a[i][0]==0){
                break;
            }
            if(a[i][1]%2==0){
                count += (a[i][1]/2);
                continue;
            }
            if(    (a[i][1]-1)%2==0  &&  a[i][1]-1 != 0     ){
                count += ((a[i][1]-1)/2);
            }
        }
        System.out.println(count);
    }

}
