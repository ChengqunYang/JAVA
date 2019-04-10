package text2;

//import java.util.Scanner;

/*
 * 字符串本身是一个字符数组
 * String 类的构造方法
	 * A：String()
	 * B: String(char[] value) 
	 * C:String(char[] value, int offset, int count) ：把数组中的一部分数据封装成字符串对象
	 * D:String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。 
 */

 /*
	 *  String 类的成员方法
	 * 字符串的判断方法：
	 * 
	 * A: boolean equals(Object anObject) 
	 *   将此字符串与指定的对象比较。 
	 * B: boolean equalsIgnoreCase(String str)
	 * 	  将此字符串与指定的对象比较,忽略大小写。
	 * C： boolean startsWith(String str)
	 * 	  判断字符串对象是否以指定的str开头
	 * D： bollean endsWith(String str)
	 * 	 判断字符串对象是否以指定的str结尾 
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("------------");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("-------------");
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.startsWith("He"));
		System.out.println("-------------");
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.endsWith("ll"));
		System.out.println("结束");
	}
}*/
/*
 * 字符串的获取功能方法
 * int length():获取字符串的长度也就是字符的个数
 * char charAt(int index):获取指定索引处的字符
 * int indexOf(String str):获取字符串str第一次出现的索引
 * String substring (int start)：从start开始截取字符串。到end结束截取字符串
 * string substring (int start,int end):从start开始截取字符串。到end结束截取字符串
 * 
 
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		System.out.println(s.length());
		System.out.println("---------");
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("----------");
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("wo"));
		System.out.println(s.indexOf("d"));
		System.out.println("------------");
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(0));
		
		System.out.println(s.substring(0,4));//0-3不包括4
		
	}
}
*/
/*
 * 遍历字符串
 * public class StringDemo {
	public static void main(String[] args) {
		String s = "yangchengqun";
		for(int x=0;x<s.length();x++)
		System.out.print(s.charAt(x));
	}
}*/
/*
 * String类的转换功能
 * char[] toCharArray():把字符串转化为字符数组：可用于将字符串转化为字符数组然后遍历字符数组达到遍历字符串的功能
 * String toLowerCase():把字符串转化为小写字符串
 * String toUpperCase():把字符串转化为大写字符串

 public class StringDemo { 
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = in.nextLine();
		String s1 = s.substring(1);
		String s2 = s.substring(3, 6);
		System.out.println(s+"___"+s1+"___"+s2);
	}
 }
*/
/*
 * 去除字符串两端的空格
 * 		String trim();
 * 按照指定符号分割字符串
 * 		String[] split(String str)
 *  
 *  
 */
public class StringDemo { 
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = " helloworld ";
		String s4 = "aa,bb,cc";
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s2.trim());
		String[] strArray = s4.split(",");
		for(int x=0;x<strArray.length;x++){
			System.out.println(strArray[x]);
		}
	}
}

