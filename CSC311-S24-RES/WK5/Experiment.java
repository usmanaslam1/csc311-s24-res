
public class Experiment {
	public static void main(String[] args) {
		BubbleSortAlgo bubbleSortAlgo = new BubbleSortAlgo();
		
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSortAlgo.bubbleSort(arr);
		System.out.println("Sorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nLoop counter: " + bubbleSortAlgo.loopCounter);
	}

}
