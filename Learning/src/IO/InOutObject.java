package IO;

import java.io.*;

/**
 * in: 型別為 InputStream
 * 從命令列提示字元讀取自元
 * @author rockst
 *
 */
public class InOutObject {

	public static void main(String[] args) throws Exception {
		
		inStringDemo();
		
	}
	
	// 從終端機讀取字元
	public static void inDemo() throws Exception {
		
		System.out.print("input:");
		
		char c = (char)System.in.read(); // 從終端機讀取字元
		
		System.out.print(c); // 從終端機輸出字元
	}
	
	// 從終端機讀取字串
	public static void inStringDemo() throws IOException {
		
		InputStreamReader in = null;
		BufferedReader br = null;
		
		try {
		
			System.out.print("input:");
			
			// 使用 System.in 建立 BufferedReader 物件
			in = new InputStreamReader(System.in);
			br = new BufferedReader(in);
		
			// 由鍵盤輸入一字串
			String s = br.readLine();
		
			System.out.println(s);
			
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			if(in != null) in.close();
			if(br != null) br.close();
		}
	}

}
