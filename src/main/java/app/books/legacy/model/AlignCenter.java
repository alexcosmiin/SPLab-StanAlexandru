package app.books.legacy.model;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String text) {
        int width = 40;
        int padding = Math.max(0, (width - text.length()) / 2);
        String spaces = " ".repeat(padding);
        System.out.println(spaces + text + spaces);
    }
}
