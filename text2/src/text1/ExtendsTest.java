package text1;

public class ExtendsTest {
	public static void main(String[] args) {
		Son s = new Son();
		s.function();
		
	}
}
class Did{
	int num = 10;
	public Did(){
		System.out.println("���Ǹ����޲ι���");
		
	}
	public Did(int num){
		System.out.println("���Ǹ����вι���");
	}
	public void method(){
		System.out.println("���Ǹ���ķ���");
	}
}
class Son extends Did{
	int num = 30;
	public Son(){
		super(10);
		System.out.println("���������޲ι���");
	}
	public Son(int num){
		System.out.println("���������вι���");
	}
	public void method(){
		System.out.println("�������෽��");
	}
	public void function(){
		this.num = 50;
		System.out.println(num);
	}
}

