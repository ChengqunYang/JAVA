package text2;
/*
 * StringBuilder:是一个可变的字符串，又叫做字符串缓冲区类。
 * 
 * String 和StringBuilder的区别：
 * 		String 的内容是固定的
 * 		StringBuilder的内容是可变的
 * 
 * public int capacity();:返回当前容量（理论值）:添加数据，并返回自身对象
 * public int length();:返回长度，字符数（实际值）
 * 添加功能：
 * 		public StringBuilder append(任意类型)
 * 反转功能:
 * 		publoic StringBuilder reverse() 
 * 
 * StringBuilder ---> String
 * 		public String toString():实现StringBuilder到String的转化
 * String ---> StringBuilder
 * 		StringBuilder(String str):通过构造方法实现把String类型转化为StringBuilder
 */

/*public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sd = new StringBuilder("a");
		System.out.println("sd"+sd);
		System.out.println(sd.capacity());
		System.out.println(sd.length());
		StringBuilder sd2 = sd.append("hello");
		System.out.println("sd:"+sd);
		System.out.println("sd2:"+sd2);
		System.out.println(sd == sd2);
		//返回值是对象
		sd.append("world").append("ycq");
		System.out.println("sd:"+sd);
	}
}
*/
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sd3 = new StringBuilder("adklj");
		sd3.reverse();
		System.out.println(sd3);
	}
}