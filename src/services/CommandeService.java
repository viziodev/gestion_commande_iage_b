package services;

import java.util.ArrayList;

import models.Client;
import models.Commande;

public class CommandeService {
  private ArrayList<Client> clients =new ArrayList<>();
  private ArrayList<Commande> commandes =new ArrayList<>();
  //
  public void creerClient(Client client){
       clients.add(client);
  }

  public ArrayList<Client> listerClient(){
       return clients;
  }

  public void creerCommande(Commande commande){
    commandes.add(commande);
  }

  public ArrayList<Commande> listerCommandes(){
      return commandes;
   }

   public Client rechercherClient(int id){
     for (Client cl : clients) {
        if(cl.getId()==id){
            return cl;
        }
     }

         return null;
   }

   public Commande rechercherCommmande(int id){
    for (Commande cl : commandes) {
       if(cl.getId()==id){
        
           return cl;
       }
    }

        return null;
  }
}
