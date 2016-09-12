/**
 * Exception 例外處理
 * @author rockst
 *
 */
public class ExceptionEX {

	public static void main(String[] args) {
		
		throwNewException();
		
		try {
			throwNEFM();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			// try-catch 後一定會執行，通常用於資料庫關閉
		}

	}
	
	// throw new Exception
	public static void throwNewException() {
		
		int a = 10, b = 0, c;
		
		try {
			
			// 丟出例外
			if( b == 0) throw new Exception("0 無法被除");
			
			c = a / b;
			
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println(e.toString()); // 輸出 Exception
		}
		
	}
	
	// throw New Exception from method
	public static void throwNEFM() throws Exception {
		
		throw new Exception("I am Exception`s message");
		
	}

}
