package Object;
/**
 * Abstract 抽象類別
 * @author rockst
 *
 */
public class AbstractEX {

	public static void main(String[] args) {
		AbstractChild Obj = new AbstractChild();
		Obj.setName("Claire");
		System.out.println(Obj.getName());
	}

}

// 抽象類別沒有方法
abstract class AbstractBase {
	
	public String name = "rock";
	
	abstract void setName(String name);
	abstract String getName();
	
}

// 繼承的子類別的方法要與父類別一致
class AbstractChild extends AbstractBase {
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
}
