import java.util.Scanner;

public class Solution {
	public static int clouds[];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int energy = 100;
		clouds = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			clouds[i] = s.nextInt();
		}
		
		int dummy[];
		int presentCloud = 0;
		dummy = getCloud(presentCloud , k , n , energy);
		presentCloud = dummy[0];
		energy = dummy[1];
		while(presentCloud !=0) {
			dummy =	getCloud(presentCloud , k , n , energy);
			presentCloud = dummy[0];
			energy = dummy[1];
		}
		System.out.println(energy);
	}

	public static int[] getCloud(int i, int k, int n, int energy) {
		int a[] = new int[2];
		
		
		a[1] = (energy -(clouds[i]==1?2:0) -1);

		a[0] = (i + k) % n;
		return a;
	}
}
