import java.util.ArrayList;
import java.util.List;

public class Section {
    private String title;
    private List<Object> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void add(Object element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Section: " + title);
        for (Object element : elements) {
            if (element instanceof Paragraph) {
                ((Paragraph) element).print();
            } else if (element instanceof Image) {
                ((Image) element).print();
            } else if (element instanceof Table) {
                ((Table) element).print();
            }
        }
    }
}
