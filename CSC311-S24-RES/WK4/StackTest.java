import com.usman.csudh.csc311.datastructures.StackEmptyException;
import com.usman.csudh.csc311.datastructures.impl.ArrayStack;
import com.usman.csudh.csc311.datastructures.impl.LinkedStack;
import com.usman.csudh.csc311.datastructures.Stack;
public class StackTest {

	public static void main(String[] args) throws StackEmptyException {
		Stack stack = new LinkedStack();
		
		stack.push(10);
		stack.push(20);		
		stack.push(39);
		stack.push(40);
		

		System.out.println(stack.pop());
		System.out.println(stack.pop());		
		System.out.println(stack.peek());
		System.out.println(stack.pop());		
        System.out.println(stack.pop());

	}

}
