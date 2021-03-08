package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHomeWork {

	public static void main(String[] args) {
		Queue<String> line = new LinkedList<String>();
		line.add("Jackson");
		line.add("Anderson");
		line.add("Samual");
		line.add("Peter");
		line.add("Elezabeth");
		
		System.out.println(line.element());
		System.out.println(line);
		
		

	}

}
