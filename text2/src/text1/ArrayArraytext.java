package text1;

public class ArrayArraytext {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);
		for(int j = 0;j<arr.length;j++)
		{
			for(int i = 0;i<arr[0].length;i++)
				System.out.println(arr[j][i]);
		}
	}
}
