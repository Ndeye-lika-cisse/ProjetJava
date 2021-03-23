package sn.isi.entities;

public class MedecinGeneraliste extends Medecin{
    private String listespecialistes;

    public MedecinGeneraliste(int id, String nom, String prenom, Services service) {
        super(id, nom, prenom, service);
    }
 public MedecinGeneraliste(){

 }

    public String getListespecialistes() {
        return listespecialistes;
    }

    public void setListespecialistes(String listespecialistes) {
        this.listespecialistes = listespecialistes;
    }
}
