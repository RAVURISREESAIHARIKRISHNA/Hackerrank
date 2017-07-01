import java.util.Scanner;
import java.util.Arrays;

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                arr[i][j] = s.nextInt();
            }
        }
        //There are 8 Possibilities

        /*
        I created Many arrays intentionally just to increase number of lines ;)
        */
        int poss1[][] = 
        {
            {8,1,6},
            {3,5,7},
            {4,9,2}
        };
        int poss2[][] = 
        {
            {6,1,8},
            {7,5,3},
            {2,9,4}
        };
        int poss3[][] = 
        {
            {4,9,2},
            {3,5,7},
            {8,1,6}
        };
        int poss4[][] = 
        {
            {2,9,4},
            {7,5,3},
            {6,1,8}
        };
        int poss5[][] = 
        {
            {8,3,4},
            {1,5,9},
            {6,7,2}
        };
        int poss6[][] = 
        {
            {4,3,8},
            {9,5,1},
            {2,7,6}
        };
        int poss7[][] = 
        {
            {6,7,2},
            {1,5,9},
            {8,3,4}
        };
        int poss8[][] = 
        {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };
        int diff[] = new int[8];
        int k=0;
        int sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss1[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss2[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss3[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss4[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss5[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss6[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss7[i][j]));
            }
        }
        diff[k++] = sum;
        sum = 0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                sum += Math.abs((arr[i][j] - poss8[i][j]));
            }
        }
        diff[k++] = sum;
        Arrays.sort(diff);
        System.out.println(diff[0]);
    }
}
