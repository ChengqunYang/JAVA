package test02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�Զ���ע��,�൱��Junit@Test

@Retention(RetentionPolicy.RUNTIME)  //ע���ע��(Ԫע��)
//����ע���ʱ��,��Ҫͨ��Ԫע��Retention˵����ǰ�Զ���ע���������(Class:����׶�,Source:Դ����׶�,Runtime:���н׶�)


@Target(ElementType.METHOD)
//����ע���ʱ��,��Ҫͨ��Ԫע��Target˵����ǰ���Զ���ע���Ŀ�����
public @interface MyTest {
	//��MyTestע���ж����Ա����,Ĭ��ֵΪ-1
	public long timeout() default -1;

}