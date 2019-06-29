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
		//�������е���
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//�ѵ�ǰ���������ͺ������е������ν��бȽ�,��¼����С�������±�
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]){
					//��¼����С���±�
					minIndex = j;
				}
			}
			//�����С�����͵�ǰ�����������±겻һ��,˵���±�ΪminIndex�����ȵ�ǰ����������С
			if(i!=minIndex){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}