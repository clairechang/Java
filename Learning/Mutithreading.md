# Multithreading 多執行緒

## Process

> program 載入到記憶體執行時的狀態，不會分配到 CPU 時間。

## Thread

> 一個 Process 會有很多 thread (main thread, Parent thread, Child thread)
> Thread 會分配到 CPU 的時間執行程式碼的單位

## Code

> 取得目前的 thread (name = main)

	Thread t1 = Thread.currentThread()
	Thread t2 = new thread("MyThread"); // MyThread
	Thread t3 = new thread(); // Thread-0
	
> thread 生命週期

	https://drive.google.com/file/d/0B40Ov69xK-ajdERsSXV3ZnVmNEk/view
	
> declare Object

	class MyThread extends thread
	
> 啟動

	MyThread.start(); -> call void run() method

> 終止

	MyThread.interrupt();
	
> 是否還活著？

	if(MyThread.isAlive())
	
> 暫停 MyThread 等待某個 thread 結束

	threadName.join(long millis); 
	
> 休眠

	sleep()
	
> 阻塞狀態 Synchronized : 防止 thread 因為同時存取資料造成的衝突

	synchronized void method_name() throws InterrupteException {
	
	}

> 等待, 執行中的 thread 呼叫 wait() 進入等待

	MyThread.wait();
	
> 等待中的 thread 呼叫 notify(), notifyAll() 回到 runnable

> running thread 呼叫 sleep() 進入休眠 sleep()

> running thread 呼叫 yield() 讓出 CPU 回到  runnable

> Deadlock

	A thread 等 B thread, B thread 等 C, C thread 等  A
	
## Runnable 介面

> 若某個類別必須繼承某個類別無法繼承 Thread 時，可使用 Runnable 介面。

	class MyThead implements Runnable {
		public void run() {
		}
	}

## Thread 之間的溝通

> 可使用串流類別建立管道

	PipedInputStream
	PipedOutputStream
	PipedReader
	PipedWriter
	
> A 和  B 兩個  thread 要溝通

	// 建立 A 傳給 B 的管道
	PipedOutputStream pOutToB = new PipedOutputStream();
	// 建立 A 接收 B 的管道
	PipedInpoutStream pInFromA = new PipedInpoutStream(pOutToB);
	
	// 建立 B 傳給 A 的管道
	PipedOutputStream pOutToA = new PipedOutputStream();
	// 建立 B 接收 A 的管道
	PipedInpoutStream pInFromB = new PipedInpoutStream(pOutToA);
	
	// 使用 DataInputStream, DataOutputStream 包裝
	class MyClass extends Thread {
	
		private DataInputStram in;
		private DataOutputStram out;
	
		MyClass(PipedInpoutStream in, PipedOutputStream out) {
			this.in = new DataInputStram(in);
			this.out = new DataOutputStram(out);
		}
	}
	
	// 溝通
	out.writeInt();
	in.readInt();
	 
	