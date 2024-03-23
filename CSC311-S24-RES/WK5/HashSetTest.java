import com.usman.csudh.csc311.adt.Set;
import com.usman.csudh.csc311.adt.SetItemNotFoundException;
import com.usman.csudh.csc311.adt.impl.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set s=new HashSet();
		
		
		s.add(10);
	    s.add(20);	
	    s.add(30);
	    s.add(40);
	    s.add(10);
	    s.add(50);
	    s.add(50);
	   
	    System.out.println(s);
		
	}

}
