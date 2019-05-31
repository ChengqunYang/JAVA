package quickSort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = new int[]{2,3,5,1,6,3,9,4,8};
		qucikSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void qucikSort(int[] arr,int start,int end){
		if(start<end){
			//把数组中的第0个元素作为标准数
			int stard = arr[start];
			//记录需要排序的下标
			int low = start;
			int high = end;
			//循环找出比标准数大的数和比标准数小的数
			while(low<high){
				while(low<high&&stard<=arr[high]){
					high--;
				}
				//使用右边的数字替换左边的数
				arr[low] = arr[high];
				//如果左边的数字比标准小
				while(low<high&&arr[low]<=stard){
					low++;
				}
				arr[high] = arr[low];
			}
			//把标准数赋给低所在位置的元素
			arr[low] = stard;
			//处理所有小的数字
			qucikSort(arr, start, low);
			//处理所有大的数字
			qucikSort(arr, low+1, end);
		}
	
	}
}
