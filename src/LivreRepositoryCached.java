public class LivreRepositoryCached implements LivreRepositoryInterface {
    LivreRepositoryInterface livreRepository = new LivreRepository();

    @Override
    public void recupererLivre(Livre livre) {
        
        livreRepository.recupererLivre(livre);
    }
}
