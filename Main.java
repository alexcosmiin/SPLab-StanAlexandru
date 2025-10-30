public class Main {
    public static void main(String[] args) throws Exception {
        Book book = new Book("Programare Java", new Author("Alex Stan"));

        Chapter ch1 = new Chapter("Capitol 1");
        Section sec1 = new Section("Introducere");
        sec1.addParagraph(new Paragraph("Paragraf 1"));
        sec1.addParagraph(new Paragraph("Paragraf 2"));
        ch1.addSection(sec1);

        SubChapter sub1 = new SubChapter("SubCapitol 1.1");
        sub1.addParagraph(new Paragraph("Paragraf subcapitol"));
        ch1.addSubChapter(sub1);

        book.addChapter(ch1);
        book.generateTOC();
        book.print();
    }
}
