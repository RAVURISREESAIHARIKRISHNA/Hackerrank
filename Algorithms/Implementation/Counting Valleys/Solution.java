import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        int n,prev_alt;
        String raw;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        raw = s.nextLine();
        int alt=0;
        //boolean lock = false;
        int count=0;
        for(int i=0;i<=raw.length()-1;i++){
            prev_alt = alt;
            if(raw.charAt(i) == 'U'){
                alt++;
            }
            if(raw.charAt(i) == 'D'){
                alt--;
            }
            if(prev_alt == 0 && alt<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
