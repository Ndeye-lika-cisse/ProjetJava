package sn.isi.triatement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EcoleImp implements IEcole{
    @Override
    public Map<Specialite, Ecole> saisie() {
        Scanner scan = new Scanner(System.in) ;
        Ecole ecole = null;
        Specialite specialite = null;
        Map<Specialite, Ecole> listEcole = new Hashtable<Specialite,Ecole>();
        String rep = null;

        do {
            ecole = new Ecole();
            specialite = new Specialite();
            System.out.println("veuillez saisir l'id:");
            ecole.setId(Integer.parseInt(scan.nextLine()));
            System.out.println("Veuillez saisir le nom:");
            ecole.setNom(scan.nextLine());
            System.out.println("veuillez saisir l'id de la specialité:");
            specialite.setId(Integer.parseInt(scan.nextLine()));
            System.out.println("veuillez saisir le nom de la specialité:");
            specialite.setNom(scan.nextLine());
            System.out.println("voulez vous continuez? :O/N");
            ecole.setSpecialite(specialite);
            listEcole.put(ecole.getSpecialite(), ecole);
            rep = scan.nextLine();
        }while (rep.equalsIgnoreCase("O") );

        return listEcole;
    }

    @Override
    public void affichageEcoles(Map<Specialite, Ecole> maps) {
        Collection<Ecole> ecoles = maps.values();
        for ( Ecole ecole : ecoles){
            System.out.println("id de l'ecole:"+ecole.getId());
            System.out.println("nom de l'ecole:"+ecole.getNom());
            System.out.println("id de la specialite:"+ecole.getSpecialite().getId());
            System.out.println("nom de la specialite:"+ecole.getSpecialite().getNom());


        }

    }
}
