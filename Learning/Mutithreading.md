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

![thread](https://drive.google.com/file/d/0B40Ov69xK-ajdERsSXV3ZnVmNEk/view?usp=sharing)
	
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
	