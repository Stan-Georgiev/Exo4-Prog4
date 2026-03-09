import java.util.ArrayList;
import java.util.List;

/**
 * Système d'inventaire de livres.
 *
 * ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
 * VOUS NE POUVEZ PAS MODIFIER LE CODE CI-DESSOUS
 * ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
 *
 * @author Gabriel T. St-Hilaire
 */
public class InventaireLivres {

    /** La liste des livres de l'inventaire. */
    private final List<String> livres = new ArrayList<>();

    /**
     * Constructeur.
     */
    public InventaireLivres() {
        livres.add("Clean Code: A Handbook of Agile Software Craftsmanship|978-0132350884");
        livres.add("Introduction to Algorithms|978-0262046305");
        livres.add("Structure and Interpretation of Computer Programs|978-0262510875");
        livres.add("Clean Coder, The: A Code of Conduct for Professional Programmers|978-0137081073");
    }

    public List<String> getLivres() {
        // On simule ici un traitement lourd ...
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return livres;
    }

    /**
     * Ajout d'un livre dans l'inventaire
     */
    public void ajouterLivre(String titre, String isbn) {
        livres.add(titre + "|" + isbn);
    }
}
