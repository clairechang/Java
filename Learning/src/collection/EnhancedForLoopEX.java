package collection;
import java.util.*;
/**
 * 透過加強型迴圈印出容器
 * @author rockst
 *
 */
public class EnhancedForLoopEX {

	public static void main(String[] args) {
		Collection<String> colStr = new ArrayList<String>();
		colStr.add("Rock");
		colStr.add("Claire");
		colStr.add("Anne");
		
		for(String elm : colStr) {
			System.out.println(elm);
		}
		
		System.out.println(Arrays.toString(colStr.toArray()));
	}

}
