package text1;
/*
 * ����
 * 		�ж�һ�����Ƿ����int���͵ķ�Χ
 * int���͵ķ�Χ-2��31�ε�2��31��-1
 * 
 * 
 * ���ڻ�����������ֻ����һЩ�򵥵Ĳ��������㣬����javaΪ���Ƿ�װ�˻����������ͣ�Ϊÿ�ֻ������������ṩ�˰�װ��
 * ��װ����Ƿ�װ�˻����������͵��࣬Ϊ�����ṩ�˸���ĸ��ӵķ�����һЩ����
 * 
 * 
 * byte		Byte
 * short	Short
 * char		Character
 * int 		Integet
 * long		Long
 * Float	Float
 * double	Double
 * boolean	Boolean
 * 
 * Integer:
 * 		String --- int
 * 		��ʽ1��int intvalue();
 * 		��ʽ2��static int parseInt(String s)
 * 		int ---String
 * 		��ʽ1��+ �� ��
 * 		��ʽ2��String toString()
 * 
 * ���췽����
 * 		Integer(int value)
 * 		Integer(String s)
 * 
 */
public class IntegerTest {
	public static void main(String[] args) {
	/*	int n = 10;
		if(n >= Math.pow(-2, 31) && n <= Math.pow(2, 31)-1)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("������");
		}
		*/
		//Integer i = new Integer("10");
		//System.out.println(i);
		//int intvalue()
		//int a = i.intValue();
		//System.out.println(a+10);
		
		
		//int b = Integer.parseInt("10");
		//System.out.println(b);
		
		//Integer(int value)
		//Integer i2 = new Integer(40);
		//String s = i2.toString();
		//System.out.println(s);
		
		//static String int toString(int i)
		String s2 = Integer.toString(50);
		System.out.println(s2);
	}
		

} 