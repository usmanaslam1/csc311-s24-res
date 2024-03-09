import com.usman.csc311.lists.arraybased.List;

public class ListTest {

	public static void main(String[] args) throws Exception{
		
		
		List list = new List();
		list.add(10);
		list.add(20);
		list.add(30);
        list.put(1, 2);
        list.add(101);
        list.put(3, 3);
        
        
        System.out.println(list);
        System.out.println(list.size());
        list.delete(1);
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());


	}
}
