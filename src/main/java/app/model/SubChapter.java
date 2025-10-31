package app.model;
import java.util.ArrayList;
import java.util.List;


public class SubChapter {
    //atribute
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    //constructor
    public SubChapter(String name) {
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    //metode pentru adaugarea elementelor
    public void addImage(Image image) {
        images.add(image);
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    //metoda print
    public void print() {
        System.out.println("    SubChapter: " + name);
        for (Image image : images) {
            image.print();
        }
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
        for (Table table : tables) {
            table.print();
        }
    }

    // Getter si Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
