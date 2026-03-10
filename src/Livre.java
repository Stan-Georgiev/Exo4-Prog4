abstract class Livre {

    public abstract void emprunter();
    public abstract void retourner();

    private String isbn;
    private String titre;
    private FormatLivre format;

    public boolean isEmpruntable;

    public Livre(String isbn, String titre, FormatLivre format) {
        this.isbn = isbn;
        this.titre = titre;
        this.format = format;
        isEmpruntable = false;
    }

    public Livre() {}

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public FormatLivre getFormat() {
        return format;
    }

    public void Produire() {
        format.produire(titre, isbn);
    }
}