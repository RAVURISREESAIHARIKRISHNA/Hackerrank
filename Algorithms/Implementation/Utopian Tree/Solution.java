import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<=n-1;i++){
            a[i] = s.nextInt();
        }
        int init=1;
        boolean spring;
        for(int j=0;j<=n-1;j++){
            spring = true;
            init=1;
            for(int i=1;i<=a[j];i++){
                if(spring){
                    spring  = false;
                    init=init*2;
                    continue;
                }else{
                    spring = true;
                    init++;
                }
            }
            System.out.println(init);
        }
    }
}
