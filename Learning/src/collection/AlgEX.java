package collection;
import java.util.*;

/**
 * 物件演算法
 * 使用 Collections 類別靜態方法，大部份運用 List 容器
 * Collections.sort()
 * Collections.shuffle()
 * Collections.reverse()
 * Collections.max()
 * Collections.min()
 * Collections.copy()
 * Collections.fill()
 * @author rockst
 *
 */
public class AlgEX {

	public static void main(String[] args) {
		
		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("AAA");
		alStr.add("CCC");
		alStr.add("DDD");
		alStr.add("BBB");
		
		// sort
		System.out.println(Arrays.toString(alStr.toArray()));
		Collections.sort(alStr);
		System.out.println(Arrays.toString(alStr.toArray()));
		
		// shuffle
		Collections.shuffle(alStr);
		System.out.println(Arrays.toString(alStr.toArray()));
		
		// reverse
		Collections.reverse(alStr);
		System.out.println(Arrays.toString(alStr.toArray()));
		
		// Max and Min
		System.out.println(Collections.max(alStr) + " " + Collections.min(alStr));
		
		// Copy
		ArrayList<String> alStr2 = new ArrayList<String>();
		for(String elm : alStr) alStr2.add(elm);
		
		Collections.copy(alStr2, alStr);
		System.out.println(Arrays.toString(alStr2.toArray()));
		
		// fill
		Collections.fill(alStr, "Ken");
		System.out.println(Arrays.toString(alStr.toArray()));
		
	}

}
