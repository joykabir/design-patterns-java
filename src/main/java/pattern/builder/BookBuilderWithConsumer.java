package pattern.builder;

import java.util.function.Consumer;

public class BookBuilderWithConsumer {
    public String name;
    public String author;
    public double price;
    public int numberOfPages;
    public int isbnNumber;
    public boolean isPocketBook;

    public BookBuilderWithConsumer with(Consumer<BookBuilderWithConsumer> builderFunction){
        builderFunction.accept(this);
        return this;
    }

    // Uncomment when testing and change Books constructor signature.
//    public Book build(){
//        return new Book(this);
//    }
}
