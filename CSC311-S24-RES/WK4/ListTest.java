import com.usman.csudh.csc311.adt.impl.ArrayList;

public class ListTest {

	public static void main(String[] args) throws Exception{
		
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);        
        
        System.out.println(list);
        list.insert(101,1);
        System.out.println(list);
        list.remove(2);
        
        System.out.println(list);
  

	}
}
