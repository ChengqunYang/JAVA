package decorator;

public class TestCar {
	public static void main(String[] args) {
		Icar car = new GoogleCar();
		car.start();
		car.run();
		car.stop();
	}
}
