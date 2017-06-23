import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String data;
        data = s.nextLine();
        int count = 0;
        for(int i=0;i<=data.length()-3;i++){
            if(data.substring(i,i+3).equals("010")){
                data = data.substring(0,i+2)+"1"+data.substring(i+3,(data.length()));
                //System.out.println(data);
                count++;
            }
        }
        System.out.println(count);
    }
}
