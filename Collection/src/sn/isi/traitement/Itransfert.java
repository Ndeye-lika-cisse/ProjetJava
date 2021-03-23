package sn.isi.traitement;

import sn.isi.entities.Transfert;

import java.util.List;

public interface Itransfert {
    //saisie liste
    public List<Transfert> saisie();
    // affichage liste
    public  void affichage(List<Transfert> transferts);
}
