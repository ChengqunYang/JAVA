package text1;

import java.util.ArrayList;
import java.util.Collection;
/*
 * foreach:��ǿforѭ����һ�����ڱ������ϻ�������
 * ����ǿforѭ���в����޸ļ��ϣ��������ֲ����޸��쳣����Ϊ�䱾�ʾ��ǵ�����
 * ��ʽ��
 * 		for(Ԫ�����ͱ��������ϻ����������) {
 * 			����ֱ��ʹ�ñ���;
 */

public class ForEachDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection<String> c = new ArrayList<String>();
		
		//���Ԫ��
		c.add("hello");
		c.add("world");
		c.add("java");
		//��ǿforѭ����������
		for(String s : c){
			System.out.println(s.length());
			System.out.println(s.toUpperCase());
		}
	}
}
