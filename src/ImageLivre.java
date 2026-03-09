/**
 * Image d'un livre.
 *
 * ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
 * VOUS NE POUVEZ PAS MODIFIER LE CODE CI-DESSOUS
 * ⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
 *
 * @author Gabriel T. St-Hilaire
 */
public class ImageLivre implements Image {

    /** Le chemin du fichier image. */
    private final String chemin;

    /**
     * Constructeur.
     *
     * @param chemin Le chemin de l'image.
     */
    public ImageLivre(String chemin) {
        this.chemin = chemin;

        // Fake chargement de l'image en mémoire
        System.out.println("Fake chargement de l'image : " + chemin);
    }

    @Override
    public String getChemin() {
        return chemin;
    }
}
