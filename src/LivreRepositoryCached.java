import java.util.List;

public class LivreRepositoryCached implements LivreRepository {
    private VraiLivreRepository livreRepository;


    @Override
    public void recupererLivre(Livre livre) {

        livreRepository.recupererLivre(livre);
    }

    @Override
    public List<Livre> getLivres() {
        return List.of();
    }

    @Override
    public void ajouterLivre(Livre livre) {

    }
}
