import java.util.ArrayList;
import java.util.List;

public class Book {

    public List<String> paragrafe;
    public List<String> imagini;
    public List<String> tabele;

    public Book(String disco_titanic) {
        paragrafe = new ArrayList<>();
        imagini = new ArrayList<>();
        tabele = new ArrayList<>();
    }

    public void createNewParagraf(String paragraf) {
        paragrafe.add(paragraf);


    }
    public void createNewImagine(String imagine) {
        imagini.add(imagine);


    }
    public void createNewTabel(String tabel) {
        tabele.add(tabel);


    }
    public void print(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabele);

    }



}
