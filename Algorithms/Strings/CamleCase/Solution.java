import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String raw;
        raw = s.nextLine();
        int count = 0;
        for(int i=0;i<=raw.length()-1;i++){
            if('A'<=raw.charAt(i) && raw.charAt(i)<='Z'){
                count++;
            }
        }
        count=count+1;
        System.out.println(count);
    }
}
