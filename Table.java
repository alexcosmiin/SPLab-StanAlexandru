public class Table {
    //atribute
    private String title;

    //constructor
    public Table(String title) {
        this.title = title;
    }

    //metoda print()
    public void print() {
        System.out.println("        Table: " + title);
    }

    // Getter si Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
