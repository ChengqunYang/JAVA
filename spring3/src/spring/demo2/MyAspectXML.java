package spring.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ������:������֪ͨ,��ǿ
 * @author DELL
 *
 */
public class MyAspectXML {
	/**
	 * ǰ��֪ͨ
	 * @param joinpoint
	 */
	public void checkPri(JoinPoint joinpoint){
		System.out.println("Ȩ��У��..."+joinpoint);
	}
	/**
	 * ����֪ͨ
	 */
	public void writelog(Object result){
		System.out.println("��־��¼..."+result);
	}
	/**
	 * ����֪ͨ
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("����ǰ֪ͨ...");
		Object obj = joinPoint.proceed();
		System.out.println("���ƺ�֪ͨ...");
		return obj;
	}
	/**
	 * �쳣�׳�֪ͨ
	 */
	public void afterThrowing(Throwable ex){
		System.out.println("�쳣�׳�֪ͨ..."+ex.getMessage());
	}
	/**
	 *����֪ͨ:�൱��finally������е����� 
	 */
	public void after(){
		System.out.println("����֪ͨ...");
	}
}
