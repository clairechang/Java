package thread;

/**
 * Mutithreading
 * @author rockst
 *
 */
public class ThreadEX {

	public static void main(String[] args) {
		
		threadEX2();
		
	}
	
	// thread base
	public static void threadEX1() {
		
		// 取得目前 thread
		Thread t1 = Thread.currentThread(); // thread name = main
		Thread t2 = new Thread("MyThread"); // thread name = MyThread
		Thread t3 = new Thread(); // thread name = Thread-0
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
	}
	
	// multithreading
	public static void threadEX2() {
		
		// declare MyThread
		MyThread t1 = new MyThread("MyThread1");
		MyThread t2 = new MyThread("MyThread2");
		
//		t1.start(); // 啟動
//		t2.start();
		
	}

}

class MyThread extends Thread {
	
	// 建構子
	MyThread (String name) {
		super(name); // 呼叫父類別
		start(); // 宣告後馬上啟動
	}
	
	public void run() {
		
		String ThreaName = Thread.currentThread().getName();
		
		try {
			
			for(int i = 1; i <= 5; i++) {
				Thread.sleep(2000); // delay
				System.out.println(ThreaName + ":" + i);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
