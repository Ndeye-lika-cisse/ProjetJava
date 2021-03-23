package main;

import sn.isi.entities.Medecin;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.MedecinImp;

public class Main {
   public static void main(String[] args){
       IMedecin IM = new MedecinImp();
       IM.affichage(IM.saisie());
   }

}
