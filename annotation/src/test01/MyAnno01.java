package test01;

public @interface MyAnno01 {
	//在注解中定义一个属性
	public long timeout() default -1;
	
	public String[] strs();
	
	public Class c() default java.util.Date.class;
	//only primitive type, String, Class, annotation, enumeration are permitted or 1- dimensional arrays thereof
	//报错,原因是属性不支持自定义类类型
	//public TestAnnotation aa();
	//注解的属性支持的类型有:基本数据类型(4类8种),String,Class,Annotation(注解类型),枚举类型,以及以上类型的一维数组类型
	
	
}
