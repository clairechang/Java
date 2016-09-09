
public class Process {

	public static void main(String... args) { // 使用 ... 表示不確定個數
		
		System.out.println(args[0]); // 可從命令列傳入參數
		System.out.println(args[1]); // 可從命令列傳入參數
		System.out.println(args[2]); // 可從命令列傳入參數
		
		// if .. else
		int a = 1, b = 2, c;
		
		if( a < b) {
			c = a + b;
		} else if( a == b) {
			c = a * b;
		} else {
			c = a - b;
		}
		System.out.println(c);
		
		// Switch
		switch(b - a) 
		{
			case 1:
				c = 1;
				break;
			case 2:
				c = 2;
				break;
			default:
				c = 0;
				break;
		}
		System.out.println(c);
		
		// for loop
		// break; 跳出 forloop
		// continue; 跳出某次 forloop
		int d = 0;
		
		for(c = 0; c <= 3; c++) {
			if((c % 2) != 0) {
				d += c;
			}
		}
		System.out.println("d = " + d);
	
		// while
		// 最大公因數 GCD
		int e = 4, f = 2, temp;
		while(f != 0) {
			temp = e % f;
			e = f;
			f = temp;
		}
		System.out.println("GCD: " + e);
		
		// do ... while
		/*
		do() {
			
		} while() {
			
		}
		*/
		
		// 條件運算子
		int g = 4, h = 4;
		System.out.println(((g == h) ? true : false));
		
	}

}
