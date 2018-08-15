import java.util.*;

public class Solution{
    public static void main(String[] args){
        int n;
        String raw;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        raw = s.nextLine();
        TreeSet<String> mySet = new TreeSet<>();
        for(int i=0;i<=raw.length()-1;i++){
            mySet.add(new Character(raw.charAt(i)).toString());

        }
        String[] chars = new String[mySet.size()];
        Iterator<String> itr = mySet.iterator();
        int k=0;
        while(itr.hasNext()){
            chars[k++] = itr.next();
        }
        String raw_copy;
        String a,b,regex;
        int max = 0;
        for(int i=0;i<=chars.length-1;i++){
            a = chars[i];
            for(int j=i+1;j<=chars.length-1;j++){
                b = chars[j];
                regex = "";
                regex = "[^"+a+b+"]";
                raw_copy = raw;
                raw_copy = raw_copy.replaceAll(regex,"");
                if(isAlternate(raw_copy)&&raw_copy.length()>max){
                    max = raw_copy.length();
                }
            }
        }
        System.out.println(max);

    }
    public static boolean isAlternate(String test){
        for(int i=0;i<=test.length()-2;i++){
            if(test.charAt(i)!=test.charAt(i+1))
                continue;
            else
                return false;
        }
        return true;
    }
}
