package main;

import sn.isi.entities.Transfert;
import sn.isi.traitement.Itransfert;
import sn.isi.traitement.TransfertImp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Itransfert I2 = new TransfertImp();
        ArrayList<Transfert> t3 = (ArrayList<Transfert>) I2.saisie();
        I2.affichage((List<Transfert>) t3);
    }
}
