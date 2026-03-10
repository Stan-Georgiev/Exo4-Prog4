public class FormatPapier implements FormatLivre {
    @Override
    public void produire(String titre, String isbn) {
        System.out.println(titre + " " + isbn);
    }
}
