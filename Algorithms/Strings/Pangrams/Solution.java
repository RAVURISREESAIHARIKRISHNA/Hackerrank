import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String data;
        boolean a[] = new boolean[27];
        data = s.nextLine();
        data = data.toLowerCase();
        for(int i=0;i<=data.length()-1;i++){
            if(data.charAt(i)>='a'&&data.charAt(i)<='z'){
                a[((int)data.charAt(i))-96]=true;
            }
        }
        boolean all = true;
        for(int i=1;i<=26;i++){
            if(!a[i]){
                all = false;
                break;
            }
        }
        if(all){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}
