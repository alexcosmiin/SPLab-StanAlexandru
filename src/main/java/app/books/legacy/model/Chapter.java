package app.books.legacy.model;
import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;
    private List<Section> sections;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
        this.sections = new ArrayList<>();
    }

    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) subChapter.print();
        for (Section section : sections) section.print();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
