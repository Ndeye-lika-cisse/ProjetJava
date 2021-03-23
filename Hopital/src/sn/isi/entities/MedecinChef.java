package sn.isi.entities;

public class MedecinChef extends Medecin{
    private String bureau;


    public MedecinChef(int id, String nom, String prenom, String bureau) {
        super(id, nom, prenom);
        this.bureau = bureau;
    }
    public MedecinChef(){}

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
