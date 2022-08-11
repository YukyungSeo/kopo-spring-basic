package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext("di.xml01.xml");
		Car car = (Car) context.getBean("car");
		Tire hankook = (HankookTire) context.getBean("hankook");
//		Tire kumho = (KumhoTire) context.getBean("kumho");
		
		car.setTire(hankook);
//		car.setTire(kumho);
		
		car.printTireBrand();
	}
}
