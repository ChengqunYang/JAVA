package text2;

//import java.util.Scanner;

/*
 * �ַ���������һ���ַ�����
 * String ��Ĺ��췽��
	 * A��String()
	 * B: String(char[] value) 
	 * C:String(char[] value, int offset, int count) ���������е�һ�������ݷ�װ���ַ�������
	 * D:String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡� 
 */

 /*
	 *  String ��ĳ�Ա����
	 * �ַ������жϷ�����
	 * 
	 * A: boolean equals(Object anObject) 
	 *   �����ַ�����ָ���Ķ���Ƚϡ� 
	 * B: boolean equalsIgnoreCase(String str)
	 * 	  �����ַ�����ָ���Ķ���Ƚ�,���Դ�Сд��
	 * C�� boolean startsWith(String str)
	 * 	  �ж��ַ��������Ƿ���ָ����str��ͷ
	 * D�� bollean endsWith(String str)
	 * 	 �ж��ַ��������Ƿ���ָ����str��β 
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
		System.out.println("����");
	}
}*/
/*
 * �ַ����Ļ�ȡ���ܷ���
 * int length():��ȡ�ַ����ĳ���Ҳ�����ַ��ĸ���
 * char charAt(int index):��ȡָ�����������ַ�
 * int indexOf(String str):��ȡ�ַ���str��һ�γ��ֵ�����
 * String substring (int start)����start��ʼ��ȡ�ַ�������end������ȡ�ַ���
 * string substring (int start,int end):��start��ʼ��ȡ�ַ�������end������ȡ�ַ���
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
		
		System.out.println(s.substring(0,4));//0-3������4
		
	}
}
*/
/*
 * �����ַ���
 * public class StringDemo {
	public static void main(String[] args) {
		String s = "yangchengqun";
		for(int x=0;x<s.length();x++)
		System.out.print(s.charAt(x));
	}
}*/
/*
 * String���ת������
 * char[] toCharArray():���ַ���ת��Ϊ�ַ����飺�����ڽ��ַ���ת��Ϊ�ַ�����Ȼ������ַ�����ﵽ�����ַ����Ĺ���
 * String toLowerCase():���ַ���ת��ΪСд�ַ���
 * String toUpperCase():���ַ���ת��Ϊ��д�ַ���

 public class StringDemo { 
	 public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = in.nextLine();
		String s1 = s.substring(1);
		String s2 = s.substring(3, 6);
		System.out.println(s+"___"+s1+"___"+s2);
	}
 }
*/
/*
 * ȥ���ַ������˵Ŀո�
 * 		String trim();
 * ����ָ�����ŷָ��ַ���
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

