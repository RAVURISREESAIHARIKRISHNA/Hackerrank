import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String raw;
        raw = s.nextLine();
        //int i=0;
        while(repeat(raw)){
            //System.out.println(i+" : "+raw);i++;
            raw = process(raw);
        }
        boolean lock = true;
        try{
            char ch = raw.charAt(0);
        }catch(Exception e){
            System.out.println("Empty String");lock=false;
        }
        if(lock){
            System.out.println(raw);
        }
    }
    public static boolean repeat(String src){
        for(int i=0;i<=src.length()-2;i++){
            if(src.charAt(i)==src.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
    public static String process(String src){
        String dummy=null;
        for(int i=0;i<=src.length()-2;i++){
            if(src.charAt(i)==src.charAt(i+1)){
                dummy = src.substring(0,i)+src.substring(i+2,src.length());
                break;
            }
        }
        return dummy;
    }
}
