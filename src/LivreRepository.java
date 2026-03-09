import java.util.List;

public interface LivreRepository {
    List<Livre> getLivres();
    void ajouterLivre(Livre livre);

    void recupererLivre(Livre livre);
}
