package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.triatement.EcoleImp;
import sn.isi.triatement.IEcole;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IEcole iecole = new EcoleImp();
        Map<Specialite, Ecole> listEcole = iecole.saisie();
        iecole.affichageEcoles(listEcole);
    }
}
