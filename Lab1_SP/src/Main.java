public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraf("Paragraph 1");
        discoTitanic.createNewParagraf("Paragraph 2");
        discoTitanic.createNewParagraf("Paragraph 3");
        discoTitanic.createNewImagine("Image 1");
        discoTitanic.createNewParagraf("Paragraph 4");
        discoTitanic.createNewTabel("Table 1");
        discoTitanic.createNewParagraf("Paragraph 5");

        discoTitanic.print();
    }
}
