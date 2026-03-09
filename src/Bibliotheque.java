import java.util.List;
import java.util.stream.Collectors;

public class Bibliotheque {
    List<Livre> livres;
    public void performAction() {
        InventaireLivres inventaire =  new InventaireLivres();
        LivreRepository repository = new Adapter(inventaire);
        Client client = new Client(repository);
        livres = repository.getLivres();
    }

    public Livre rechercherLivre(String searchItem) {
        return livres.stream().filter(l ->
                l.getIsbn().equals(searchItem) ||
                l.getTitre().equals(searchItem))
                .collect(Collectors.toList()).get(0);
    }
    public void emprunterLivre(String isbn){
        Livre livreAEmprunter = livres.stream().filter(l ->
                l.getIsbn().equals(isbn) &&
                !l.isEmpruntable)
                .collect(Collectors.toList()).get(0);
        if (livreAEmprunter.equals(null)) {
            System.out.println("Ce livre n'est pas empruntable");
        } else {
            livreAEmprunter.emprunter();
            System.out.println("Vous avez emprunté " + livreAEmprunter.getTitre());
        }
    }
    public void retournerLivre(String isbn){
        Livre livreEmprunte = livres.stream().filter(l ->
                        l.getIsbn().equals(isbn) &&
                                l.isEmpruntable)
                .collect(Collectors.toList()).get(0);
        if (livreEmprunte.equals(null)) {
            System.out.println("Ce livre n'est pas retournable");
        } else {
            livreEmprunte.retourner();
            System.out.println("Vous avez retourné " + livreEmprunte.getTitre());
        }
    }
}
