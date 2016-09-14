package collection;
import java.util.*;


/**
 * Map keys values 配對關係
 * 
 * HashMap 較 TreeMap 的 put, get 快，但 TreeMap 使用 Iteration 較快
 * @author rockst
 *
 */
public class MapEX {

	public static void main(String[] args) {
		
		String name[] = {"Bill", "Mary", "Joe", "John"};
		
		HashMap<Integer, String> hmStr = new HashMap<Integer,String>();
		
		for(int i = 0; i < name.length; i++)
			hmStr.put((i + 1), name[i]); // 放入容器
		
		System.out.println(hmStr);
		
		hmStr.put((hmStr.size() + 1), "Julian"); // 取得位置
		hmStr.put((hmStr.size() + 1), "Julian");
		
		System.out.println(hmStr);
		
		// 使用加強型迴圈取得 Map 容器裡的元素
		Set<Map.Entry<Integer, String>> stEntry = hmStr.entrySet();
		for(Map.Entry<Integer, String> elm : stEntry)
			System.out.println("key=" + elm.getKey() + " value=" + elm.getValue());
		
		// 取得 Key 的 Set
		Set<Integer> stKey = hmStr.keySet();
		for(Integer elm : stKey)
			System.out.println("key=" + elm + " value=" + hmStr.get(elm));
		
		// 判斷是否有 Key = 3
		if(hmStr.containsKey(3)) System.out.println("有 Key = 3");
		
		// 判斷是否有 Value = Joe
		if(hmStr.containsValue("Joe")) System.out.println("有 Value = Joe");
		
		System.out.println(hmStr.size());
		
		HashMap<Integer,String> hmStr2 = new HashMap<Integer,String>();
		
		hmStr2.putAll(hmStr); // 放入所有元素
		System.out.println(hmStr2);
		
		Object cloneStr = hmStr.clone();
		System.out.println(cloneStr);
		
	}

}
