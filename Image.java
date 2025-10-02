public class Image {
    //atribute
    private String imageName;

    //constructor
    public Image(String imageName) {
        this.imageName = imageName;
    }

    //metoda print()
    public void print() {
        System.out.println("        Image: " + imageName);
    }

    // Getter si Setter
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}