package sn.isi.entities;

public class MedecinSpecialiste extends Medecin{
    private String specialiste;

    public MedecinSpecialiste(int id, String nom, String prenom, Services service, String specialiste) {
        super(id, nom, prenom, service);
        this.specialiste = specialiste;
    }

    public MedecinSpecialiste() {
    }


    public String getSpecialiste() {
        return specialiste;
    }

    public void setSpecialiste(String specialiste) {
        this.specialiste = specialiste;
    }
}
