package IO;

public class Printer {
	
	public int serial_number = 55688;
	protected String OS = "Mac";
	String port_name = "USB";
	
	public void Hello() 
	{
		System.out.println("Hello Java!");
		System.out.println("S/N: " + serial_number);
		
	}
}