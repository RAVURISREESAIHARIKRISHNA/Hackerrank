import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean arr[] ;
        int n = s.nextInt();
        s.nextLine();
        for(int i=0;i<=n-1;i++){
            int cost = 0;
            arr = new boolean[26];
            String src = s.nextLine();
            for(int j=0;j<=src.length()-1;j++){
                if( arr[ (int)src.charAt(j) -97 ] ){ //Already there
                    continue;
                }else{
                    cost++;
                    arr[(int)src.charAt(j)-97] = true;
                }
            }

            System.out.println(cost);
        }
    }
}
