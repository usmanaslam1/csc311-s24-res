import com.usman.csc311.lists.arraybased.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();	// Create a stack
		
		stack.push(10);
		stack.push(20);		
		stack.push(39);
		
		stack.clear();
		System.out.println(stack);

	}

}
