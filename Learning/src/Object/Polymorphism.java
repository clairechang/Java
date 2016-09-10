package Object;

/**
 * 多型：因訊息資料的不同而有不同的處理方法
 * @author rockst
 *
 */
public class Polymorphism {
	
	public static void main(String[] args) {
		
		Clothes Obj1 = new Clothes();
		Person.wear(Obj1);
		
		Pants Obj2 = new Pants();
		Person.wear(Obj2);
	}

}

class Person
{
	// 以下兩個 method 名稱一樣，但是因為傳入的參數資料不同，所執行的方法也不同
	
	public static void wear(Clothes a_clothes) {
		System.out.println("i got a clothes");
	}
	
	public static void wear(Pants a_pants) {
		System.out.println("i got a pants");
	}
	
}

class Clothes {}
class Pants {}
