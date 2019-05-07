package spring.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ������:ע���������
 * @author DELL
 *
 */
//������ʶ��Ϊһ������
@Aspect
public class MyAspectAnno {
	
	//�����ע��:
	@Pointcut(value="execution(* spring.demo1.OrderDao.find(..))")
	private void pointcut1(){}
	
	//ǰ��֪ͨ
	@Before(value="execution(* spring.demo1.OrderDao.save(..))" )
	public void before(){
		System.out.println("ǰ����ǿ...");
	}
	//����֪ͨ
	@AfterReturning(value="execution(* spring.demo1.OrderDao.delete(..))",returning="result")
	public void afterReturning(Object result){
		System.out.println("������ǿ..."+result);
	}
	//����֪ͨ
	@Around(value="execution(* spring.demo1.OrderDao.update(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("����ǰ��ǿ...");
		Object obj = joinPoint.proceed();
		System.out.println("���ƺ���ǿ...");
		return obj;
	}
	//�쳣�׳�֪ͨ
	@AfterThrowing(value="MyAspectAnno.pointcut1()",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("�쳣�׳���ǿ..."+e.getMessage());
	}
	//����֪ͨ
	@After(value="MyAspectAnno.pointcut1()")
	public void after(){
		System.out.println("����֪ͨ...");
	}
	
}