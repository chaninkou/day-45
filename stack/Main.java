package stack;

public class Main {
	public static void main(String[] args) {
		StackWithFixedSize stack = new StackWithFixedSize(5);
		
		stack.push(2);
		stack.push(3);
		
		stack.show();
		
		stack.pop();
		stack.pop();
		
		stack.show();
		
		System.out.println(stack.peek());
		
	}
}