public class LivreEmpruntable extends Livre {
    protected final Livre livre;

    public LivreEmpruntable(Livre livre) {
        super(livre.getIsbn(), livre.getTitre(), livre.getFormat());
        this.livre = livre;
    }

    @Override
    public void emprunter() {
        if (!livre.isEmpruntable) {
            livre.isEmpruntable = true;
            System.out.println("[Decorator] Vous empruntez : " + livre.getTitre());
        } else {
            System.out.println("[Decorator] Le livre " + livre.getTitre() + " est déjà emprunté !");
        }
    }

    @Override
    public void retourner() {
        if (livre.isEmpruntable) {
            livre.isEmpruntable = false;
            System.out.println("[Decorator] Vous retournez : " + livre.getTitre());
        } else {
            System.out.println("[Decorator] Le livre " + livre.getTitre() + " n'a pas été emprunté !");
        }
    }
}