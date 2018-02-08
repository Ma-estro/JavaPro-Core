package ru.unlimit.javapro.lab23_this;

public class MyApp {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		
		car.change_speed(20);
		System.out.println(car);
		
		Car car3 = new Car("Volga", 5);
		System.out.println(car3);
	}
}

class Car{
	
	String name;
	int speed;
	
	public Car(){
//		this.name="Default";
//		this.speed=0;
		this("Default",0);
	}
	
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + "]";
	}
	
	public void change_speed(int delta){
		int speed=-100;
		this.speed+=delta;
	}
}