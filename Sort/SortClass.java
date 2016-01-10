/**
 * java sort class 
 * 排序
 */

class SortClass {
	
	/**
 	 * 冒泡排序 从大到小
	 * @param [] arr 
	 * @return []
	 */
	public static int[] bubbleSort(int[] arr){
		int temp;	// 记录临时值
		int size = arr.length;
		for(int i = 0; i < size; i++){
			for(int j = i + 1; j < size; j++){
				if(arr[i] < arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		return arr;
	}

	/**
  	 * 选择排序 从小到大
	 * @param [] arr
	 * @return []
	 */
	public static int[] selectSort(int[] arr){
		int size = arr.length, temp;
		for(int i = 0; i < size; i++){
			int k = i;
			// 此循环作用就是找出未排序中最小的数
			for(int j = size - 1; j > i; j--){
				if(arr[j] < arr[k]){
					k = j;	// 保证每一次arr[k]都是小的值
				}
			}
			// 把每次循环后最小的数 置换到最前面	
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
		return arr;
	}

	/**
	 * 插入排序 小到大
	 * @param [] arr
	 * @return []
	 */
	public static int[] insertSort(int[] arr){
		int size = arr.length, temp, j;
		for(int i = 0; i < size; i++){
			temp = arr[i];
			for(j = i; j > 0 && temp < arr[j - 1]; j--){
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;	// j 小于 i 把小的数推到前面去
		}
		return arr;
	}
}

