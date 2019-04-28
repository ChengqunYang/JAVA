package dynamicagent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ��Ϊװ����ģʽ�б׶�(��һ����װ�ε����кܶ෽��ʱһ��һ��ʵ�ֺ��鷳)
 * �������ǲ��ö�̬����ģʽ(�����ֶ�����jdk���ڴ��ﴴ��װ����)
 * 
 */
import java.lang.reflect.Proxy;

public class TestCar {
	public static void main(String[] args) {
		
		/**
		 * �ֽ����������jdk����һЩ����ר�Ž������ֽ����ļ����ص��ڴ棬���������Ϊ�ֽ��������
		 * ��ν��ֽ����ļ�.class�ļ����ص��ڴ棿
		 * �ײ�ʵ�ֹ���:����io����������ȡ���ļ��е����ݼ��ص��ڴ�
		 * �ֽ���������������������
		 * 		�����������������String.class,int.class���ֽ����ļ���ҪƵ���ı����ص��ڴ棬�ٶȱ���죬�ײ�����������ʵ�֣�C,C++��
		 * 		��չ���������extension
		 * 		Ӧ������������Լ�д�� �� �ļ�����    ����Աʵ�ֵ����е��඼����Ӧ����
		 * 	ʹ�ã���.class.getClassLoader()
		 */
		
		/**
		 * ��һ������: �̶�ֵ,������������ĸ��ֽ�������������ڴ��д��������ֽ����ļ�
		 * �ڶ�������: ���������,�ڴ������ڱ��������ֽ����ļ���Ӧ������Щ����
		 * ����������: ������������ڱ��������ֽ����ϵĸ����������������
		 */
		//������������
		Icar car = (Icar) Proxy.newProxyInstance(TestCar.class.getClassLoader(), GoogleCar.class.getInterfaces(), new InvocationHandler(){
			//method:��������ִ�еķ���
			//args:��������ִ�еķ����еĲ���
			//object:��������ִ�����֮��ķ���ֵ.
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//method������ǰ����ִ�е�ÿ������
				//object ����ÿ������ִ���귵�صĶ���
				if(method.getName().equalsIgnoreCase("start")){
					System.out.println("��������Ƿ�����");
					method.invoke(new GoogleCar(), args);
					System.out.println("���·���Ƿ�ӵ��");
				}else{
					method.invoke(new GoogleCar(), args);
				}
	
				return null;
			}
		});
		car.start();
		car.run();
		car.stop();
	}
}