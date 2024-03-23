import com.usman.csudh.csc311.adt.Stack;
import com.usman.csudh.csc311.adt.StackEmptyException;
import com.usman.csudh.csc311.adt.impl.ArrayStack;
import com.usman.csudh.csc311.adt.impl.LinkedStack;
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
