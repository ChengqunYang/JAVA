package selectSort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr={9,4,6,1,5,3,2,7,3,8,0};
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void selectSort(int[] arr){
		//遍历所有的数
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//把当前遍历的数和后面所有的数依次进行比较,记录下最小的数的下标
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]){
					//记录下最小的下标
					minIndex = j;
				}
			}
			//如果最小的数和当前遍历的数的下标不一致,说明下标为minIndex的数比当前遍历的数更小
			if(i!=minIndex){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
