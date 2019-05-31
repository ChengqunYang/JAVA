package insertSort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int [] arr = new int[]{6,2,7,1,3,6,9,8,4};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertSort(int[] arr){
		//遍历所有的数字
		for (int i = 1; i < arr.length; i++) {
			//如果当前数字比前一个小
			if(arr[i]<arr[i-1]){
				//把当前遍历数字存起来
				int temp = arr[i];
				//遍历前面的所有数字
				int j;
				for (j = i-1; j >= 0&&temp<arr[j]; j--) {
					//把前一个数字赋给后一个数字
					arr[j+1] = arr[j];
				}
				//直到找到适合当前数字的位置,然后放入
				arr[j+1] = temp;
			}
		}
	}
}
