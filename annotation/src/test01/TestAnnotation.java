package test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestAnnotation {
	
	//����ע��ĺ���Ϊ����ǰ�����ķ�������д����ķ���
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	//����ע��ĺ���Ϊ����ǰ�����ķ�����һ�����Է���
	@Test
	public void test01(){
		
		//����ע��ĺ���Ϊ:��ǰ��������û�б�ʹ�ã����Ʊ���������������Ϣ
		@SuppressWarnings("unused")
		int i;
		
		//����ע��ĺ���Ϊ: ���Ʊ���������������Ϣ(�������δʹ�û���δ��ѭ���͸�ʽ����Ĳ�������)
		@SuppressWarnings({ "unused", "rawtypes" })
		List a = new ArrayList();
	}
	
	
	//����ע��ĺ���Ϊ����ǰ�����ķ����ǹ�ʱ�ķ�����������ʹ��
	@Deprecated
	public void  test02() {
		
	}
	
	//����ע��ĺ���Ϊ�������ǰ������ִ��ʱ�䳬��һ��,�ᱨ��
	@Test(timeout=1000)
	public void test03() {
		
	}
}
