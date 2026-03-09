public class LivreConcret extends Livre{
    public LivreConcret(String isbn, String titre) {
        super(isbn, titre);
    }
    @Override
    public void emprunter() {
        System.out.println("Emprunter");
    }
}
