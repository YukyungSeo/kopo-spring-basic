package di.basic;

public class DriverMain {

	public static void main(String[] args) {

		// 타이어 설정. 생성
		HankookTire hankookTire = new HankookTire();

		// 생성자 주입
		Car car = new Car(hankookTire);
		
		// setter 주입
//		Car car = new Car();
//		car.setHankookTire(hankookTire);

		car.printTireBrand();

	}
}
