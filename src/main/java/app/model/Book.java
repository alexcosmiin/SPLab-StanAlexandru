package app.model;
import java.util.ArrayList;
import java.util.List;


public class Book {
    private String title;
    private Author author;
    private List<Chapter> chapters;
    private TableOfContents toc;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void setTableOfContents(TableOfContents toc) {
        this.toc = toc;
    }

    public void generateTOC() {
        StringBuilder sb = new StringBuilder();
        for (Chapter ch : chapters) {
            sb.append(ch.getName()).append("\n");
        }
        this.toc = new TableOfContents(sb.toString());
    }

    public void print() {
        System.out.println("Book: " + title);
        if (author != null) author.print();
        if (toc != null) toc.print();
        for (Chapter chapter : chapters) chapter.print();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public TableOfContents getTableOfContents() { return toc; }
}
