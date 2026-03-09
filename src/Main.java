import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------");

        InventaireLivres inventaireLivres = new InventaireLivres();
        Adapter adapter = new Adapter(inventaireLivres);
        LivreConcret livre1 = new LivreConcret("123","livre-1");
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
        System.out.println(auteurComposite.getAuteur(1));
        System.out.println(auteurComposite.getAuteur(2));

        System.out.println("----------------------");

        Livre livre = new LivreConcret("123","livre-1");
        livre.emprunter();
        livre.isEmpruntable = true;
        livre.emprunter();

        System.out.println("----------------------");

        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.retournerLivre("123");
        livre.emprunter();
        bibliotheque.retournerLivre("123");
        livre.emprunter();

        System.out.println("----------------------");

        FlyweightFacotry flyweightFacotry = new FlyweightFacotry();


        System.out.println("----------------------");

        




    }
}