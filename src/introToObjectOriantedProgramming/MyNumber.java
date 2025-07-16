package introToObjectOriantedProgramming;

public class MyNumber {
	int number;

	MyNumber(int number) {
		this.number = number;
	}

	public Boolean isPrime() {

		if (number < 2)
			return false;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= this.number; i++) {
			sum += i;
		}

		return sum;
	}

	public int sumOfDivsors() {
		int sum = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

	public void printANumberTriangle() {
		String printMe = "";
		for (int i = 1; i <= number; i++) {
			printMe += " " + i;
			System.out.println(printMe);
		}
	}

}
