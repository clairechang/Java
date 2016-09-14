package collection;
import java.util.*;

/**
 * List 容器：LinkedList
 * 適合將元素插入中間位置，效率會不好
 * 不適合隨機存取元素
 * @author rockst
 *
 */
public class LinkedListEX {

	public static void main(String[] args) {
		
		LinkedList<String> llStr = new LinkedList<String>();
		
		llStr.add("Rock");
		llStr.add("Book");
		llStr.add("Cat");
		llStr.add("Egg");
		llStr.add("Father");
		
		System.out.println(Arrays.toString(llStr.toArray()));
		
		System.out.println("First: " + llStr.getFirst()); // 第一個
		System.out.println("Last: " + llStr.getLast()); // 最後一個
		System.out.println(llStr.get(1)); // 取得第 0 + 1 個
		System.out.println(llStr.indexOf("Egg")); // Egg 是在第幾個元素
		
		ArrayList<String> alStr = new ArrayList<String>();
		
		alStr.add("array1");
		alStr.add("array2");
		
		llStr.addAll(2, alStr); // 將 alStr 容器全部插入到 llStr 中的第 2 + 1 個位置
		System.out.println(Arrays.toString(llStr.toArray()));
		
		llStr.removeFirst(); // 移除第一個
		llStr.removeLast(); // 移除最後一個
		System.out.println(Arrays.toString(llStr.toArray()));
		
	}

}
