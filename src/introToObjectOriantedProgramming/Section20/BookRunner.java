package introToObjectOriantedProgramming.Section20;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1, "A Court of Thorn and Roses", "SJJ Mass");

        book.addReview(new Review(1, "so good", 10));

        System.out.println((book.toString()));

    }

}
