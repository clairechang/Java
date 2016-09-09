package Object;

/**
 * Inner Class 內部 Class
 * @author rockst
 *
 */

public class InnerClassEX {

	public static void main(String[] args) {
		
		OuterClass OC = new OuterClass();
		OC.show(); // call 外部 Class
		OC.IC.show(); // call 內部 Class

	}

}

// 外部 Class
class OuterClass {
	
	public int a = 123;
	public InnerClass IC = new InnerClass(); // 宣告內部Class: IC
	
	// 內部 Class
	class InnerClass {
		
		public int b = OuterClass.this.a + 1; // 使用外部 Class 的屬性 a
		
		public void show() {
			System.out.println(this.b);
			System.out.println(OuterClass.this.a);
		}
		
	}
	

	public void show() {
		
		System.out.println(this.a);
		System.out.println(this.IC.b); // 使用內部 Class 的屬性 b
		
	}
	
	
}
