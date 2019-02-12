package pattern.builder;

import com.google.common.base.Preconditions;

import java.util.Optional;
import java.util.StringJoiner;

public class Book {

    private String name;
    private String author;
    private double price;

    private int numberOfPages;
    private int isbnNumber;
    private boolean isPocketBook;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Optional<Integer> getNumberOfPages() {
        return Optional.of(numberOfPages);
    }

    public Optional<Integer> getIsbnNumber() {
        return Optional.of(isbnNumber);
    }

    public Optional<Boolean> isPocketBook() {
        return Optional.of(isPocketBook);
    }

    protected Book(BookBuilder builder) {
        Preconditions.checkArgument(builder.name != null, "Book name cannot be null");
        Preconditions.checkArgument(builder.author != null);
        Preconditions.checkArgument(builder.price > 0);
        this.name = builder.name;
        this.author = builder.author;
        this.price = builder.price;
        this.numberOfPages = builder.numberOfPages;
        this.isbnNumber = builder.isbnNumber;
        this.isPocketBook = builder.isPocketBook;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("author='" + author + "'")
                .add("price=" + price)
                .add("numberOfPages=" + numberOfPages)
                .add("isbnNumber=" + isbnNumber)
                .add("isPocketBook=" + isPocketBook)
                .toString();
    }
}
