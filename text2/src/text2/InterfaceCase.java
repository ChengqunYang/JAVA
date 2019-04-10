package text2;

/*
 * �����˶�Ա�ͽ���
 * ƹ�����˶�Ա�ͽ���
 * ���������˶�Ա�ͽ���Ҫ�������ʣ���ҪѧϰӢ��
 * ���������ѧ��֪ʶ������������Щ������Щ�ǳ�������Щ�ǽӿ�
 */
public class InterfaceCase {
	public static void main(String[] args) {
		//��������Ա��Ա����
		BasketballPlayer bbp = new BasketballPlayer();
		bbp.name = "Ҧ��";
		bbp.age = 35;
		bbp.gender = "��";
		bbp.eat();
		bbp.sleep();
		bbp.speak();
		bbp.study();
		//���������������
		BasketBallCoach bbc = new BasketBallCoach();
		bbc.name = "���������";
		bbc.age = 40;
		bbc.gender = "��";
		bbc.eat();
		bbc.sleep();
		bbc.speak();
		bbc.teach();
		//����ƹ�����˶�Ա
		PingpangPlayer ppp = new PingpangPlayer();
		ppp.name = "�ż̿�";
		ppp.age = 20;
		ppp.gender = "��";
		ppp.eat();
		ppp.sleep();
		ppp.study();
		//����ƹ�����������
		PingpangCoach ppc = new PingpangCoach();
		ppc.name = "������";
		ppc.age = 40;
		ppc.gender = "��";
		ppc.eat();
		ppc.sleep();
		ppc.teach();
	}

}
class Person {
	 String name;
	 int age;
	 String gender;
	 
	 public Person(){ 
		 
	 }
	 public Person(String name,int age,String gender){
		 this.name = name;
		 this.age = age;
		 this.gender = gender;
	 }
	 public void eat(){
		 System.out.println("�Է�");
	 }
	 public void sleep(){
		 System.out.println("˯��");
	 }
}
abstract class Player extends Person{
	//ѧϰ
	public abstract void study();
}
abstract class Coach extends Person{
	public abstract void teach();
}
class BasketballPlayer extends Player implements SpeakEnglish {

	@Override
	public void study() {
		System.out.println("ѧ����");
		
	}

	@Override
	public void speak() {
		System.out.println("˵Ӣ��");
		
	}
	
}
class PingpangPlayer extends Player {

	@Override
	public void study() {
		System.out.println("ѧ����");
		
	}
	
}
class BasketBallCoach extends Coach implements SpeakEnglish {

	@Override
	public void teach() {
		System.out.println("�̿���");
	}

	@Override
	public void speak() {
		System.out.println("˵Ӣ��");
		
	}
	
}
class PingpangCoach extends Coach {

	@Override
	public void teach() {
		System.out.println("�̳���");
		
	}
	
}
interface SpeakEnglish {
	public abstract void speak();
}