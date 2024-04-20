
public class Fibbonaci1 {

	public static void main(String[] args) {
		int n=93; // number of terms
		long[] fibsequence=new long[n];
		fibsequence[0]=0;
		fibsequence[1]=1;
		
		for (int i = 2; i < n; i++) {
			fibsequence[i] = fibsequence[i - 1] + fibsequence[i - 2];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(fibsequence[i] + " ");
		}
		
		
		
		
		
	}
}
