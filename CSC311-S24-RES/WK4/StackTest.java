import com.usman.csudh.csc311.datastructures.StackEmptyException;
import com.usman.csudh.csc311.datastructures.impl.ArrayStack;

public class StackTest {

	public static void main(String[] args) throws StackEmptyException {
		ArrayStack stack = new ArrayStack();	// Create a stack
		
		stack.push(10);
		stack.push(20);		
		stack.push(39);
		stack.push(40);
		
		//stack.clear();
		System.out.println(stack);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(stack);

	}

}
