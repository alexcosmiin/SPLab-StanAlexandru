public class Main {
    public static void main(String[] args) {
        Author author = new Author("Alexandru Stan");
        Book book = new Book("Sabloane de proiectare", author);

        Chapter chapter1 = new Chapter("Capitolul 1");
        SubChapter sub1 = new SubChapter("ASD");
        SubChapter sub2 = new SubChapter("P1");
        chapter1.addSubChapter(sub1);
        chapter1.addSubChapter(sub2);

        Chapter chapter2 = new Chapter("Capitolul 2");
        SubChapter sub3 = new SubChapter("P2");
        chapter2.addSubChapter(sub3);

        book.addChapter(chapter1);
        book.addChapter(chapter2);

        book.print();
    }
}
