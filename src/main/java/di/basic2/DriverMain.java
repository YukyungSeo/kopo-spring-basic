package di.basic2;

public class DriverMain {

	public static void main(String[] args) {

//		Tire hankook = new HankookTire();
		Tire kumho = new KumhoTire();
		
		Car car = new Car();
		car.setTire(kumho);
		
		car.printTireBrand();
	}
}
