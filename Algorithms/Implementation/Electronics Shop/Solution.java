import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int money,key,usb;
        Scanner s = new Scanner(System.in);
        money = s.nextInt();
        key = s.nextInt();
        usb = s.nextInt();
        int a[] = new int[key];
        int b[] = new int[usb];
        for(int i=0;i<=key-1;i++){
            a[i] = s.nextInt();
        }
        for(int i=0;i<=usb-1;i++){
            b[i] = s.nextInt();
        }
        int max = 0;
        for(int i=0;i<=key-1;i++){
            for(int j=0;j<=usb-1;j++){
                if((a[i]+b[j])<=money && (a[i]+b[j]) > max)
                    max = (a[i]+b[j]);
            }
        }
        if(max!=0){
            System.out.println(max);
        }else{
            System.out.println(-1);
        }
    }
}
