import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int x1,v1,x2,v2;
        Scanner s = new Scanner(System.in);
        x1 = s.nextInt();
        v1 = s.nextInt();
        x2 = s.nextInt();
        v2 = s.nextInt();

        if(x1>x2 && v1>v2){
            System.out.println("NO");
            System.exit(0);
        }

        if(x2>x1 && v2>v1){
            System.out.println("NO");
            System.exit(0);
        }
        if(v2==v1){
            System.out.println("NO");
            System.exit(0);
        }

        if((x1-x2)%(v2-v1) == 0 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
