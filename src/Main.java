import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------");

        InventaireLivres inventaireLivres = new InventaireLivres();
        Adapter adapter = new Adapter(inventaireLivres);
        LivreConcret livre1 = new LivreConcret("123","livre-1", new FormatAudio());
        Client client = new Client(adapter);
        client.makeAddRequest(livre1);
        System.out.println("Ajout:"+livre1.getTitre());
        System.out.println(client.makeGetRequest());

        System.out.println("----------------------");

        LivreRepositoryCached repo = new LivreRepositoryCached();
        repo.recupererLivre(livre1);

        System.out.println("----------------------");

        AuteurComposite auteurComposite = new AuteurComposite();
        Auteur auteur1 = new Auteur("Greglington");
        Auteur auteur2 = new Auteur("Mike");
        auteurComposite.addAuteur(auteur1);
        System.out.println("Ajout:"+auteur1.getNom());
        auteurComposite.addAuteur(auteur2);
        System.out.println("Ajout:"+auteur2.getNom());
        System.out.println(auteurComposite.getAuteur(0));
        System.out.println(auteurComposite.getAuteur(1));

        System.out.println("----------------------");

        Livre livre = new LivreConcret("123","livre-1", new FormatAudio());
        LivreEmpruntable livreDecorateur = new LivreEmpruntable(livre);

        livreDecorateur.emprunter();
        livreDecorateur.retourner();

        System.out.println("----------------------");

        Bibliotheque bibliotheque = new Bibliotheque();
        client = new Client(new Adapter(new InventaireLivres()));
        client.makeAddRequest(livre1);

        bibliotheque.performAction();

        bibliotheque.emprunterLivre("123");
        bibliotheque.retournerLivre("123");

        System.out.println("----------------------");

        FlyweightFacotry factory = new FlyweightFacotry();

        FlyweightBase img1 = factory.getFlyweight("cover.png");
        FlyweightBase img2 = factory.getFlyweight("cover.png");

        img1.statefulOperation("Livre A");
        img2.statefulOperation("Livre B");

        System.out.println(img1 == img2);


        System.out.println("----------------------");

        Livre livrePapier = new LivreConcret("123", "Le Petit Prince", new FormatPapier());
        Livre livreAudio = new LivreConcret("123", "Le Petit Prince", new FormatAudio());
        Livre livreNumerique = new LivreConcret("123", "Le Petit Prince", new FormatNumerique());

        livrePapier.Produire();
        livreAudio.Produire();
        livreNumerique.Produire();

    }
}