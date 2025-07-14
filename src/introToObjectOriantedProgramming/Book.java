package introToObjectOriantedProgramming;

public class Book {
	int numberOfCopiesOfBook;

	Book(int numberOfCopiesOfBook) {
		this.numberOfCopiesOfBook = numberOfCopiesOfBook;
	}

	public void SetNumberOfCopies(int copies) {
		if (copies > 0)
			this.numberOfCopiesOfBook = copies;
	}

	public void increaseNumberOfCopies(int copies) {
		SetNumberOfCopies(this.numberOfCopiesOfBook + copies);
	}

	public void decreaseNumberOfCopies(int copies) {
		SetNumberOfCopies(this.numberOfCopiesOfBook - copies);
	}
}
