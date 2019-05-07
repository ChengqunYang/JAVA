package spring.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类:里面存放通知,增强
 * @author DELL
 *
 */
public class MyAspectXML {
	/**
	 * 前置通知
	 * @param joinpoint
	 */
	public void checkPri(JoinPoint joinpoint){
		System.out.println("权限校验..."+joinpoint);
	}
	/**
	 * 后置通知
	 */
	public void writelog(Object result){
		System.out.println("日志记录..."+result);
	}
	/**
	 * 环绕通知
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前通知...");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后通知...");
		return obj;
	}
	/**
	 * 异常抛出通知
	 */
	public void afterThrowing(Throwable ex){
		System.out.println("异常抛出通知..."+ex.getMessage());
	}
	/**
	 *最终通知:相当于finally代码块中的内容 
	 */
	public void after(){
		System.out.println("最终通知...");
	}
}
