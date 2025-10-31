package app.books.legacy.controller;

import app.books.legacy.command.*;
import app.books.legacy.filter.RequestLoggingFilter;
import app.books.legacy.service.BooksService;

public class BooksController {
    private final BooksService service;
    private final CommandInvoker invoker;
    private final RequestLoggingFilter logger;

    public BooksController(BooksService service, CommandInvoker invoker, RequestLoggingFilter logger) {
        this.service = service;
        this.invoker = invoker;
        this.logger = logger;
    }

    public void getAllBooks() {
        logger.logRequest("GET /books");
        invoker.invoke(new GetAllBooksCommand(service));
        logger.logResponse("200 OK");
    }

    public void getBookById(int id) {
        logger.logRequest("GET /books/" + id);
        invoker.invoke(new GetBookByIdCommand(service, id));
        logger.logResponse("200 OK");
    }

    public void createBook(String title, String author) {
        logger.logRequest("POST /books");
        invoker.invoke(new CreateBookCommand(service, title, author));
        logger.logResponse("201 Created");
    }

    public void updateBook(int id, String title, String author) {
        logger.logRequest("PUT /books/" + id);
        invoker.invoke(new UpdateBookCommand(service, id, title, author));
        logger.logResponse("200 OK");
    }

    public void deleteBook(int id) {
        logger.logRequest("DELETE /books/" + id);
        invoker.invoke(new DeleteBookCommand(service, id));
        logger.logResponse("204 No Content");
    }
}
