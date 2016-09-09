/**
 * 運算子
 * @author rockst
 *
 */
public class Arith {

	public static void main(String[] args) {
		
		// 算術
		int a = 4;
		int b = 2;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		// 比較
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		// 邏輯
		boolean c = true;
		boolean d = true;
		System.out.println((c && d));
		System.out.println((c || d));
		
		// 否定
		System.out.println(!(c && d));
		
		// 遞增、遞減
		a++;
		System.out.println(a);
		System.out.println(++a);
		
	}

}
