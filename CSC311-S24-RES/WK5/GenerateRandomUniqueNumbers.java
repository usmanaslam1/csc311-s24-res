import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;

public class GenerateRandomUniqueNumbers {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int n = arr.length;
		int i = 0;
		
		int totalDataSets=50;
		
		for(int x=0;x<totalDataSets;x++) {
			
			Set<Integer> set = new HashSet<Integer>();
			
			while (set.size() <=1000*x+1) {
				int random = (int) (Math.random() * 10000000);
		        set.add(random);		
		      }

			writeToFile("/Users/usman/datasets/random"+x+".txt", set);

		}
	}

	private static void writeToFile(String fileName, Set<Integer> set) {
		File f=new File(fileName);
		
		try {
			if(!f.exists())
				f.createNewFile();
			FileWriter fw=new FileWriter(f);
			for (Integer i : set) {
				fw.write(i + "\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
