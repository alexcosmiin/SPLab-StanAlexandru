package app.books.controller;

import app.books.model.Author;
import app.books.service.AuthorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return service.getAllAuthors();
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return service.createAuthor(author);
    }
}
