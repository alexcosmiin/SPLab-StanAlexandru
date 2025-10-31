package app.books.service;

import app.books.model.Author;
import app.books.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repo;

    public AuthorService(AuthorRepository repo) {
        this.repo = repo;
    }

    public List<Author> getAllAuthors() {
        return repo.findAll();
    }

    public Author createAuthor(Author author) {
        return repo.save(author);
    }
}
