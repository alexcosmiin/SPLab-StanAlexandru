package app.command;

import app.model.Book;
import app.service.BooksService;

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
