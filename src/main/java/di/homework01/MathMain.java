package di.homework01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MathMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext("di.homework01.xml");
		
		MyCalculator myCalculator1 = (MyCalculator) context.getBean("myCalculator1");
		myCalculator1.printCalBrandName();
		myCalculator1.add();
		myCalculator1.sub();
		myCalculator1.mul();
		myCalculator1.divide();
		
		MyCalculator myCalculator2 = (MyCalculator) context.getBean("myCalculator2");
		myCalculator2.printCalBrandName();
		myCalculator2.add();
		myCalculator2.sub();
		myCalculator2.mul();
		myCalculator2.divide();
	}
}
