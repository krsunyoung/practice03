package prob6;

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
			if ("quit".equals(expression) == true) {
				break;
			}

			String[] tokens = expression.split(" ");
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			Arith arith = null;

			switch (operator) {
			case "+": {
				arith = new Add();
				break;
			}
			case "-": {
				arith = new Sub();
				break;
			}
			case "*": {
				arith = new Mul();
				break;
			}
			case "/": {
				arith = new Div();
				break;
			}
			default: {

				break;
			}
			}
			if (arith == null) {
				System.out.println(">> 알수 없는 연산입니다.");
				continue;
			}

			arith.setValue(a, b);
			int result = arith.calculate();
			System.out.println(">> " + result);
			/*
			 * switch(op){ case "+"; add a = new Add(); }
			 */

		}
		scanner.close();
	}
}
