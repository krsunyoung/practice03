package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.
		// 제약조건 숫자+" "+"+"+" "+정수 엔터 이런형태로 받을수 있게끔.
		// 20 + 30 엔터
		// lvalue operator rvalue
		// readline으로 읽는다.

		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.print(">>");
			String expression = scanner.nextLine();

			if ("quit".equals(expression)) {
				break;
			}
			
			String[] tokens = expression.split(" "); // 스페이스로 분리하겠다.
			int lValue = Integer.parseInt(tokens[0]);
			String operator = tokens[1];

			int rValue = Integer.parseInt(tokens[2]);

			/*
			 * System.out.println(lValue); System.out.println(operator);
			 * System.out.println(rValue);
			 */

			switch (operator) {
			case "+": {
				Add add = new Add();
				Add.setValue(lValue, rValue);
				// result = lValue + rValue;
				System.out.println(add.result());
				break;
			}
			case "-":
				Sub sub = new Sub();
				sub.setValue(lValue, rValue);
				System.out.println(sub.result());
				// result = lValue - rValue;
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(lValue, rValue);
				System.out.println(mul.result());
				// result = lValue * rValue;
				break;
			case "/":
				Div div = new Div();
				div.setValue(lValue, rValue);
				System.out.println(div.result());
				// result = lValue * rValue;
				// result = lValue / rValue;
				break;
			default:

				break;
			}
			//
			// System.out.println(lValue +" "+ operator+" "+ rValue);
			// System.out.println( result );
			//
		}

		/*
		 * switch(op){ case "+"; add a = new Add(); }
		 */

		scanner.close();
	}

}
