package app.books.observer;

import app.books.model.Book;

public interface Observer {
    void update(Book book);
}
