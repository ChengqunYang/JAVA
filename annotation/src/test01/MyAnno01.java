package test01;

public @interface MyAnno01 {
	//��ע���ж���һ������
	public long timeout() default -1;
	
	public String[] strs();
	
	public Class c() default java.util.Date.class;
	//only primitive type, String, Class, annotation, enumeration are permitted or 1- dimensional arrays thereof
	//����,ԭ�������Բ�֧���Զ���������
	//public TestAnnotation aa();
	//ע�������֧�ֵ�������:������������(4��8��),String,Class,Annotation(ע������),ö������,�Լ��������͵�һά��������
	
	
}