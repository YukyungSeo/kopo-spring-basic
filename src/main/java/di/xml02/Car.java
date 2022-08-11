package di.xml02;

import java.util.List;

public class Car {

	private Tire tire;
	private String msg;
	private String error;
	private int num;
	private List<String> list;

	public Car() {
		System.out.println("Car() 생성자 입니다.");
	}

	// 생정자 주입
	// DI 주입
	public Car(HankookTire hankookTire) {
		System.out.println("Car(HankookTire hankookTire) 생성자 입니다.");
		this.tire = hankookTire;
	}

	public Car(Tire tire, String msg) {
		System.out.println("Car(Tire tire, String msg) 생성자 입니다.");
		this.tire = tire;
		this.msg = msg;
	}

	public Car(String error, Tire tire) {
		System.out.println("Car(String error, Tire tire) 생성자 입니다.");
		this.error = error;
		this.tire = tire;
	}

	public Car(int num, String msg) {
		System.out.println("Car(int num, String msg) 생성자 입니다.");
		this.num = num;
		this.msg = msg;
	}

	public Car(List<String> list) {
		System.out.println("Car(List<String> list) 생성자 입니다.");
		this.list = list;
	}

	// setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	// print
	public void printTireBrand() {
		if (tire != null) {
			System.out.println("장착한 타이어 브랜드는 " + this.tire.getTireBrand());
		}
	}

	public void printMsg() {
		System.out.println("메세지 : " + msg);
	}

	public void printError() {
		System.out.println("error : " + error);
	}

	public void printNum() {
		System.out.println("num : " + num);
	}

	public void printList() {
		if (list != null) {
			System.out.println(list.toString());
		}
	}
}
