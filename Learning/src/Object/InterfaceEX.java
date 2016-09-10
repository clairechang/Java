package Object;
/**
 * Interface 介面
 * @author rockst
 *
 */
public class InterfaceEX {

	public static void main(String[] args) {
		CA Obj = new CA();
		Obj.showData();
		
		// 使用多個介面
		Cat Obj2 = new Cat();
		Obj2.moving();
		Obj2.walking();
	}

}

// 定義介面
interface IX // 修飾詞有 public 或無修飾詞(package)
{
	int num = 1; // 一律是 public static , final
	
	void showData(); // 修適詞都是 public , 不定義實作的內容
}

// 使用介面透過 implements

class CA implements IX
{
	public void showData() { // 要與介面相同的 method
		System.out.println("num = " + num);
	}
}

/**
 * 使用多個介面
 */
class Animal{}

interface Move
{
	void moving();
}

interface Walk
{
	default public void walking() { // 使用 default 可以實作介面方法的內容
		System.out.println("i am interface Walk method: walking");
	}
}


class Cat extends Animal implements Move,Walk // 使用多個介面用,隔開
{
	public void moving() {
		System.out.println("movie");
	}
	
	public void walking() {
		// System.out.println("walk");
	}
}