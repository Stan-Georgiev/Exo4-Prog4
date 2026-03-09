public class LivreEmpruntable extends Livre{
    protected final Livre livre;

    public LivreEmpruntable(Livre livre){
        this.livre = livre;
    }

    @Override
    public void emprunter() {
        livre.emprunter();
    }
}
