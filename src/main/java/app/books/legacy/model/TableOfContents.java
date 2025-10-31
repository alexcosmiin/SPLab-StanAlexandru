package app.books.legacy.model;

public class TableOfContents {
    //atribute
    private String content;

    //constructor
    public TableOfContents(String content) {
        this.content = content;
    }

    //metoda print
    public void print() {
        System.out.println("Table of Contents: " + content);
    }

    // Getter si Setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
