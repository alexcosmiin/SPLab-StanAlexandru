package app;

import app.command.*;
import app.filter.AuthenticationFilter;
import app.filter.RequestLoggingFilter;
import app.service.BooksService;
import app.controller.Request;
import app.controller.Response;
import app.controller.RequestHandler;
import app.model.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // test lab2 - aliniere paragrafe
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");
        Paragraph p3 = new Paragraph("Paragraph 3");
        Paragraph p4 = new Paragraph("Paragraph 4");

        cap1.addParagraph(p1);
        cap1.addParagraph(p2);
        cap1.addParagraph(p3);
        cap1.addParagraph(p4);

        System.out.println("Printing without alignment:");
        cap1.print();

        // schimbam strategiile de aliniere
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println("\nPrinting with alignment:");
        cap1.print();


        // test lab3 - structura carte (Book, Chapter, SubChapter)
        Book book = new Book("Programare Java", new Author("Alex Stan"));

        Chapter ch1 = new Chapter("Capitol 1");
        Section sec1 = new Section("Introducere");
        sec1.addParagraph(new Paragraph("Paragraf 1"));
        sec1.addParagraph(new Paragraph("Paragraf 2"));
        ch1.addSection(sec1);

        SubChapter sub1 = new SubChapter("SubCapitol 1.1");
        sub1.addParagraph(new Paragraph("Paragraf subcapitol"));
        ch1.addSubChapter(sub1);

        book.addChapter(ch1);
        book.generateTOC(); // genereaza cuprinsul
        book.print();       // afiseaza cartea completa


        // test lab4 - Command pattern + filtre
        BooksService booksService = new BooksService();
        CommandInvoker invoker = new CommandInvoker();

        RequestHandler handler = new RequestHandler();
        handler.addFilter(new RequestLoggingFilter());
        handler.addFilter(new AuthenticationFilter());

        // POST /books - creare carte
        Request req1 = new Request("POST", "/books");
        Response res1 = handler.handle(req1);
        if (res1.getStatusCode() == 200 || res1.getStatusCode() == 201) {
            invoker.invoke(new CreateBookCommand(booksService, "Clean Code", "Robert C. Martin"));
        }

        // GET /books - afisare carti
        Request req2 = new Request("GET", "/books");
        Response res2 = handler.handle(req2);
        if (res2.getStatusCode() == 200) {
            invoker.invoke(new GetAllBooksCommand(booksService));
        }

        // GET /books/1 - afisare carte dupa id
        Request req3 = new Request("GET", "/books/1");
        Response res3 = handler.handle(req3);
        if (res3.getStatusCode() == 200) {
            invoker.invoke(new GetBookByIdCommand(booksService, 1));
        }

        // PUT /books/1 - actualizare carte
        Request req4 = new Request("PUT", "/books/1");
        Response res4 = handler.handle(req4);
        if (res4.getStatusCode() == 200) {
            invoker.invoke(new UpdateBookCommand(booksService, 1, "Clean Coder", "Robert Martin"));
        }

        // DELETE /books/1 - stergere carte
        Request req5 = new Request("DELETE", "/books/1");
        Response res5 = handler.handle(req5);
        if (res5.getStatusCode() == 200 || res5.getStatusCode() == 204) {
            invoker.invoke(new DeleteBookCommand(booksService, 1));
        }

        // GET /admin/books - cerere neautorizata
        Request req6 = new Request("GET", "/admin/books");
        handler.handle(req6);
    }
}
