import java.util.List;

public class VraiLivreRepository implements LivreRepository {
    private LivreRepository livreRepository;

    public VraiLivreRepository(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    @Override
    public List<Livre> getLivres() {
        return List.of();
    }

    @Override
    public void ajouterLivre(Livre livre) {

    }

    @Override
    public void recupererLivre(Livre livre) {

    }
}
