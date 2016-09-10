package Object;

/**
 * Extends 繼承
 * @author rockst
 *
 */

public class ExtendsEX {

	public static void main(String[] args) {
		Derive Obj = new Derive();
		System.out.println(Obj.getName());
		System.out.println(Obj.getAge());
		Obj.setName("AAA");
		System.out.println(Obj.getName());
		System.out.println(Obj.address);
		System.out.println(Obj.files);
	}

}

// 使用 final 可以限制此類別無法被繼承
class Base {
	
	public String name;
	public int age;
	private String address; // 不會被繼承喔
	public char files[] = new char[10];
	
	public Base() {
		this.name = "rock";
		this.age = 40;
		this.address = "taipei";
		System.out.println("i am super"); // 父類別建構子也會被呼叫
		this.files[0] = 'a';
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
}

// Derive 繼承 Base
class Derive extends Base {
	
	public String address;
	
	public Derive() {
		this.name = "claire";
		this.address = super.getAddress(); // 透過 super 取得父類別的方法
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return super.age + 1; // 透過 super 取得父類別的屬性
	}
	
}
