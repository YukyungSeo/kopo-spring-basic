package di.homework01;

public class MyCalculator {

	private double firstNum;
	private double secondNum;
	private Calculator calculator;

	public MyCalculator() {
	}

	public MyCalculator(double firstNum, double secondNum, Calculator calculator) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}

	// getters & setters
	public double getFirstNum() {
		return firstNum;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	//methods
	public void add() {
		System.out.println(firstNum + " + " + secondNum + " = " + calculator.add(firstNum, secondNum));
	}

	public void sub() {
		System.out.println(firstNum + " - " + secondNum + " = " + calculator.sub(firstNum, secondNum));
	}

	public void mul() {
		System.out.println(firstNum + " * " + secondNum + " = " + calculator.mul(firstNum, secondNum));
	}

	public void divide() {
		System.out.println(firstNum + " / " + secondNum + " = " + calculator.divide(firstNum, secondNum));
	}

	public void printCalBrandName() {
		System.out.println("계산기의 브랜드는 " + calculator.getBrandName() + "입니다.");
	}
}
