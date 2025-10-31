package app.model;

public class Paragraph {
    // atribute
    private String text;
    private AlignStrategy alignStrategy;

    // constructor
    public Paragraph(String text) {
        this.text = text;
    }

    // metoda print
    public void print() {
        if (alignStrategy == null) {
            System.out.println("        Paragraph: " + text);
        } else {
            alignStrategy.render(text);
        }
    }

    // setam strategia
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    // getter si setter pentru text
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
