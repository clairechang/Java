package lambda;

class ClassA {
	 
}

public class AnonymousClassEX {

	public static void main(String[] args) {

		ClassA a = new ClassA() { // 實體化匿名類別
			
		    public void function1(int x, int y) {
				System.out.println(x + y);
		    }
	 
		    public int function2(int x) {
				return x + 1;
		    }
		};
		
	}

}
