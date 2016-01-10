/**
 * test sortClass
 */
import java.util.Arrays;
public class Test{

	public static void main(String[] args){
		try{
			SortClass sc = new SortClass();
			int[] arr = {12, 2, 34, 5, 6};
			// System.out.println(Arrays.toString(arr));
			// bubbleSort(sc, arr);
			// selectSort(sc, arr);
			insertSort(sc, arr);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void bubbleSort(SortClass sc, int[] arr){
		int[] ret;
		// 冒泡排序
		ret = sc.bubbleSort(arr);
		System.out.println(Arrays.toString(ret)); // 数组转换成字符串

		int size = arr.length;
		for(int i = 0; i < size; i++){
			System.out.println(arr[i]);
		}
	}		

	private static void selectSort(SortClass sc, int[] arr){
		int[] ret;
		// 选择排序
		ret = sc.selectSort(arr);
		System.out.println(Arrays.toString(ret));
	}

	private static void insertSort(SortClass sc, int[] arr){
		int[] ret;
		// 插入排序
		ret = sc.insertSort(arr);
		System.out.println(Arrays.toString(ret));
	}
}

