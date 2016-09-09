package Object;

import IO.Printer;

/**
 * 物件的練習
 * @author rockst
 *
 */
public class MyObject { // 定義一個類別
	
	public String name = "rock"; // public 所有類別屬性都可以使用
	private int age = 40; // 同一類別 MyObject 才可以使用
	protected String address = "Taipei"; // 同一類別、同一package才可以使用
	char gender = 'M'; // 沒有設定就是 package 

	// 使用 public method 來取得 private 的資料
	public int get_age() {
		return this.age;
	}
	
	public String get_address() {
		return this.address;
	}

}

class TestObject {
	
	public static void main(String[] args) {
		
		MyObject Obj = new MyObject();
		
		System.out.println(Obj.name);
		// System.out.println(Obj.age); // private 無法被使用
		System.out.println(Obj.get_age());
		Obj.address = "台北";
		System.out.println(Obj.address);
		System.out.println(Obj.get_address());
		
		// Object Array
		// MyObject ObjAry[] = new MyObject[5];
		
		Printer P = new Printer();
		System.out.println(P.serial_number);
		
	}
}
