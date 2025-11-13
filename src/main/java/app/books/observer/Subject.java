package app.books.observer;

import app.books.model.Book;

public interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(Book book);
}
