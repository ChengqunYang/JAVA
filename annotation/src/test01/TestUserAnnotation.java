package test01;
	
	//测试使用自定义注解
public class TestUserAnnotation {
	@MyAnno01(timeout=100,c=java.util.Date.class,strs={"aaa","bbb"})
	public void test01() {
		//通过反射读取字节码上的注解信息
		
	}
}
