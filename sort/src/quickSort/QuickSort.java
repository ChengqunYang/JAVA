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
			//�������еĵ�0��Ԫ����Ϊ��׼��
			int stard = arr[start];
			//��¼��Ҫ������±�
			int low = start;
			int high = end;
			//ѭ���ҳ��ȱ�׼��������ͱȱ�׼��С����
			while(low<high){
				while(low<high&&stard<=arr[high]){
					high--;
				}
				//ʹ���ұߵ������滻��ߵ���
				arr[low] = arr[high];
				//�����ߵ����ֱȱ�׼С
				while(low<high&&arr[low]<=stard){
					low++;
				}
				arr[high] = arr[low];
			}
			//�ѱ�׼������������λ�õ�Ԫ��
			arr[low] = stard;
			//��������С������
			qucikSort(arr, start, low);
			//�������д������
			qucikSort(arr, low+1, end);
		}
	
	}
}
