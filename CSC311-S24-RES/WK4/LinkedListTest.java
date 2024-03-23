
import com.usman.csudh.csc311.adt.List;
import com.usman.csudh.csc311.adt.impl.ArrayList;
import com.usman.csudh.csc311.adt.impl.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) throws Exception{
	

		List myList=new LinkedList();
		
		myList.add(new int[]{1,2,3,4,5});
		
		myList.remove(4);

		
	    System.out.println(myList);
	    
	}

}
