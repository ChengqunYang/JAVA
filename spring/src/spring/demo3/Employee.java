package spring.demo3;

public class Employee {
	public String name;
	private Car2 car2;
	public void setName(String name) {
		this.name = name;
	}
	public void setCar2(Car2 car2) {
		this.car2 = car2;
	}
	@Override
	public String toString() {
		return "Empylee [name=" + name + ", car2=" + car2 + "]";
	}
	
}
