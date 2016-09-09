package Object;

import java.util.Arrays;

public class Passing {

	public static void main(String[] args) {

		ReferenceTest RT = new ReferenceTest();
		
		int a = 30;		
		System.out.println(a);
		RT.changeValue1(a); // pass by value
		System.out.println(a); // 不會改變值
		
		/**
		 * 傳 Array 和 Object 都是 pass by reference
		 */
		
		int b[] = {1, 2, 3};
		System.out.println(Arrays.toString(b));
		RT.changeValue2(b); // pass by reference
		System.out.println(Arrays.toString(b));
		
		EXObject EXO = new EXObject();
		System.out.println(EXO.name);
		RT.changeValue3(EXO); // pass by reference
		System.out.println(EXO.name);
		
	}

}

class EXObject {
	
	public String name = "rock";
	
}

class ReferenceTest {
	
	public void changeValue1(int a) { // pass by value
		
		a = 10;
		
	}
	
	public void changeValue2(int[] b) {
		
		b[0] = 4;
		
	}
	
	void changeValue3(EXObject c) {
		
		c.name = "claire";
		
	}
}
