package decorator;

/**
 * ��googlecar���ܵ���ǿ
 * ����Ҫ��car��ʲô���ӵ�?
 * @author DELL
 *
 */
public class MyCar implements Icar{

	
	Icar car;
	public MyCar(Icar car) {
		this.car = car;
	}
	
	@Override
	public void start() {
		System.out.println("��������Ƿ�����");
		System.out.println("���·���Ƿ�����");
		car.start();
		
	}

	@Override
	public void run() {
		car.run();
	}

	@Override
	public void stop() {
		car.stop();
	}

}