/**
 * 实现Runnable接口创建线程
 * @author lymos
 *
 */
class newThread implements Runnable{	// 实现Runnable接口
	Thread t;	// 声明线程变量
	
	/**
	 *  构造函数
	 */
	newThread(){
		// 创建另一个线程
		t = new Thread(this, "MyChildThreadName");
		System.out.println("Child Thread Running.");
		t.start(); // 触发线程启动
	}
	
	/**
	 * (第二个)线程入口
	 */
	public void run(){
		
		try{
			for(int i = 1; i < 5; i++){
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted.");
		}
		System.out.println("Child Thread Exiting.");
	}
}

public class ThreadDemo{
	public static void main(String args[]){
		new newThread();	// 创建一个线程(主线程)
		
		try{
			for(int i = 1; i < 5; i++){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);	// 睡1000ms
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main Thread Exiting.");
	}
}