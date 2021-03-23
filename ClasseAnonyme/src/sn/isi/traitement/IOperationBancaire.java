package sn.isi.traitement;

import sn.isi.entities.Operationbancaire;

import java.util.List;

public interface IOperationBancaire {
    public List<Operationbancaire> saisie();
    public List<Operationbancaire> affichage(List<Operationbancaire> operationbancaires);

}
