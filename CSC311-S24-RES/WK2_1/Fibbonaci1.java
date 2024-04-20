
public class Fibbonaci1 {
	
	static long[] fibnumbers;
	
	public static void main(String[] args) {
		int n=50; // number of terms
		fibnumbers=new long[n+1];
		
		System.out.println(fibseq(n));
		
	}
	
	private static long fibseq(int n) {
		if (n <= 1) {
			return n;
		}
		if (fibnumbers[n] != 0) {
			return fibnumbers[n];
		}
		
		long nthFibNumber=fibseq(n-1)+fibseq(n-2);
		fibnumbers[n]=nthFibNumber;
		return nthFibNumber;
	}
}
