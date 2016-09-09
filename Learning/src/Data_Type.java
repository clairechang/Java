/**
 * 資料的型別
 * @author rockst
 *
 */
public class Data_Type {

	public static void main(String[] args) {
		
		dt_int();
		dt_double();
		dt_char();
		dt_boolean();
		dt_final();
		
		dt_switch();
		
	}
	
	// 整數
	private static void dt_int() {
		
		byte bVar = 127; // 8 bits
		short shVar = 32767; // 16 bits 短整數
		int iVar = 111111; // 32 bits 整數
		long lVar1 = 123456; // 64 bits 長整數
		long lVar2 = 123456L; // 指定為長整數值
		long lVar3 = 0x0a8c; // 16進位
		System.out.println(bVar + "\n" + shVar + "\n" + iVar + "\n" + 
							lVar1 + "\n" + lVar2 + "\n" + lVar3);
	}
	
	// 浮點數	
	private static void dt_double() {
	
		float fVar = 1.22f; // 32 bits 浮點數
		double dVar = 1.22; // 64 bits 倍精準浮點數
		System.out.println(fVar + "\n" + dVar);
		
	}
	
	// 字元和字串
	private static void dt_char() {
		
		char cVar = 'a'; // 16 bites (Unicode) 使用單引號
		System.out.println(cVar);
		
	}
	
	// boolean
	private static void dt_boolean() {
		
		boolean bVar1 = true;
		boolean bVar2 = false;
		System.out.println(bVar1);
		System.out.println(bVar2);
		
	}
	
	// final 自訂常數
	private static void dt_final() {
		
		final double PI = 3.14; // 永遠固定的值
		
		System.out.println(PI);
		
	}
	
	// 型別轉換
	private static void dt_switch() {
		
		int a = 1;
		double b = 1.5;
		
		// 記憶體小先轉為記憶體大再運算
		// a = 1.0 + 1.5
		System.out.println(a + b);
		
		// 強制轉換
		int c = 2;
		System.out.println((double) (a + c));
		
		// String to Int
		String d = "1";
		System.out.println(Integer.parseInt(d));
		System.out.println(Double.parseDouble(d));
		
		// String to boolean
		String e = "true";
		System.out.println(Boolean.valueOf(e));
		
	}

}
