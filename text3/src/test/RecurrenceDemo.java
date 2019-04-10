package test;

/*
 * 递归注意事项：
 * 			递归一定要有出口，否则内存溢出
 * 			递归次数不宜过多，否则内存溢出
 */
public class RecurrenceDemo {
	public static void main(String[] args) {
		//show(5);
		int result = jc(5);
		System.out.println(result);
		show(5);
	}
	public static int jc(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * jc(n-1);
		}
	}
	public static void show(int n) {
		if(n>0)
		{
		System.out.println(n);
		show(n-1);
		}
		else return;
	}
}
