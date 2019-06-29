package radixSort;

import java.util.Arrays;

public class RadixQueueSort {
public static void main(String[] args) {
	int[] arr = new int[] {23,4,7,45,678,43,786,7890,32,76,12,1};
	radixSort(arr);
	System.out.println(Arrays.toString(arr));
}
	public static void radixSort(int[] arr){
		//����������������
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		//������������Ǽ�λ��
		int maxLength = (max+"").length();
		
		//������ʱ�洢���ݵĶ�ά����
		int[][] temp = new int[10][arr.length]; 
		//���ڼ�¼��temp��Ӧ�������д�ŵ����ֵ�����
		int [] counts = new int[10];
		
		//������󳤶ȵ��������ȽϵĴ���
		for(int i=0,n=1; i<maxLength; i++,n*=10){
			//��ÿһ�����ֱַ����������
			for(int j=0; j<arr.length; j++){
				//��������
				int ys = arr[j]/n%10;
				//�ѵ�ǰ���������ݷ���ָ����������
				temp[ys][counts[ys]]=arr[j];
				//��¼����
				counts[ys]++;
			}
			//��¼ȡ��Ԫ��Ҫ�ŵ�λ��
			int index = 0;
			//������ȡ����
			for(int k=0; k<counts.length; k++){
				//��¼�����������е�ǰ������¼������������0
				if(counts[k]!=0){
					//����ѭ��ȡ��Ԫ��
					for(int l=0; l<counts[k]; l++){
						arr[index] = temp[k][l];
						//��¼��һ��λ��
						index++;
					}
					//���������
					counts[k]=0;
				}
			}
		}
		
	}
}
 