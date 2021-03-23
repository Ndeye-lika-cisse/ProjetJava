package sn.isi.entities;

public abstract class Medecin extends Personne{
    private Services service;

    public Medecin(int id, String nom, String prenom, Services service) {
        super(id, nom, prenom);
        this.service = service;
    }

    public Medecin(int id, String nom, String prenom) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }

    public Medecin() {
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
