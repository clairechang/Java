package IO;
import java.io.*;

/**
 * 序列話物件的儲存與讀取,將物件資料序列化後寫入檔案中並讀取
 * ObjectInputStream
 * ObjectOutputStream
 * @author rockst
 *
 */
public class ObjectStreamEX {

	public static void main(String[] args) throws Exception {
		
		// default 變數
		String file = "object.dat";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		Employee Emp1 = new Employee("林洛克", 40);
		Employee Emp2 = null;
		
		try {
			
			// create file output stream and object output stream
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			// 寫入 Object 到檔案中
			oos.writeObject(Emp1);
			
			// create file input stream and object input stream
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			// 取得檔案中的 Object 並參考給 Emp2
			Emp2 = (Employee) ois.readObject();
			
			Emp2.showName();
			Emp2.showAge();
			
		} catch(Exception e) {
			// if any error occurs
			e.printStackTrace();
		} finally {
			// releases all system resources from the streams
			if(fos != null) fos.close();
			if(oos != null) oos.close();
			if(fis != null) fis.close();
			if(ois != null) ois.close();
		}
	}
}

// 定義 Employess 為 Serializable 介面
class Employee implements Serializable
{
	private static final long serialVersionUID = 1L; // 使用 Serializable 介面都要產生這個屬性
	String name;
	int age;
	
	// 建構子
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showName() {
		System.out.println(name);
	}
	
	void showAge() {
		System.out.println(age);
	}
}
