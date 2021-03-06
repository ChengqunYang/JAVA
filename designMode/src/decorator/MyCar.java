package decorator;

/**
 * 对googlecar功能的增强
 * 我想要的car是什么样子的?
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
		System.out.println("检查天气是否良好");
		System.out.println("检查路况是否良好");
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
