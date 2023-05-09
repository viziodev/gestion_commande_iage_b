import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import models.Client;
import models.Commande;
import services.CommandeService;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner=new Scanner(System.in);
       //Acceder au Service
       CommandeService service=new CommandeService();
       
       int choix;
       do {
            System.out.println("1-Creer Client");
            System.out.println("2-Lister Client");
            System.out.println("3-Creer Commande");
            System.out.println("4-Lister Toutes les Commande");
            System.out.println("5-Lister Commande d'un Client");
            System.out.println("6-Enregistrer une Facture"); 
            System.out.println("7-Quitter"); 
            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                    Client client=new Client();
                    System.out.println("Entrer un Id");
                    client.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Entrer le Nom et Prenom");
                    client.setNomComplet(scanner.nextLine());
                     service.creerClient(client);

                    break;
                    case 2:
                    ArrayList<Client> clients=   service.listerClient();
                    if(clients.size()!=0){
                        for (Client cl : clients) {
                            System.out.println(cl);
                        }
                    }else{
                        System.out.println("Pas de Client dans la liste");
                    }
                    break;
                    case 3:  
                    System.out.println("Entrer un Id  du Clien"); 
                    int idClient =scanner.nextInt();
                    client=service.rechercherClient(idClient);
                    if(client==null){
                        System.out.println("Client inexistant");
                    }else{
                        Commande commande=new Commande();
                        System.out.println("Entrer  Id de la Commande"); 
                        commande.setId(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Entrer la Date de la Commande");
                        commande.setDate(scanner.nextLine());
                        //commande.setDate(new Date());
                        System.out.println("Entrer le montant");
                        commande.setMontant(scanner.nextDouble());
                        //Client vers Commande
                        client.addCommande(commande);
                        //Commande vers Client
                        commande.setClient(client);

                        service.creerCommande(commande);

                    }
                    break;

                    case 4:  
                    ArrayList<Commande> commandes =service.listerCommandes();
                    for (Commande cmd: commandes) {
                            System.out.println(cmd);
                    }
                    break;
                    case 5:
                    System.out.println("Entrer  Id du Client"); 
                     idClient =scanner.nextInt();
                    client=service.rechercherClient(idClient);
                    if(client==null){
                        System.out.println("Client inexistant");
                    }else{
                         commandes=client.getCommandes();
                         for (Commande cmd: commandes) {
                            System.out.println(cmd);
                         }
                    }
                    break;

                default:
                    break;
            }
       } while (choix!=7);
    }
}
