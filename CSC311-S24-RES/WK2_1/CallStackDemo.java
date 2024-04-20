
public class CallStackDemo {
	public static void main(String[] args) {
		printNumbers();
		System.out.println("main complete");
	}
	
	private static void printNumbers() {
		
		printNumbers2();
		System.out.println("printNumbers complete");
	}

	private static void printNumbers2() {
		printNumbers3();
		System.out.println("printNumbers2 complete");
		
	}

	private static void printNumbers3() {
		
		int x=100/0;
		int n = 100;
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}

		System.out.println("Sum of 1 to " + n + " is " + sum);

		
	}

}
