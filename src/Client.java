import java.util.ArrayList;
import java.util.List;

public class Client {
    private final LivreRepository repository;
    public Client(LivreRepository repository) {
        this.repository = repository;
    }
    public void makeAddRequest(Livre livre) {
        repository.ajouterLivre(livre);
    }
    public List<Livre> makeGetRequest() {
        return repository.getLivres();
    }
}
