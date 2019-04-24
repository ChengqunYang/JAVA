package test02;

import java.lang.reflect.Method;

public class MyJunit {

	public static void main(String[] args) throws Exception {
		//����UserDao.class�ֽ����ļ��еķ���,�ж���Щ�����������Զ����ע��@MyTest,�����ǰ�ķ�����@MyTest,ִ��,����ִ��

		//1.��UserDao.class�ֽ����ļ����ص��ڴ�,class����(�����ֽ����ļ����ڴ��еĶ���)
		Class clazz = Class.forName("test02.UserDao");
		
		//2.��ȡ�ֽ�����������еķ���,����method�������,�����е�ÿһ��Ԫ�ض�����Method����(�൱���ֽ����ϵ�ÿһ������)
		Method[] msd = clazz.getMethods();
		//3.�����ֽ�������ϵ����еķ���
		for (Method md : msd) {
			//���Է���������
			//System.out.println(md.getName());
			
			//�жϵ�ǰ�������Ƿ���@MyTestע����Ϣ
			//md.isAnnotationPresent(MyTest.class);
			
			
			if(md.isAnnotationPresent(MyTest.class)) {
				//�����ǰ�ķ�������@MyTestע��,ִ��,�������
				md.invoke(new UserDao());//���䷽��
			}
		}
		
	}
	
}