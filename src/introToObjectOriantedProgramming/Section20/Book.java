package introToObjectOriantedProgramming.Section20;

import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;
    private List<Review> reviews;

    public Book(int id, String name, String Author) {
        this.id = id;
        this.name = name;
        this.author = Author;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public String toString(){
        return String.format("id - %s, name - %s, author - %s, Reviews - [%s]", this.id, this.name, this.author, this.reviews);
    }
}
