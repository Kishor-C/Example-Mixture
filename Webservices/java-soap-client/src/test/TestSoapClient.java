package test;

import com.examples.Calculator;
import com.examples.CalculatorImplService;

public class TestSoapClient {

	public static void main(String[] args) {
		CalculatorImplService service = new CalculatorImplService();
		Calculator c = service.getCalculatorImplPort();
		int r1 = c.add(30, 40);
		int r2 = c.sub(20, 5);
		System.out.println("r1 = "+r1+", r2 = "+r2);
	}

}
