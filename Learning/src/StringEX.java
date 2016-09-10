/**
 * String 字串的處理
 * @author rockst
 *
 */
public class StringEX {

	public static void main(java.lang.String[] args) {

		stringBufferEX();
	}
	
	public static void stringBufferEX()
	{
		StringBuffer a = new StringBuffer("rock");
		
		System.out.println(a.length()); // 長度
		System.out.println(a.capacity()); // 容量
		
		a.append("claire"); // 增加字串在最後
		
		System.out.println(a.toString());
		
		a.delete(0, 4); // 刪除字串
		System.out.println(a.toString());
		
		a.insert(0, "rockst"); // 增加字串
		System.out.println(a.toString());
	}
	
	public static void declare()
	{
		// String 宣告方式
		String a;
		a = new String("rock");
		
		String b = new String("claire");
		
		String c = "Qoo";
		
		System.out.println(a + b + c); // 字串的連接
	}
	
	public static void comstr()
	{
		String a = "rock";
		String b = "rock";
		
		if(a == b) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		
		// 使用 equals
		System.out.println(((a.equals(b)) ? "相等" : "不相"));
		
		// null a == null
		
		// 空字串 "".equals(a)
		
	}
	
	public static void othersstr() 
	{
		// 字串長度
		String a = "rock";
		System.out.println(a.length());
		
		// 小寫 toLowerCase()
		// 大寫 toUpperCase()
		
		// 擷取字串
		System.out.println(a.substring(0, 1));
		
		// 尋找 char , string indexOf(int ch) indexOf(String str)
		// 取代字串 replace('!', ',')
		String b = "中文";
		System.out.println(b.replace('中', '幹'));
		
		// String to int
		int m = 100, n = 20;
		System.out.println(m + n);
		
		String ms = String.valueOf(m);
		String ns = String.valueOf(n);
		
		System.out.println(ms + ns);
		
	}

}
