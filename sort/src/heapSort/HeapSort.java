package heapSort;

import java.util.Arrays;

public class HeapSort {
public static void main(String[] args) {
	int[] arr = new int[]{9,2,5,6,3,4,7,0,10,1};
	heapSort(arr);
	System.out.println(Arrays.toString(arr));
}
	public static void heapSort(int[] arr){
		//开始位置是最后一个非叶子节点,即最后一个节点的父节点
		int start = (arr.length-1)/2;
		//调整为大顶堆
		for (int i = start; i>=0; i--) {
			maxHeap(arr,arr.length,i);
		}
		//交换最后一个节点和第一个节点
		for (int i = arr.length-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			maxHeap(arr,i,0);
		}
	}
	public static void maxHeap(int[] arr,int size, int index){
		//左子节点
		int leftNode = 2*index+1; 
		//右子节点
		int rightNode = 2*index+2;
		int max = index;
		//和两个子节点分别进行对比,找出最大的节点
		if(leftNode<size&&arr[leftNode]>arr[max]){
			max=leftNode;
		}
		if(rightNode<size&&arr[rightNode]>arr[max]){
			max=rightNode;
		}
		//交换位置
		if(max!=index){
			int temp=arr[index];
			arr[index]=arr[max];
			arr[max]=temp; 
			//交换位置后可能会破坏之前排好的堆,所以,之前排好的堆需要重新调整
			maxHeap(arr,size,max);
		}
	}
}
