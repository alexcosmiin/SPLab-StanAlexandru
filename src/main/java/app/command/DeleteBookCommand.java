package app.command;

import app.service.BooksService;

public class DeleteBookCommand implements Command {
    private final BooksService service;
    private final int id;

    public DeleteBookCommand(BooksService service, int id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Executing DeleteBookCommand...");
        service.delete(id);
        System.out.println("Book deleted: " + id);
    }
}
