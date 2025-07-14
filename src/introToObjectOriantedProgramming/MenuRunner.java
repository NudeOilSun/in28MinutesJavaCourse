package introToObjectOriantedProgramming;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number 1:");
		int number1 = scanner.nextInt();

		System.out.println("The number you have enetred is - " + number1);

		System.out.print("Enter Number 2:");
		int number2 = scanner.nextInt();

		System.out.println("The number you have enetred is - " + number2);

		System.out.println("Choose operator:");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		int operatorNumber = scanner.nextInt();
		System.out.println("Choice - " + operatorNumber);
		performOperationUsingNestedSwitchStatement(number1, number2, operatorNumber);

	}

	private static void performOperationUsingNestedSwitchStatement(int number1, int number2, int operatorNumber) {
		switch (operatorNumber) {
		case 1:
			System.out.println("Result - " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result - " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result - " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result - " + (number1 * number2));
			break;
		default:
			System.out.println("invalid selection");

		}
	}

}
