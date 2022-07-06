package obiektowe.exceptions;

public class Book {
    private String title;
    private int releaseYear;

    public Book(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
