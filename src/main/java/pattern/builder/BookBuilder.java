package pattern.builder;

public class BookBuilder {
    public String name;
    public String author;
    public double price;
    public int numberOfPages;
    public int isbnNumber;
    public boolean isPocketBook;

    public static BookBuilder create() {
        return new BookBuilder();
    }

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public BookBuilder setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public BookBuilder setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
        return this;
    }

    public BookBuilder setPocketBook(boolean isPocket) {
        this.isPocketBook = isPocket;
        return this;
    }

    public Book build() {
        return new Book(this);
    }
}