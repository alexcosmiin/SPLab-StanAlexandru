import java.util.ArrayList;
import java.util.List;

public class Book {
    // atribute
    private String title;
    private Author author;
    private List<Chapter> chapters;


    // constructor
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>();
    }

    // metoda pentru a adauga un capitol
    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    //metoda print()
    public void print() {
        System.out.println("Book: " + title);
        if (author != null) {
            author.print();
        }
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }

    // Getters si Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
