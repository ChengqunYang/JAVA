package text1;
/*
 * 
 * �ӿڵĳ�Ա�ص㣺
 * 		ֻ���г��󷽷�
 * 		Ĭ��ʹ��abstract��public���η���
 * 		ֻ����abstract��public���η���
 * 		�ӿ���ֻ���г�����Ĭ��ʹ��public final static���Σ�
 * �ӿڲ��ܴ������󣨲���ʵ������
 * ��ͽӿڵĹ�ϵ��ʵ�ֹ�ϵ��һ����ʵ��һ���ӿڱ���ʵ�������еķ���
 */
public class InterfaceTest {
	public static void main(String[] args) {
		//Animal a = new Animal();
		Cat1 a = new Cat1();
		a.eat();
	}
}

interface Animal1 {
	public abstract void eat();
}
class Cat1 implements Animal1 {

	@Override
	public void eat() {
	System.out.println("��");
	}
	
}