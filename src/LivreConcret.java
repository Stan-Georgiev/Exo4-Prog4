public class LivreConcret extends Livre {

    public LivreConcret(String isbn, String titre, FormatLivre format) {
        super(isbn, titre, format);
    }

    @Override
    public void emprunter() {
        System.out.println("Emprunter");
    }

    @Override
    public void retourner() {
        System.out.println("Retourner");
    }
}