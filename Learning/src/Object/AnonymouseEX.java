package Object;
/**
 * 匿名內部物件
 * @author rockst
 *
 */
public class AnonymouseEX {

	public static void main(String[] args) {
		OuterClass2 OC = new OuterClass2();
		OC.IC.show();
	}

}

class OuterClass2 {
	
	private int a = 10;
	
	class InnerClass {
		int b;
		InnerClass() { // 建構子
			b = OuterClass2.this.a + 1;
		}
		void show(){}
	}
	
	InnerClass IC = new InnerClass() { // 這段以下的定義：產生一個匿名的物件，並繼承於 InnerClass
		void show() { // 繼承了 InnerClass.show()
			System.out.println(this.b);
		}
	}; // 這邊要加分號喔
	
}
