package text1;
/*
package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World");
		Scanner in = new Scanner(System.in);
		System.out.println("�ظ���" + in.next());
		System.out.println(2 + 3);
		int a = in.nextInt();
		System.out.println(a);
	}
}
/*
public class PrimitiveTypeTest {  
    public static void main(String[] args) {  
        // byte  
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
    }  
}*/
public class StaticTest {
	private static int staticInt = 2;
	private int random = 2;

	public StaticTest() {
		staticInt++;
		random++;
	}

	public static void main(String[] args) {
		System.out.println("���������������ֵ�仯");
		StaticTest test = new StaticTest();
		System.out.println("  ʵ��1��staticInt:" + StaticTest.staticInt + "----random:" + test.random);
		StaticTest test2 = new StaticTest();
		System.out.println("  ʵ��2��staticInt:" + StaticTest.staticInt + "----random:" + test2.random);
		System.out.println("��̬������ֵ");
		System.out.println("  ��̬����������:" + A.staticA);
		System.out.println("  ������������:" + A.staticA);
		A.toChange();
		System.out.println("  ��̬����1������:" + A.staticA);
		A.toChange2();
		System.out.println("  ��̬����2������:" + A.staticA);
		System.out.println("������ֵ");
		System.out.println("  ��̬��丳ֵ:" + B.staticB);
	}
}

class A { 
	public static  String  staticA ="A" ;  
	//��̬�����޸�ֵ 
	static{  staticA ="A1"; } 
	//�������޸�ֵ
	public A (){  staticA ="A2"; } 
	//��̬���������� 
	
	public static void toChange(){  staticA ="A3"; } 
	public static void toChange2(){  staticA ="A4"; }  
}

class B { 
	public static final String  staticB ;  // �����븳ֵ���� 
	static{  staticB ="B"; }
}

/*
public class StaticTest {
private static int staticInt = 2;
private int random = 2;

public StaticTest() {
	staticInt++;
	random++;
}

public static void main(String[] args) {
	System.out.println("���������������ֵ�仯");
	StaticTest test = new StaticTest();
	System.out.println("  ʵ��1��staticInt:" + test.staticInt + "----random:" + test.random);
	StaticTest test2 = new StaticTest();
	System.out.println("  ʵ��2��staticInt:" + test.staticInt + "----random:" + test.random);
	System.out.println("��̬������ֵ");
	System.out.println("  ��̬����������:" + A.staticA);
	A a = new A();
	System.out.println("  ������������:" + a.staticA);
	a.toChange();
	System.out.println("  ��̬����1������:" + A.staticA);
	a.toChange2();
	System.out.println("  ��̬����2������:" + A.staticA);
	System.out.println("������ֵ");
	System.out.println("  ��̬��丳ֵ:" + B.staticB);
}
}

class A { 
public static  String  staticA ="A" ;  
//��̬�����޸�ֵ 
static{  staticA ="A1"; } 
//�������޸�ֵ
public A (){  staticA ="A2"; } 
//��̬���������� 

public static void toChange(){  staticA ="A3"; } 
public static void toChange2(){  staticA ="A4"; }  
}

class B { 
public static final String  staticB ;  // �����븳ֵ���� 
static{  staticB ="B"; }
}
*/