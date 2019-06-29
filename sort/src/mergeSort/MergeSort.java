package mergeSort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {2,9,4,8,2,6,7,3,5,0};
		System.out.println(Arrays.toString(arr));
		MergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	//归并排序
	public static void MergeSort(int[] arr,int low, int high){
		int middle = (high+low)/2;
		if(low<high){
			//处理左边
			MergeSort(arr,low,middle);
			//处理右边
			MergeSort(arr, middle+1, high);
			//归并
			Merge(arr,low,middle,high);
		}
		
	}
	//归并一次
	public static void Merge(int arr[],int low, int middle,int high){
		//用于存储归并后的临时数组
		int[] temp = new int[high - low + 1];
		//用于记录第一个数组中需要遍历的下标
		int i = low;
		//用于记录第二个数组中需要遍历的下标
		int j = middle+1;
		//用于记录在临时数组中存放的下标
		int index = 0;
		//遍历两个数组,取出小的数组放入临时数组中
		while(i<=middle&&j<=high){
			//第一个数组的数据更小
			if(arr[i] <= arr[j]){
				//把小的数据放入临时数组中
				temp[index] = arr[i];
				//让下标向后移动一位
				i++;
			}else{
				temp[index] = arr[j];
				j++;
			}
			index++;
		}
		//处理一个数组中没有移动完的数据
		while(j<=high){
			temp[index] = arr[j];
			j++;
			index++;
		}
		while(i<=middle){
			temp[index] = arr[i];
			i++;
			index++;
		}
		//把临时数组中的数据存入原数组中
		for (int k = 0; k < temp.length; k++) {
			arr[k+low] = temp[k];
		}
 	}

}
