package Object;

public class Return {

	public static void main(String[] args) {
		
		int a = 1;
		
		App APP = new App();
		
		System.out.println(a + " " + APP.m2(a));

	}

}

class App {
	
	public void m1() { // void 不回傳
		
	}
	
	public int m2(int a) { // int 回傳整數

		a = 9;
		
		return a;
		
	}
	
	public int[] m3() { // 回傳 array by reference
		
		int[] a = {1, 2, 3};
		
		return a;
		
	}
	
	public Obj m4() { // 回傳 object by reference
		
		Obj O = new Obj();
		
		return O;
		
	}
	
}

class Obj {
	
}
