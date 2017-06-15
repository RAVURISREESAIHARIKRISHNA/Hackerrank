import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String data;
        String list[] = new String[n];
        for(int i=1;i<=n;i++){
            data = s.nextLine();
            list[i-1]=checkIfIsHacker(data);
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(list[i]);
        }
    }
    private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
