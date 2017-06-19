import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int currentCharCount = 1;
        int lastAlphaNum = 0;
        Set<Integer> numList = new HashSet<Integer>();
        for (int i = 0; i < s.length(); i++) {
            int alphaNum = s.charAt(i) - 96;
            if (alphaNum == lastAlphaNum) currentCharCount++;
            else {
                currentCharCount = 1;
                lastAlphaNum = alphaNum;
            }
            numList.add(alphaNum * currentCharCount);
        }        
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println(numList.contains(x) ? "Yes" : "No");
        }
    }
}
