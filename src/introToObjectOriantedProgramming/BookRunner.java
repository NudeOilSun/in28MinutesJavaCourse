package introToObjectOriantedProgramming;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(10);
		Book effectoiveJava = new Book(20);
		Book cleanCode = new Book(30);

		artOfComputerProgramming.SetNumberOfCopies(1);
		effectoiveJava.SetNumberOfCopies(2);
		cleanCode.SetNumberOfCopies(3);

	}

}
