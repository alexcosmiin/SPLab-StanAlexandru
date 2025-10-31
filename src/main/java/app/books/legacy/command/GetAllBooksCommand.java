package app.books.legacy.command;

import app.books.legacy.model.Book;
import app.books.legacy.service.BooksService;

public class GetAllBooksCommand implements Command {
    private final BooksService service;

    public GetAllBooksCommand(BooksService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.println("Executing GetAllBooksCommand...");
        for (Book book : service.getAll()) {
            book.print();
        }
    }
}
