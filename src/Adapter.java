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

        for (int i = 0; i < livreStrings.size(); i++) {

            String[] values = livreStrings.get(i).split("\\|");

            String titre = values[0];
            String isbn = values[1];

            FormatLivre format = new FormatPapier();

            livres.add(new LivreConcret(isbn, titre, format));
        }

        return livres;
    }

    @Override
    public void ajouterLivre(Livre livre) {
        adaptee.ajouterLivre(livre.getTitre(), livre.getIsbn());
    }

    @Override
    public void recupererLivre(Livre livre) {

    }
}
