public class LivreEmpruntable extends Livre{
    protected final Livre livre;

    LivreEmpruntable(Livre livre) {
        this.livre = livre;
    }

    @Override
    public void emprunter() {
        livre.isEmpruntable = true;
    }
    @Override
    public void retourner() {
        livre.isEmpruntable = false;
    }
}
