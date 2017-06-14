import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String signal;
        signal = s.nextLine();
        int signals = signal.length()/3;
        int changes = 0;
        for(int i=0;i<=signal.length()-1;i+=3){
                if(signal.charAt(i)!='S'){
                    changes++;
                }
                if(signal.charAt(i+1)!='O'){
                    changes++;
                }
                if(signal.charAt(i+2)!='S'){
                    changes++;
                }
        }
            System.out.println(changes);
    }
}
