package text1;

/*
 * ��̬��ǰ�᣺
 * 		�Ӹ���ļ̳й�ϵ
 * 		��������д
 * 		��������ָ���������
 * 
 * ��̬�󶨣������ڼ���õķ������Ǹ������������
 * 	
 * ��̬�ĳ�Ա�ص㣺
 * 	��Ա����
 * 			����ʱ������ߣ�����ʱ���Ļ�����ߣ�����û����д�ĸ���
 *  ��Ա����
 *  		����ʱ����ߣ�����ʱ���ұ�
 *  ��̬����
 *  		ʹ�ñ���ȥ���þ�̬��������ʵ�൱���ñ������͵�����ȥ����
 *  		����ʱ����ߣ�����ʱ�������
 *  
 *  ��̬����ȱ�㣺
 *  	ȱ�㣺�޷�ֱ�ӷ����������еĳ�Ա
 *  	�ŵ㣺������߿�ά���ԣ���ߴ���Ŀ���չ��
 */
public class PoymorphicTest {
	public static void main(String[] args) {
		Dad d = new Kid();
		System.out.println(d.num);
		d.method();
		d.function();
	}
}
class Dad {
	int num = 20;
	public void method() {
		System.out.println("���Ǹ���ķ���");
		
	}
	public static void function() {
		System.out.println("���Ǹ���ľ�̬����");
	}
}
class Kid extends Dad {
	int num = 10;
	public void method() {
		System.out.println("��������ķ���");
	}
	public static void function() {
		System.out.println("��������ľ�̬����");
	}
}