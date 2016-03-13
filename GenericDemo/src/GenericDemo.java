/**
 * 泛型demo 泛型声明 <名称>
 * @author lymos
 *
 * @param <T>
 */
public class GenericDemo<T>{
	private T t;	// 泛型变量
	
	public void add(T t){
		this.t = t;
	}
	
	/**
	 * 返回的类型是泛型
	 * @return
	 */
	public T get(){
		return t;
	}
	
	/**
	 * 泛型方法 输出不同类型的数组元素
	 * @param input_arr
	 */
	public static <E> void printArr(E[] input_arr){
		for(E elem: input_arr){
			System.out.printf("%s-", elem);
		}
	}
	
	/**
	 * 类入口函数
	 * @param args
	 */
	public static void main(String args[]){
		// 声明实例
		GenericDemo<Integer> integer_obj = new GenericDemo<Integer>();
		GenericDemo<String> string_obj = new GenericDemo<String>();
		
		// 添加属性
		integer_obj.add(new Integer(100));
		string_obj.add(new String("Hello"));
		
		// 输出属性
		System.out.printf("整型： %d\n", integer_obj.get());
		System.out.printf("字符串： %s\n", string_obj.get());
		
		// 调用泛型方法
		System.out.println("调用泛型方法: ");
		Integer[] int_arr = {1, 2, 3, 4};
		printArr(int_arr);
		Character[] char_arr = {'A', 'B', 'C', 'd'};
		printArr(char_arr);
	}
}