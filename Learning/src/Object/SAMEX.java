package Object;
/**
 * 使用 SAM 介面與預設方法
 * @author rockst
 *
 */
public class SAMEX {

	public static void main(String[] args) {
		CA2 Obj = new CA2();
		Obj.showData();
	}

}

@FunctionalInterface // 標住 SAM 介面
interface SAM
{
	int num = 1;
	default public void showData() // 使用 default 預設方法就要實作下面的內容
	{
		System.out.println("num = " + num);
	}
	
	public void abstractMethod();
}

class CA2 implements SAM
{
	public void abstractMethod() {
		
	}
}
