package test02;

import java.lang.reflect.Method;

public class MyJunit {

	public static void main(String[] args) throws Exception {
		//加载UserDao.class字节码文件中的方法,判断哪些方法上面有自定义的注解@MyTest,如果当前的方法有@MyTest,执行,否则不执行

		//1.将UserDao.class字节码文件加载到内存,class对象(代表字节码文件在内存中的对象)
		Class clazz = Class.forName("test02.UserDao");
		
		//2.获取字节码对象上所有的方法,返回method数组对象,数组中的每一个元素都代表Method对象(相当于字节码上的每一个方法)
		Method[] msd = clazz.getMethods();
		//3.遍历字节码对象上的所有的方法
		for (Method md : msd) {
			//测试方法的名称
			//System.out.println(md.getName());
			
			//判断当前方法上是否有@MyTest注解信息
			//md.isAnnotationPresent(MyTest.class);
			
			
			if(md.isAnnotationPresent(MyTest.class)) {
				//如果当前的方法上有@MyTest注解,执行,否则忽略
				md.invoke(new UserDao());//反射方法
			}
		}
		
	}
	
}
