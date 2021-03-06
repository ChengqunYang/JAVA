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
 * 切面类:注解的切面类
 * @author DELL
 *
 */
//将该类识别为一个切面
@Aspect
public class MyAspectAnno {
	
	//切入点注解:
	@Pointcut(value="execution(* spring.demo1.OrderDao.find(..))")
	private void pointcut1(){}
	
	//前置通知
	@Before(value="execution(* spring.demo1.OrderDao.save(..))" )
	public void before(){
		System.out.println("前置增强...");
	}
	//后置通知
	@AfterReturning(value="execution(* spring.demo1.OrderDao.delete(..))",returning="result")
	public void afterReturning(Object result){
		System.out.println("后置增强..."+result);
	}
	//环绕通知
	@Around(value="execution(* spring.demo1.OrderDao.update(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前增强...");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后增强...");
		return obj;
	}
	//异常抛出通知
	@AfterThrowing(value="MyAspectAnno.pointcut1()",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("异常抛出增强..."+e.getMessage());
	}
	//最终通知
	@After(value="MyAspectAnno.pointcut1()")
	public void after(){
		System.out.println("最终通知...");
	}
	
}
