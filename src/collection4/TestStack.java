package collection4;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		// java 는 stack 을 class 로 만들어 놓았다
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");

		String st1 = stack.pop();
		String st2 = stack.pop();
		String st3 = stack.pop();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
	}

}
