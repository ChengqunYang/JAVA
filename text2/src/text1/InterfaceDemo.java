package text1;

/*
 * �����ࣺ�̳й�ϵ����һ�̳У����̳�
 * ����ӿڣ�ʵ�ֹ�ϵ����ʵ��
 * �ӿ���ӿڹ�ϵ���̳й�ϵ����̳�
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.function();
		d.method();
		d.methodC();
	}
}
interface InterA{
	public abstract void method();
	
}
interface InterB{
	public abstract void function();
	
}
interface InterC extends InterB,InterA{
	public abstract void methodC();
}

class Demo implements InterC{

	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("���ǽӿ�InterB�ĺ�����д");
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("���ǽӿ�InterA�ĺ�����д");		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("���ǽӿ�InterC�ĺ�����д");
	}

}