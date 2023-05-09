package models;
public class Facture {
    private int id;
    private boolean payer;
    private Commande commande;
    public Facture() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isPayer() {
        return payer;
    }
    public void setPayer(boolean payer) {
        this.payer = payer;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    @Override
    public String toString() {
        return "Facture [id=" + id + ", payer=" + payer + "]";
    }

    
}
