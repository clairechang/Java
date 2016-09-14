package collection;
import java.util.*;

/**
 * List 容器 ArrayList
 * 適合隨機存取元素
 * 不適合將元素插入中間位置，效率會不好
 * @author rockst
 *
 */

public class ArrayListEX {

	public static void main(String[] args) {
		
		ArrayList<String> alStr = new ArrayList<String>();
		
		alStr.add("Rock");
		alStr.add("Claire");
		alStr.add("Coco");
		
		System.out.println(Arrays.toString(alStr.toArray()));
		
		// 適合隨機存取元素
		System.out.println(alStr.get(2)); // 取得第 2 + 1 個元素內容
		
		// 不適合將元素插入中間位置，效率會不好
		alStr.add(1, "rooo"); // 從第 1 個位置插入
		System.out.println(Arrays.toString(alStr.toArray()));
		
		System.out.println("Rock 物件在第 " + (alStr.indexOf("Rock") + 1) + " 個位置");
		
	}

}
