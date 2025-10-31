package app.service;

import app.model.Author;
import app.model.Book;
import java.util.*;

public class BooksService {
    private final Map<Integer, Book> books = new HashMap<>();
    private int currentId = 1;

    public List<Book> getAll() {
        return new ArrayList<>(books.values());
    }

    public Book getById(int id) {
        return books.get(id);
    }

    public Book create(String title, String authorName) {
        Book book = new Book(title, new Author(authorName));
        books.put(currentId++, book);
        return book;
    }

    public Book update(int id, String title, String authorName) {
        Book book = books.get(id);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(new Author(authorName));
        }
        return book;
    }

    public void delete(int id) {
        books.remove(id);
    }
}
