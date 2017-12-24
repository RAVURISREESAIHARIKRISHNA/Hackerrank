import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for(int i=0;i<=n-1;i++){
            String src = s.nextLine();
            System.out.println(palindromeIndex(src));
        }
    }

    public static int palindromeIndex(String s){
    	for(int i =0,j =s.length()-1; i<j; i++, j--)
    		if(s.charAt(i)!=s.charAt(j))
    			if(isPalindrome(s, i))
    				return i;
    			else if(isPalindrome(s, j))
    					return j;
    	return -1;
    }
    public  static boolean isPalindrome(String s, int index){
		for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
    		if(s.charAt(i)!=s.charAt(j))
    			return false;
		return true;
	}
}
