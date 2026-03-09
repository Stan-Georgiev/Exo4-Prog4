public class Auteur implements AuteurComponent{
    private String nom;

    public Auteur(String nom) {
        this.nom = nom;
    }
    @Override
    public String getNom() {
        return nom;
    }
}
