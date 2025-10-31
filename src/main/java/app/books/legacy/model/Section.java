package app.books.legacy.model;
import java.util.ArrayList;
import java.util.List;

public class Section {
    private String title;
    private List<Paragraph> paragraphs;
    private List<Image> images;
    private List<Table> tables;

    public Section(String title) {
        this.title = title;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void addParagraph(Paragraph p) { paragraphs.add(p); }
    public void addImage(Image i) { images.add(i); }
    public void addTable(Table t) { tables.add(t); }

    public void print() {
        System.out.println("Section: " + title);
        for (Paragraph p : paragraphs) p.print();
        for (Image i : images) i.print();
        for (Table t : tables) t.print();
    }
}
