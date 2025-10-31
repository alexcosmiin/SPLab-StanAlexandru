package app.books.legacy.command;

import app.books.legacy.model.Book;
import app.books.legacy.service.BooksService;

public class CreateBookCommand implements Command {
    private final BooksService service;
    private final String title;
    private final String author;

    public CreateBookCommand(BooksService service, String title, String author) {
        this.service = service;
        this.title = title;
        this.author = author;
    }

    @Override
    public void execute() {
        System.out.println("Executing CreateBookCommand...");
        Book book = service.create(title, author);
        System.out.println("Book created: " + book.getTitle());
    }
}
