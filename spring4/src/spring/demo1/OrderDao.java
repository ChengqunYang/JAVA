package spring.demo1;

public class OrderDao {
	
	public void save(){
		System.out.println("���涩��...");
	}
	public void update(){
		System.out.println("�޸Ķ���...");
	}
	public void find(){
		System.out.println("���Ҷ���...");
		//int d = 1/0;
	}
	public String delete(){
		System.out.println("ɾ������...");
		return "С��";
	}
	
}