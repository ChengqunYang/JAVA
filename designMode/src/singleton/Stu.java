package singleton;

/**
 * ����ģʽ:����ʽ
 * @author DELL
 *
 */
public class Stu {
	private Stu() {
		
	}   
	//�����췽��˽�л�,�Ͳ�����new����Ķ�����
	private static Stu stu = new Stu();
	//��̬������һ��˽�ж���,��̬����ֻ��ִ��һ��,����ֻ������һ������
	public static Stu getInstance() {
		return stu;
	//����ֱ�ӵ��þ�̬�������������ڼ���ʱ���ɵ�Ψһ�Ķ���
	}
}