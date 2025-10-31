package app.books.legacy.command;

import app.books.legacy.model.Book;
import app.books.legacy.service.BooksService;

public class UpdateBookCommand implements Command {
    private final BooksService service;
    private final int id;
    private final String title;
    private final String author;

    public UpdateBookCommand(BooksService service, int id, String title, String author) {
        this.service = service;
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public void execute() {
        System.out.println("Executing UpdateBookCommand...");
        Book updated = service.update(id, title, author);
        if (updated != null) {
            System.out.println("Book updated: " + updated.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}
