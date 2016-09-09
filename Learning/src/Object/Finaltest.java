package Object;

/**
 * final 修飾詞用來限制變數的值和無法透過繼承修改
 * @author rockst
 *
 */
public class Finaltest {

	public static void main(String[] args) {
		
		FinalApp FA = new FinalApp();
		
		System.out.println(FA.age);
		
		// FA.age += 1; // 無法被修改
		
	}
}

class FinalApp {
	
	public final int age = 40;
	public static final String NAME = "rock"; // final + static 習慣上會使用大寫命名
	
	public void print(final int a) {
		
		// a += 1; // 表示 final 參數不能被修改
		System.out.println(a);
		
	}
	
	
}
