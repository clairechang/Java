package Object;
/**
 * 建構子
 * @author rockst
 *
 */
public class ContructorEX {

	public static void main(String[] args) {

		TestContructorEX Obj1 = new TestContructorEX(123);
		System.out.println(Obj1.a);
		
		TestContructorEX Obj2 = new TestContructorEX('b');
		System.out.println(Obj2.b);
		
	}

}

class  TestContructorEX {

	public int a;
	public char b;
	
	// 建構子 1
	public TestContructorEX(int a) { // 視傳入的參數而定選擇那一個建構子
		
		this.a = a;
		
	}
	
	// 建構子 2
	public TestContructorEX(char b) {
		this.b = b;
	}
	
}
