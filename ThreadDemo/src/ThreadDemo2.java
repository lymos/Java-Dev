/**
 * 继承Thread类创建线程
 * @author lymos
 *
 */
class ThreadObj extends Thread{	// 不能加public关键字 与文件名跟类名的关系有关
	ThreadObj(){
		System.out.println("Demo2 Child Thread Running.");
		start();	// 启动线程
	}
	
	public void run(){
		try{
			for(int i = 1; i < 5; i++){
				System.out.println("Child Thread: " + i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted.");
		}
		System.out.println("Child Thread Exiting.");
	}
}
/**
 * 主类
 * @author lymos
 *
 */
public class ThreadDemo2{
	public static void main(String args[]){
		new ThreadObj();	// 创建一个新线程
		try{
			for(int i = 1; i < 5; i++){
				System.out.println("Main Thread: " + i);
				Thread.sleep(100);	// 睡100ms
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupred.");
		}
		System.out.println("Main Thread Exiting.");
	}
}
