package test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestAnnotation {
	
	//以下注解的含义为：当前声明的方法是重写父类的方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	//以下注解的含义为：当前声明的方法是一个测试方法
	@Test
	public void test01(){
		
		//以下注解的含义为:当前声明变量没有被使用，抑制编译器发生警告信息
		@SuppressWarnings("unused")
		int i;
		
		//以下注解的含义为: 抑制编译器发生警告信息(如果变量未使用或者未遵循泛型格式错误的不报警告)
		@SuppressWarnings({ "unused", "rawtypes" })
		List a = new ArrayList();
	}
	
	
	//以下注解的含义为：当前声明的方法是过时的方法不建议大家使用
	@Deprecated
	public void  test02() {
		
	}
	
	//以下注解的含义为：如果当前方法的执行时间超过一秒,会报错
	@Test(timeout=1000)
	public void test03() {
		
	}
}
