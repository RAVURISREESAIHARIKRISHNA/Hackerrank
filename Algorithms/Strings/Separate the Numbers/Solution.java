import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String raw;
        for(int item = 0;item<=n-1;item++){
            raw = s.nextLine();
            long start_answer_print = 0 ;
            boolean ans = false;
            for(int width=1;width<=(raw.length())/2;width++){
                int start = 0;
                int len = width;
                boolean flag = true;
                while(len < raw.length()){
                    long a =  Long.parseLong(  raw.substring(start , len)  );
                    if(start==0) start_answer_print = a;
                    start = len; 
                    len = len + new String(Long.valueOf(a+1).toString()).length();
                    if(len>raw.length()) {
                    	flag = false;
                    	
                        break;
                    }
                    long b = Long.parseLong(   raw.substring(start, len)   );
                    if(b-a != 1){
                        flag = false;
                        break;
                    }
                }
                if(flag){   //FOUND
                    ans = true;
                    break;
                }
            }

            if(ans){
                System.out.println("YES "+start_answer_print);
            }else{
                System.out.println("NO");
            }
            
        }
    
    }   //END of main()
}
