package di.basic2;

public class Car {

	private Tire tire;

	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}

	// 생정자 주입
	// DI 주입
	public Car(HankookTire hankookTire) {
		System.out.println("Car(HankookTire hankookTire) 생성자 입니다.");
		this.tire = hankookTire;
	}

	public Tire getTire() {
		return tire;
	}

	// setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("장착한 타이어 브랜드는 " + this.tire.getTireBrand());
	}
}
