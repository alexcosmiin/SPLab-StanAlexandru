package app.books.controller;

import app.books.model.Book;
import app.books.service.BookService;
import app.books.observer.AllBooksSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private AllBooksSubject allBooksSubject;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestParam String title, @RequestParam Long authorId) {
        Book book = service.createBook(title, authorId);
        allBooksSubject.add(book);
        return book;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return service.getBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
