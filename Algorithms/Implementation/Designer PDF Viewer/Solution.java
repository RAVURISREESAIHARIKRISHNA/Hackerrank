import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int a[] = new int[27];
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=26;i++){
            a[i] = s.nextInt();
        }
        s.nextLine();
        String raw;
        raw = s.nextLine();
        int max=0;
        for(int i=0;i<=raw.length()-1;i++){
            //a -> 97
            if( max < a[((int)raw.charAt(i)-96)]  ){
                max = a[((int)raw.charAt(i)-96)];
            }
        }
        System.out.println((max*(raw.length())));
    }
}
