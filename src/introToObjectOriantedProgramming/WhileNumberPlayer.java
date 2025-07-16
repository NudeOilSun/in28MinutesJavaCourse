package introToObjectOriantedProgramming;

import java.util.Scanner;

public class WhileNumberPlayer {
	int limit;

	WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	void printSquaresUpToLimit() {
		int value = 1;

		while (value * value <= this.limit) {

			System.out.println(value * value);
			value++;
		}
	}

	void cubeNumberCheck() {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		do {
			System.out.print("Please enter a number: ");
			number = scanner.nextInt();

			if (number >= 0) {
				System.out.println("Cubed - " + (number * number * number));
			}
		} while (number >= 0);

		System.out.println("goodbye");

		scanner.close();
	}

}
