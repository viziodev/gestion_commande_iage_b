
package models;
public class Commande {
    private int id;
    private String date;
    private double montant;
    
    private Client client;
    private Facture facture;
    
    public Commande() {
    }
    public Facture getFacture() {
        return facture;
    }
    public void setFacture(Facture facture) {
        this.facture = facture;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Commande [id=" + id + ", date=" + date + ", montant=" + montant + ", client=" + client.getNomComplet() + "]";
    }
   
}
