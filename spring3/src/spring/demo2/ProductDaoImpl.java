package spring.demo2;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void save() {
		System.out.println("������Ʒ...");
	}

	@Override
	public void update() {
		System.out.println("������Ʒ...");

	}

	@Override
	public void find() {
		System.out.println("������Ʒ...");
		//int i = 1 / 0;

	}

	@Override
	public String delete() {
		System.out.println("ɾ����Ʒ...");
		return "С��";

	}

}