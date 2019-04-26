package dynamicagent;

/**
 * 谷歌汽车开发人员实现的类
 * 因为是final类型的所有无法被继承
 * @author DELL
 *
 */
public  final class GoogleCar implements Icar{

	@Override
	public void start() {
		System.out.println("控制谷歌的汽车启动");
		//相当于调用谷歌提供的c语言函数
	}

	@Override
	public void run() {
		System.out.println("控制谷歌汽车的运行");
	}

	@Override
	public void stop() {
		System.out.println("控制谷歌汽车的停止");
	}
	

}
