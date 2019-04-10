package text1;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = 100;
		arr[2] = 200;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		int a[] = {2,2,34,5,62,65,72};
		for(int i= 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Scanner in = new Scanner(System.in);
		in.close();
	}
}
