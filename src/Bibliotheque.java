import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Bibliotheque {

    private List<Livre> livres = new ArrayList<>();

    public void performAction() {
        InventaireLivres inventaire = new InventaireLivres();
        LivreRepository repository = new Adapter(inventaire);
        Client client = new Client(repository);
        livres = repository.getLivres();
        if (livres == null) {
            livres = new ArrayList<>();
        }
    }

    public Optional<Livre> rechercherLivre(String searchItem) {
        if (livres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
            return Optional.empty();
        }
        return livres.stream()
                .filter(l -> l.getIsbn().equals(searchItem) || l.getTitre().equals(searchItem))
                .findFirst();
    }

    public void emprunterLivre(String isbn) {
        if (livres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
            return;
        }

        Optional<Livre> livreAEmprunter = livres.stream()
                .filter(l -> l.getIsbn().equals(isbn) && l.isEmpruntable)
                .findFirst();

        if (livreAEmprunter.isEmpty()) {
            System.out.println("Ce livre n'est pas empruntable ou n'existe pas.");
        } else {
            Livre livre = livreAEmprunter.get();
            livre.emprunter();
            System.out.println("Vous avez emprunté " + livre.getTitre());
        }
    }

    public void retournerLivre(String isbn) {
        if (livres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
            return;
        }

        Optional<Livre> livreEmprunte = livres.stream()
                .filter(l -> l.getIsbn().equals(isbn) && !l.isEmpruntable)
                .findFirst();

        if (livreEmprunte.isEmpty()) {
            System.out.println("Ce livre n'est pas retournable ou n'a pas été emprunté.");
        } else {
            Livre livre = livreEmprunte.get();
            livre.retourner();
            System.out.println("Vous avez retourné " + livre.getTitre());
        }
    }
}