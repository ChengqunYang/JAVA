package text2;

/*
 * 篮球运动员和教练
 * 乒乓球运动员和教练
 * 现在篮球运动员和教练要出国访问，需要学习英语
 * 请根据你所学的知识，分析出来那些是类那些是抽象类那些是接口
 */
public class InterfaceCase {
	public static void main(String[] args) {
		//创建篮球员动员对象
		BasketballPlayer bbp = new BasketballPlayer();
		bbp.name = "姚明";
		bbp.age = 35;
		bbp.gender = "男";
		bbp.eat();
		bbp.sleep();
		bbp.speak();
		bbp.study();
		//创建篮球教练对象
		BasketBallCoach bbc = new BasketBallCoach();
		bbc.name = "王篮球教练";
		bbc.age = 40;
		bbc.gender = "男";
		bbc.eat();
		bbc.sleep();
		bbc.speak();
		bbc.teach();
		//创建乒乓球运动员
		PingpangPlayer ppp = new PingpangPlayer();
		ppp.name = "张继科";
		ppp.age = 20;
		ppp.gender = "男";
		ppp.eat();
		ppp.sleep();
		ppp.study();
		//创建乒乓球教练对象
		PingpangCoach ppc = new PingpangCoach();
		ppc.name = "刘胖子";
		ppc.age = 40;
		ppc.gender = "男";
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
		 System.out.println("吃饭");
	 }
	 public void sleep(){
		 System.out.println("睡觉");
	 }
}
abstract class Player extends Person{
	//学习
	public abstract void study();
}
abstract class Coach extends Person{
	public abstract void teach();
}
class BasketballPlayer extends Player implements SpeakEnglish {

	@Override
	public void study() {
		System.out.println("学扣篮");
		
	}

	@Override
	public void speak() {
		System.out.println("说英语");
		
	}
	
}
class PingpangPlayer extends Player {

	@Override
	public void study() {
		System.out.println("学抽球");
		
	}
	
}
class BasketBallCoach extends Coach implements SpeakEnglish {

	@Override
	public void teach() {
		System.out.println("教扣篮");
	}

	@Override
	public void speak() {
		System.out.println("说英语");
		
	}
	
}
class PingpangCoach extends Coach {

	@Override
	public void teach() {
		System.out.println("教抽球");
		
	}
	
}
interface SpeakEnglish {
	public abstract void speak();
}