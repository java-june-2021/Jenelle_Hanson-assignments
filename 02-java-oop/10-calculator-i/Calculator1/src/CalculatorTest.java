public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculate = new Calculator(10.5, "+", 5.2);

		calculate.performOperation();
		calculate.getResults();
	}

}
