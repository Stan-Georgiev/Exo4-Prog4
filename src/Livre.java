abstract class Livre {
    public abstract void emprunter();
    private String isbn;
    private String titre;

    public Livre(String isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
    }
    public boolean isEmpruntable;
    public String getIsbn() {
        return isbn;
    }
    public String getTitre() {
        return titre;
    }

}
