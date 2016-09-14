package RTTI;
/**
 * RTTI (run-time type identification)
 * 取得物件的方法
 * @author rockst
 *
 */
class Mouse { }

public class ClassEX {

	public static void main(String args[]){

		try{
			System.out.println("使用 Class.forname() 靜態方法去得");
			Class<?> c1 = Class.forName("RTTI.Mouse");
			System.out.println(c1.toString());
			System.out.println();

			System.out.println("使用類別字面常數(class literal) .class");
			Class<Mouse> c2 = Mouse.class;
			System.out.println(c2.toString());
			System.out.println();

			System.out.println("透過物件的 getClass()");
			Mouse m = new Mouse();
			Class<? extends Mouse> c3 = m.getClass();
			System.out.println(c3.toString());
		}
		catch(ClassNotFoundException e){
			System.out.println("Cant found class");
		}
	}
} 


