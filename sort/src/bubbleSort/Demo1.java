package bubbleSort;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = new int[]{3,2,6,8,2,1,9,7,4};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//冒泡排序
	public static void bubbleSort(int[] arr){
		//控制共比较多少轮
		for (int i = 0; i < arr.length-1; i++) {
			//比较的次数
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
