package text1;

/*
 * ��������ص㣺
 * 		���󷽷�ֻ���ڳ��󷽷���
 * 		������ͳ��󷽷����뱻abstract����
 * 		�����಻�ܴ�������(����ʵ����)
 * 		�������п����зǳ���ķ���
 * 		���������Ĺ�ϵҲ�Ǽ̳�
 * 		һ����̳��˳����࣬Ҫô��д���еĳ��󷽷�,Ҫô��Ҳ��һ��������
 */
public class AbstractTest {
	public static void main(String[] args) {
		//Anmial a = new Animal();
	}

}
abstract class Animal {
	public abstract void eat();
	public void run(){
	
	}
}
class Cat extends Animal{

	@Override   //ע�� ������������ǶԸ��෽������д
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}