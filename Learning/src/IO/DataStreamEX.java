package IO;
import java.io.*;

/**
 * 使用資料型別來處理檔案得讀取和輸出
 * DataInputStream
 * DataOutputStream
 * @author rockst
 *
 */
public class DataStreamEX {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
	    DataInputStream dis = null;
	    
	    FileOutputStream fos = null;
	    DataOutputStream dos = null;
	    
	    String file = "data.txt";
	    String[] s = {"Hello", "World!!", "中文"};
	    
	    try {
	    	
	    	// create file output stream and data output stream
	        fos = new FileOutputStream(file);
	        dos = new DataOutputStream(fos);
	        
	        // for each  string in string buffer
	        for(String j:s)
	        {
	        	// write string encoded as modified UTF-8
	            dos.writeUTF(j);
	        }
	        // force data to the underlying file output stream
	        dos.flush();
	        
	        // create file input and data input stream
	        fis = new FileInputStream(file);
	        dis = new DataInputStream(fis);
	        
	        // available stream to be read
	        while(dis.available() > 0)
	        {
				// reads characters encoded with modified UTF-8
				String k = dis.readUTF();
				
				// print
				System.out.print(k + " ");
	         }
	        
	    } catch (Exception e) {
	    	
	    	// if any error occurs
	    	e.printStackTrace();
	    	
	    } finally {
	    	
	    	// releases all system resources from the streams
	    	if(fis != null) fis.close();
	    	if(dis != null) dis.close();
	    	if(dos != null) fos.close();
	    	if(dos != null) dos.close();
	    	
	    }
	      
	}
	
	/*
	public static void dataStreamTest() throws IOException
	{
		String file = "data.txt";
		String[] s = {"Hello", "World!!"};
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		
//		dos.writeBoolean(true);
//		dos.writeChar('r');
//		dos.writeInt(1);
//		dos.writeLong(Integer.MAX_VALUE);
//		dos.writeDouble(Double.MAX_VALUE);
//		dos.writeFloat(Float.MAX_VALUE);
		
		for(String j:s)
        {
           // write string encoded as modified UTF-8
           dos.writeUTF(j);
        }
		dos.flush();
		
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		while(dis.available()>0)
        {
			String k = dis.readUTF();
			System.out.print(k+" ");
			 
//			System.out.println(
//				"Boolean=" + dis.readBoolean() + "\n" +
//				"Double=" + dis.readDouble() + "\n"
//				);
        }
		dis.close();
		dos.close();
	}
	*/
}
