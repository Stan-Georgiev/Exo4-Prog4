import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivreRepositoryCached implements LivreRepository {

    private final Map<String, Livre> cache = new HashMap<>();

    public void recupererLivre(Livre livre) {
        if (cache.containsKey(livre.getIsbn())) {
            System.out.println("[Cache] Livre déjà en cache : " + livre.getTitre());
        } else {
            cache.put(livre.getIsbn(), livre);
            System.out.println("[Cache] Ajout du livre au cache : " + livre.getTitre());
        }
    }

    @Override
    public void ajouterLivre(Livre livre) {
        cache.put(livre.getIsbn(), livre);
        System.out.println("[Cache] Livre ajouté : " + livre.getTitre());
    }

    @Override
    public List<Livre> getLivres() {
        return new ArrayList<>(cache.values());
    }
}