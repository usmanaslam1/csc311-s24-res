import com.usman.csudh.csc311.datastructures.QueueEmptyException;
import com.usman.csudh.csc311.datastructures.impl.ArrayQueue;

public class QueueTest {

	public static void main(String[] args) throws QueueEmptyException {
		ArrayQueue q = new ArrayQueue();
		
        q.add(10);
        q.add(20);
        q.add(30);
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
	}

}
