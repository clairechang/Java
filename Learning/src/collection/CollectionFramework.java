package collection;

import java.util.*;

/*
 * Java Collections Framework
 */

public class CollectionFramework {

	public static void main(String[] args) {
		
		// Generics Programming
		
		// 從容器取出元素後，便不需要轉型
		List<Integer> listInt = new LinkedList<Integer>();
		listInt.add(new Integer(3));
		Integer elm = listInt.iterator().next();
		System.out.println(elm);
		
		Collection<String> colStr1 = new ArrayList<String>();
		colStr1.add("rock");
		colStr1.add("claire");
		Collection<String> colStr2 = new LinkedList<String>();
		colStr2.add("rock");
		
		wildcard(listInt);
		wildcard(colStr1);
		wildcard(colStr2);
		
	}
	
	// 萬用型別 ?
	public static void wildcard(Collection<?> cl) {
		for(Object elm : cl) {
			System.out.println(elm);
		}
	}
}
