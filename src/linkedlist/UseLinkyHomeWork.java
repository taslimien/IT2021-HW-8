package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkyHomeWork {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("Mohmmad");
		name.add("Kobir");
		name.add("Munnib");
		name.add("Sam");
		name.add("Abdullah");
		
		name.addFirst("Alamin");
		name.addLast("Karim");
		
		name.remove(4);
		
		
		Iterator it = name.listIterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
