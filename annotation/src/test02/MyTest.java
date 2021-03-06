package test02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解,相当于Junit@Test

@Retention(RetentionPolicy.RUNTIME)  //注解的注解(元注解)
//定义注解的时候,需要通过元注解Retention说明当前自定义注解的作用域(Class:编译阶段,Source:源代码阶段,Runtime:运行阶段)


@Target(ElementType.METHOD)
//定义注解的时候,需要通过元注解Target说明当前的自定义注解的目标对象
public @interface MyTest {
	//在MyTest注解中定义成员属性,默认值为-1
	public long timeout() default -1;

}
