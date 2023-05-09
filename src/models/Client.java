package models;

import java.util.ArrayList;

public class Client {
    private int id;
    private String nomComplet;

    //OneToMany
    private ArrayList<Commande> commandes=new ArrayList<>();

    public void addCommande(Commande commande){
        commandes.add(commande);
    }
    
    public ArrayList<Commande> getCommandes() {
        return commandes;
    }
    public Client() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    @Override
    public String toString() {
        return "Client [id=" + id + ", nomComplet=" + nomComplet + "]";
    }
    
}
