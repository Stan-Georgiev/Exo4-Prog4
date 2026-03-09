public class ConcreteLivreEmpruntable extends LivreEmpruntable {
    public ConcreteLivreEmpruntable(Livre livre) {
        super(livre);
    }

    @Override
    public void emprunter() {
        if (livre.isEmpruntable == false) {
            System.out.println("Le livre est deja emprunté");
        } else {
            System.out.println("Le livre est empruntable");
        }
    }
}
