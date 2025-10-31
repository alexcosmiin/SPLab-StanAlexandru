package app.books.service;

import app.books.model.Author;
import app.books.model.Book;
import app.books.repository.AuthorRepository;
import app.books.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(String title, Long authorId) {
        Optional<Author> authorOpt = authorRepository.findById(authorId);
        if (authorOpt.isPresent()) {
            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(authorOpt.get());
            return bookRepository.save(book);
        } else {
            throw new RuntimeException("Author not found with id: " + authorId);
        }
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
}
