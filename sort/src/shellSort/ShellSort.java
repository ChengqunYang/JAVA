package shellSort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		int[] arr ={2,3,6,8,2,1,9,5,4,7};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void shellSort(int[] arr){
		//�������еĲ���
		for (int d = arr.length/2; d>0; d/=2){
			//�������е�Ԫ��
			for (int i = d; i < arr.length; i++) {
				//�������������е�Ԫ��
				for (int j = i-d; j >= 0; j-=d) {
					//�����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ��
					if(arr[j]>arr[j+d]){
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
		}
	}

}