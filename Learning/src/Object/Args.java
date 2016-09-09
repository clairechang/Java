package Object;

import java.util.Arrays;

/**
 * 不定個數參數使用 ...
 * @author rockst
 *
 */
public class Args {

	public static void main(String[] args) {
		
		printArgs PA = new printArgs();
		
		PA.print("hello", 1);
		PA.print("hello", 1, 2, 3); // 不定個數參數使用

	}

}

class printArgs
{
	public void print(String a, int...b) { // 不定個數參數使用 ...
		
		System.out.println(a + ":" + Arrays.toString(b));
		
	}
}