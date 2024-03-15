import com.usman.csudh.csc311.datastructures.QueueEmptyException;
import com.usman.csudh.csc311.datastructures.Queue;

import com.usman.csudh.csc311.datastructures.impl.LinkedQueue;

public class QueueTest {

	public static void main(String[] args) throws QueueEmptyException {
		Queue q = new LinkedQueue();
		
        q.add(10);
        q.add(20);
        q.add(30);
        
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
	}

}
