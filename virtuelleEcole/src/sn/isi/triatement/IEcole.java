package sn.isi.triatement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.Map;

public interface IEcole {
    public Map<Specialite, Ecole> saisie();
    public void  affichageEcoles(Map<Specialite,Ecole>maps);
}
