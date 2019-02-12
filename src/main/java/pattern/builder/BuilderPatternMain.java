package pattern.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Builder pattern with Null safety
*/
public class BuilderPatternMain {
    private static Logger log = LoggerFactory.getLogger(BuilderPatternMain.class);

    public static void main(String[] args) {
        // Using traditional ways
        Book book = BookBuilder.create()
                .setAuthor("Nazrul")
                .setName("Sanchita")
                .setPrice(100.49)
                .build();
        System.out.println(book.toString());

        // Using consumer
        /*
        Book book = new BookBuilderWithConsumer().with(bookBuilderWithConsumer -> {
            bookBuilderWithConsumer.author = "ZIAUL";
            bookBuilderWithConsumer.name = "Sanchita";
            bookBuilderWithConsumer.price = 100;
        }).build();
        System.out.println(book.toString());
        */
    }
}
