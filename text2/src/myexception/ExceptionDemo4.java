package myexception;

import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 * �쳣�ķ��ࣺ
 * 			����ʱ�쳣:RuntimeException �������������ʱ���쳣���ڱ����ڼ��������ѡ������߲�����
 * 			����ʱ�쳣:��Exception �����࣬��RuntimeException�������ڱ���ʱ�ڱ��봦��
 *			
 *
 *����дһ�����������ܿ��Գɼ���������Գɼ��ķ�Χ��0����100֮ǰ�������������������쳣
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
	/*boolean flag = checkScore(-10);
	System.out.println(flag);*/
		checkScore(111);
	}
	/*public static boolean checkScore(int score) {
		//�жϳɼ��Ƿ���Ϸ�Χ������������򷵻�false
		if(score < 0 || score >100) {
			return false;
		}
		//����
		return true;
	} */
	public static void checkScore(int score) {
		if(score < 0 || score >100){
			throw new RuntimeException("���Գɼ�������Ҫ��");
		}
		System.out.println("���Գɼ�����Ҫ��");
	}
 }
