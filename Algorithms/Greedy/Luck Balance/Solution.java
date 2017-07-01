import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int luckSum = 0;
        ArrayList<Integer> importantContestLuck = new ArrayList<>();
        int luck,t;
        for(int i=0;i<=n-1;i++){
            luckSum += luck = s.nextInt();
            t = s.nextInt();
            if(t==1){//Important Contest
                importantContestLuck.add(luck);
            }
        }
        Collections.sort(importantContestLuck);
        t = 0;
        for(int i=0;i<=importantContestLuck.size()-k-1;i++){
            t += importantContestLuck.get(i);
        }
        System.out.println((luckSum-2*t));
    }
}
