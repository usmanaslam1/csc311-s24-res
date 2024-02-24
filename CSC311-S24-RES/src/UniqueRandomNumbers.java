import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class UniqueRandomNumbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        // Fill the set with 1000 unique random numbers
        while (numbers.size() < 1000) {
            int randomNumber = random.nextInt(5000); // Adjust the range as needed
            numbers.add(randomNumber);
        }

        // Convert the set to an array
        Integer[] uniqueNumbers = numbers.toArray(new Integer[0]);
        Arrays.sort(uniqueNumbers);
        // Output the array (optional, for verification)
        String s1="int[] randomNumers={";
        for (int number : uniqueNumbers) {
            s1+=","+number;
        }
        
        s1+="};";
        
        System.out.println(s1);
        
    }
}
