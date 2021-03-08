package stack;

import java.util.Stack;

public class UseStackHomeWork {

	public static void main(String[] args) {
		
		Stack<String> number = new Stack<String>();
		number.push("15");
		number.push("25");
		number.push("35");
		number.push("45");
		number.push("55");
		
		if(number.peek().equals("55")) {
			System.out.println(number.pop());
		}
		System.out.println(number.peek());
	

	}

}
