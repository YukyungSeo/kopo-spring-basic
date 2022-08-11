package di.homework01;

public class LGCalculator implements Calculator {

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double sub(double num1, double num2) {
		return num1 - num2;
	}

	public double mul(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		}

		return 0;
	}

	public String getBrandName() {
		return "LG계산기";
	}

}
