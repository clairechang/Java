package IO;
import java.io.*;

/**
 * 使用字元串流可以用來處理中文的問題
 * @author rockst
 *
 */
public class CharArray {

	public static void main(String[] args) throws Exception {

		String source = "殘體中文不要來！";
		CharArrayWriter caw = null;
		CharArrayReader car = null;
		
		try {
			
			caw = new CharArrayWriter();
			for(int i = 0; i < source.length(); i++)
			{
				caw.write(source.charAt(i));
			}
			
			System.out.println(caw.toString());
			
			char charAry[] = caw.toCharArray();
			
			car = new CharArrayReader(charAry);
			
			int ch;
			
			
			while( (ch = car.read()) != -1) {
				System.out.print((char) ch + "\\");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(caw != null) caw.close();
			if(car != null) car.close();
		}
	}
}
