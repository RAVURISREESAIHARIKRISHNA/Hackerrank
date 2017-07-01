import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String raw = s.nextLine();
        raw = raw.trim();
        //int row = (int)Math.floor(Math.sqrt((double)raw.length()));
        int col = (int)Math.ceil(Math.sqrt((double)raw.length()));
        int row = col;
        char arr[][] = new char[row][col];
        char src[] = raw.toCharArray();
        int x = 0;
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=col-1;j++){
                if(x>src.length-1){
                    i = row;
                    break;
                }
                arr[i][j] = src[x++];
            }
        }
        for(int i=0;i<=col-1;i++){
            for(int j=0;j<=row-1;j++){
                if(arr[j][i] != '\u0000'){
                    System.out.print(arr[j][i]);
                }
            }
            System.out.print(" ");
        }
    }
}
