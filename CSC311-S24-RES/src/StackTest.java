import com.usman.csc311.lists.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(89);
		stack.push(23);
		stack.push(78);
		stack.push(123);
		stack.push(23);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());

		
		

	}

}
