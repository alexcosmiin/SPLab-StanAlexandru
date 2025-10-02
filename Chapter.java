import java.util.ArrayList;
import java.util.List;

public class Chapter {

    //atribute
    private String name;
    private List<SubChapter> subChapters;

    //constructor
    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    //metoda pentru a adauga un subcapitol
    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    //metoda print
    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
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
