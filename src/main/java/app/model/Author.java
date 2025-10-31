package app.model;

public class Author {
    private String name;

    //constructor
    public Author(String name) {
        this.name = name;
    }

    //metoda print
    public void print() {
        System.out.println("Author: " + name);
    }

    // Getter si Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
