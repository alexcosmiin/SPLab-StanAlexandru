public class SubChapter {
    //atribute
    private String name;

    //constructor
    public SubChapter(String name) {
        this.name = name;
    }

    //metoda print
    public void print() {
        System.out.println("    SubChapter: " + name);
    }

    // Getter si Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
