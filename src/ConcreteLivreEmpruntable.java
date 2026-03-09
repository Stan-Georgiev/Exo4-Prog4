public class ConcreteLivreEmpruntable extends LivreEmpruntable {
    public ConcreteLivreEmpruntable(Livre livre) {
        super(livre);
    }

    @Override
    public void enprunter() {
        if (livre.isEmpruntable == false) {
            System.out.println("Le livre est deja emprunter");
        } else {
            System.out.println("Le livre est empruntable");
        }
    }
}
