package singleton;

/**
 * ����ģʽ:����ʽ
 * @author DELL
 *
 */
public class Stu01 {
	private Stu01() {
		
	}
	//�����췽��˽�л�,�Ͳ�����new����Ķ�����
	private static Stu01 stu01;
	//����һ��˽�еľ�̬����   
	public static Stu01 getInstance() {
		if(stu01 == null){
			stu01 = new Stu01();
		}
		return stu01;
	}
	//����ֱ�ӵ��þ�̬��������,�ж���ǰ�����stu01�Ƿ�Ϊ��,���Ϊ����ônewһ���������������,�����Ϊ����ֱ�ӷ���
}