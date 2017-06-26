import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String raw;
        raw = s.nextLine();
        int a[] = new int[26];
        for(int i=0;i<=raw.length()-1;i++){
            a[(int)raw.charAt(i) - 97]++;
        }
        boolean stat = true;
        if(raw.length()%2==0){
            for(int i=0;i<=25;i++){
                if(a[i]%2!=0){
                    stat = false;
                    break;
                }
            }
        }else{
            int count=0;
            for(int i=0;i<=25;i++){
                if(a[i]%2!=0){
                    count++;
                }if(count>1){
                    stat = false;
                    break;
                }
            }
        }
        if(stat){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
