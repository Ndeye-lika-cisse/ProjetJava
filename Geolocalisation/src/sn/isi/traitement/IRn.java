package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.List;

public interface IRn {
    public List<Rn> saisie();
    public List<Rn> affichage(List<Rn> rns);
}
