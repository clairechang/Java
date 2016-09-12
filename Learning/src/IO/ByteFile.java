package IO;
import java.io.*;

/**
 * 運用位元組串流處理檔案 IO
 * FileInputStream
 * FileOutputStream
 * @author rockst
 *
 */
public class ByteFile {

	public static void main(String[] args) throws IOException
	{
		fileIOEXUsingBuffer();
	}
	
	/**
	 * 使用 bytes stream 處理檔案讀取與寫入
	 * 一次只能處理 1 個 Byte
	 * @throws IOException
	 */
	public static void fileIOEX() throws IOException // 記得要使用 exception
	{
		FileInputStream fis = new FileInputStream("iFile.txt"); // Learning/iFile.txt
		FileOutputStream fos = new FileOutputStream("oFile.txt"); 
		
		int ch;
		
		while( (ch = fis.read()) != -1) { // 從 fis 讀取字元 -1 表示結束
			fos.write(ch); // 寫入 fos
			System.out.print((char)ch);
		}
		
		fis.close();
		fos.close();		
	}
	
	/**
	 * 運用 Buffer 避免過於頻繁得讀取與寫入
	 * 使用 bytes stream 處理檔案讀取與寫入
	 * 一次只能處理 1 個 Byte
	 * @throws IOException
	 */
	public static void fileIOEXUsingBuffer() throws IOException
	{
		 // Learning/iFile.txt
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("iFile.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("oFile.txt"));
		
		int ch;
		
		while( (ch = bis.read()) != -1) { // 從 fis 讀取字元 -1 表示結束
			bos.write(ch); // 寫入 fos
			System.out.print((char)ch);
		}
		
		bis.close();
		bos.close();		
	}

}
