package mergeSort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {2,9,4,8,2,6,7,3,5,0};
		System.out.println(Arrays.toString(arr));
		MergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	//�鲢����
	public static void MergeSort(int[] arr,int low, int high){
		int middle = (high+low)/2;
		if(low<high){
			//�������
			MergeSort(arr,low,middle);
			//�����ұ�
			MergeSort(arr, middle+1, high);
			//�鲢
			Merge(arr,low,middle,high);
		}
		
	}
	//�鲢һ��
	public static void Merge(int arr[],int low, int middle,int high){
		//���ڴ洢�鲢�����ʱ����
		int[] temp = new int[high - low + 1];
		//���ڼ�¼��һ����������Ҫ�������±�
		int i = low;
		//���ڼ�¼�ڶ�����������Ҫ�������±�
		int j = middle+1;
		//���ڼ�¼����ʱ�����д�ŵ��±�
		int index = 0;
		//������������,ȡ��С�����������ʱ������
		while(i<=middle&&j<=high){
			//��һ����������ݸ�С
			if(arr[i] <= arr[j]){
				//��С�����ݷ�����ʱ������
				temp[index] = arr[i];
				//���±�����ƶ�һλ
				i++;
			}else{
				temp[index] = arr[j];
				j++;
			}
			index++;
		}
		//����һ��������û���ƶ��������
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
		//����ʱ�����е����ݴ���ԭ������
		for (int k = 0; k < temp.length; k++) {
			arr[k+low] = temp[k];
		}
 	}

}
