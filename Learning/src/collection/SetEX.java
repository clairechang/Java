package collection;
import java.util.*;

/**
 * Set 容器不能包含重覆元素的
 * 適合 2 個容器的集合運算
 * 
 * s1.contains(s2) : 子集合 Subset, 判斷 s1 是否包含 s2, s2 是 s1 的 subset
 * 
 * s1.addAll(s2) : 聯集 union, 將 s2 加入 s1
 * 
 * s1.retainAll(s2) : 交集 intersection, 移除 s1 中不包含 s2 的元素
 *  
 * s1.removeAll(s2) : 差集 set difference, 移除 s1 包含 s2 的元素 
 * 
 * @author rockst
 *
 */
public class SetEX {

	public static void main(String[] args) {
		
		String[] name = {"Bill", "Mary", "Bill", "Joe", "John", "Julian"};
		
		HashSet<String> hsName = new HashSet<String>();
		
		for(String elm : name) hsName.add(elm);
		System.out.println(Arrays.toString(name));
		
		// HashSet 不能包含重覆的元素
		System.out.println("hsName: " + Arrays.toString(hsName.toArray()));
		
		TreeSet<String> tsName = new TreeSet<String>();
		tsName.add("Angela");
		tsName.add("Lisa");
		tsName.add("Mary");
		tsName.add("Joe");
		tsName.add("Julian");
		tsName.add("Tom");

		System.out.println("tsName: " + Arrays.toString(tsName.toArray()));
		
		// subset
		TreeSet<String> subset = new TreeSet<String>(tsName);
		subset.containsAll(hsName);
		System.out.println("子集合：" + Arrays.toString(subset.toArray()));
		
		// union
		TreeSet<String> union = new TreeSet<String>(tsName);
		union.addAll(hsName);
		System.out.println("聯集：" + Arrays.toString(union.toArray()));
		
		// intersection
		TreeSet<String> intersection = new TreeSet<String>(tsName);
		intersection.retainAll(hsName);
		System.out.println("交集：" + Arrays.toString(intersection.toArray()));
		
		// difference
		TreeSet<String> difference = new TreeSet<String>(tsName);
		difference.removeAll(hsName);
		System.out.println("差集：" + Arrays.toString(difference.toArray()));
		
	}

}
