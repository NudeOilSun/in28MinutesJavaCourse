package introToObjectOriantedProgramming;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber mynumber = new MyNumber(9);
		System.out.println("Is Prime Result - " + mynumber.isPrime());
		System.out.println("sumUpToN Result - " + mynumber.sumUpToN());
		System.out.println("sumUpDivsors Result - " + mynumber.sumOfDivsors());
		mynumber.printANumberTriangle();

	}

}
