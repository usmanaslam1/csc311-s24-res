public class BinarySearchR {



    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, high); // Search right half
            } else {
                return binarySearchRecursive(arr, target, low, mid - 1); // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int result = binarySearchRecursive(arr, target,0,arr.length-1);
        
        
     }
}
