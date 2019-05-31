package insertSort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int [] arr = new int[]{6,2,7,1,3,6,9,8,4};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertSort(int[] arr){
		//�������е�����
		for (int i = 1; i < arr.length; i++) {
			//�����ǰ���ֱ�ǰһ��С
			if(arr[i]<arr[i-1]){
				//�ѵ�ǰ�������ִ�����
				int temp = arr[i];
				//����ǰ�����������
				int j;
				for (j = i-1; j >= 0&&temp<arr[j]; j--) {
					//��ǰһ�����ָ�����һ������
					arr[j+1] = arr[j];
				}
				//ֱ���ҵ��ʺϵ�ǰ���ֵ�λ��,Ȼ�����
				arr[j+1] = temp;
			}
		}
	}
}
