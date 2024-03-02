import com.usman.csc311.lists.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add(9);
		list.add(13);
		
		System.out.println(list);
		list.insert(7, 2);
		
		System.out.println(list);
		
		list.put(59, 2);
		System.out.println(list);
		
		list.delete(1);
		System.out.println(list);
		
		
		
	}
}
