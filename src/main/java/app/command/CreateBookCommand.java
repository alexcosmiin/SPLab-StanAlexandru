package app.command;

import app.model.Book;
import app.service.BooksService;

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
