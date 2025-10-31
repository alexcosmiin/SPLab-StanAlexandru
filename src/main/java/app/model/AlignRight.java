package app.model;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        int width = 40;
        int padding = Math.max(0, width - text.length());
        String spaces = " ".repeat(padding);
        System.out.println(spaces + text + " ||");
    }
}
