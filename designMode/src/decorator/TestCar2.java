package decorator;

public class TestCar2 {
	public static void main(String[] args) {
		Icar car = new MyCar(new GoogleCar());
		car.start();
		car.run();
		car.stop();
	}
}
