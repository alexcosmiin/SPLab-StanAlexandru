package app.command;

import app.model.Book;
import app.service.BooksService;

public class GetBookByIdCommand implements Command {
    private final BooksService service;
    private final int id;

    public GetBookByIdCommand(BooksService service, int id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Executing GetBookByIdCommand...");
        Book book = service.getById(id);
        if (book != null) {
            book.print();
        } else {
            System.out.println("Book not found.");
        }
    }
}
