package EX;
import java.util.*;

/**
 * 搜尋陣列中的某個值
 * @author rockst
 *
 */
public class bSearchEX {

	public static void main(String args[]) {

		int [] aryInt = {7, 6, 4, 9, 3};
		int position=0, num=0;

		System.out.println("aryInt 前: " 
					+ Arrays.toString(aryInt));

		// Arrays.sort(aryInt); // Sort

		System.out.println("aryInt 後: " 
					+ Arrays.toString(aryInt));

		System.out.println();

		// 產生亂數 0 - 9
		while(true){
			num = (int)(Math.random()*10);
			num = 6;

			position = Arrays.binarySearch(aryInt, num);

			if(position >= 0){
				System.out.println(num + "是 Array 第" + (position+1) + "個元素");
				break;
			}
		}
	}
}