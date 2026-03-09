import java.util.LinkedList;
import java.util.List;

public class AuteurComposite implements AuteurComponent {
    private List<AuteurComponent> auteurs = new LinkedList<>();
    @Override
    public String getNom() {
        String auteursAsString = "";
        for (int i  = 0; i < auteurs.size(); i++) {
            auteursAsString += getAuteur(i).getNom();
            if (i < auteurs.size() - 1) {
                auteursAsString += ", ";
            }
        }
        return auteursAsString;
    }

    void addAuteur(AuteurComponent auteur) {
        auteurs.add(auteur);
    }
    void removeAuteur(AuteurComponent auteur) {
        auteurs.remove(auteur);
    }
    AuteurComponent getAuteur(int index) {
        return auteurs.get(index);
    }
}
