
public class Recursion1 {

	public static void main(String[] args) {
		printHello(100);

	}
	
	private static void printHello(int n) {
		System.out.println("hello world!! :"+n);
		if(n<1)return;
		printHello(n-1);
		
	}

}
