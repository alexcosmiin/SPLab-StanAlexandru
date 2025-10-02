public class Main {
    public static void main(String[] args) {
        // Crearea autorului
        Author author = new Author("Alexandru Stan");

        // Crearea cartii
        Book book = new Book("Sabloane de proiectare", author);

        // Crearea capitolelor si subcapitolelor
        Chapter chapter1 = new Chapter("Capitolul 1");
        SubChapter sub1 = new SubChapter("ASD");
        SubChapter sub2 = new SubChapter("P1");

        // Adaugam continut in subcapitole
        sub1.addParagraph(new Paragraph("Text exemplu pentru ASD"));
        sub1.addImage(new Image("asd.png"));
        sub2.addTable(new Table("Tabel P1"));

        chapter1.addSubChapter(sub1);
        chapter1.addSubChapter(sub2);

        Chapter chapter2 = new Chapter("Capitolul 2");
        SubChapter sub3 = new SubChapter("P2");
        sub3.addParagraph(new Paragraph("Text exemplu pentru P2"));
        chapter2.addSubChapter(sub3);

        // Adaugam capitole in carte
        book.addChapter(chapter1);
        book.addChapter(chapter2);

        // Afisam cartea completa
        book.print();
    }
}
