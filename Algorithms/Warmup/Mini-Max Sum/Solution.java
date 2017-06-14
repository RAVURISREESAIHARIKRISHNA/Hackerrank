import java.util.Scanner;
import java.util.TreeSet;
public class Solution{
    public static void main(String args[]){
        long a[] = new long[5];
        long sum=0;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<=4;i++){
            a[i] = s.nextLong();
            sum += a[i];
        }
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0;i<=4;i++){
            set.add(sum-a[i]);
        }
        System.out.println(set.first()+" "+set.last());
    }
}
