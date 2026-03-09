public class Audio extends LivreFormat{
    String format = "Audio";

    public void produire(Livre livre){
        System.out.println(format);
        System.out.println(livre.getIsbn());
        System.out.println(livre.getTitre());
    }
}
