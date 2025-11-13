package app.books;

import app.books.observer.AllBooksSubject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BooksApplication {

    @Bean
    public AllBooksSubject allBooksSubject() {
        return new AllBooksSubject();
    }

    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);
    }
}
