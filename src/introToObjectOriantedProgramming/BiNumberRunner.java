package introToObjectOriantedProgramming;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumbers numbers = new BiNumbers(2, 3);
		System.out.println(numbers.Add());
		System.out.println(numbers.Multiply());
		numbers.Double();
		System.out.println(numbers.GetNumberOne());
		System.out.println(numbers.GetNumberTwo());

	}

}
