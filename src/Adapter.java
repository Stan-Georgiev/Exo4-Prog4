import java.util.ArrayList;
import java.util.List;

public class Adapter implements LivreRepository {
    private final InventaireLivres adaptee;
    public Adapter(InventaireLivres adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public List<Livre> getLivres() {
        List<Livre> livres = new ArrayList<>();
        List<String> livreStrings = adaptee.getLivres();
        for (int i  = 0; i < adaptee.getLivres().size(); i++) {
            String[] values = livreStrings.get(i).split("\\|");
            livres.add(new LivreConcret(values[0], values[1]));
        }
        return livres;
    }

    @Override
    public void ajouterLivre(Livre livre) {
        adaptee.ajouterLivre(livre.getTitre(), livre.getIsbn());
    }
}
