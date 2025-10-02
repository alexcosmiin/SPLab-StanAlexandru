public class Paragraph {

    //atribute
    private String text;

    //constructor
    public Paragraph(String text) {
        this.text = text;
    }

    //metoda print()
    public void print() {
        System.out.println("        Paragraph: " + text);
    }

    // Getter si Setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
