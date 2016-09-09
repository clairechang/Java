package Object;

/**
 * Static 屬性、Static Method
 * @author rockst
 *
 */
public class Static {

	public static void main(String[] args) {
		
		StaticApp App1 = new StaticApp();
		StaticApp App2 = new StaticApp();
		
		App1.setAttClass(10);
		App1.setAttObject(20);
		
		System.out.println("App1 Class: " + App1.getAttClass());
		System.out.println("App1 Object: " + App1.getAttObject());
		
		App2.setAttClass(30); // attClass 為 static 表示 StaticApp 類別所共同擁有
		App2.setAttObject(40);
		
		System.out.println("App1 Class: " + App1.getAttClass());
		System.out.println("App1 Object: " + App1.getAttObject());
		
		// 使用 static method 的方法
		StaticApp.showAtt();
		
	}

}

class StaticApp {
	
	private static int attClass = 0; // static 表示共同擁有
	private int attObject = 0;
	
	public void setAttClass(int num) {
		attClass = num;
	}
	
	public int getAttClass() {
		return attClass;
	}
	
	public void setAttObject(int num) {
		this.attObject = num;
	}
	
	public int getAttObject() {
		return this.attObject;
	}
	
	// static method 只能存取 static 屬性
	public static void showAtt()
	{
		System.out.println(attClass);
		// System.out.println(attObject);
	}
}
