package sn.isi.traitement;

import sn.isi.entities.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MedecinImp implements IMedecin{

    private Scanner sc = new Scanner(System.in);


    @Override
    public Medecin saisie() {
        Medecin M = null;
        String rep = null;
        boolean b=false;
        do {

            System.out.println("voulez-vous saisir un MS/MC/MG");
            rep =sc.nextLine();
          if (rep.equalsIgnoreCase("MS")|| rep.equalsIgnoreCase("MC") || rep.equalsIgnoreCase("MG")) {
                b = true;
            }

        }while (b == false);

        if(rep.equalsIgnoreCase("MC")){
           M = new MedecinChef();
            System.out.println("ID:");
            int id = Integer.parseInt(sc.nextLine());
            M.setId(id);
            System.out.println("NOM :");
            String nom = sc.nextLine();
            M.setNom(nom);
            System.out.println("PRENOM :");
            String prenom = sc.nextLine();
            M.setPrenom(prenom);
           Services service=new Services();
           service.setNomService("MEDECIN CHEF");
            ((MedecinChef)M).setService(service);
            System.out.println("entrer le nom de votre bureau svp :");
            ((MedecinChef)M).setBureau(sc.nextLine());
        }

        if (rep.equalsIgnoreCase("MG")){
           M = new MedecinGeneraliste();
            System.out.println("ID:");
            int id = Integer.parseInt(sc.nextLine());
            M.setId(id);
            System.out.println("NOM :");
            String nom = sc.nextLine();
            M.setNom(nom);
            System.out.println("PRENOM :");
            String prenom = sc.nextLine();
            M.setPrenom(prenom);
            Services service=new Services();
            service.setNomService("MEDECIN GENERALISTE");
            ((MedecinGeneraliste)M).setService(service);

        }
        if (rep.equalsIgnoreCase("MS")){
            M = new MedecinSpecialiste();
            System.out.println("ID:");
            int id = Integer.parseInt(sc.nextLine());
            M.setId(id);
            System.out.println("NOM :");
            String nom = sc.nextLine();
            M.setNom(nom);
            System.out.println("PRENOM :");
            String prenom = sc.nextLine();
            M.setPrenom(prenom);
            Services service=new Services();
            service.setNomService("MEDECIN SPECIALISTE");
            ((MedecinSpecialiste)M).setService(service);
            System.out.println("ID du SERVICE");
            int idService = Integer.parseInt(sc.nextLine());
            //service.setIdService(service.getIdService(sc.nextLine()));
            System.out.println("NOM du SERVICE");
            String nomService = sc.nextLine();
            System.out.println("Entrer vos specialite svp :");
            ((MedecinSpecialiste)M).setSpecialiste(sc.nextLine());
        }
        /*System.out.println("Entrer votre id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Entrer votre nom :");
        String nom = sc.nextLine();
        System.out.println("Entrer votre prenom :");
        String prenom = sc.nextLine();*/
        return M;
    }

    @Override
    public void affichage(Medecin M) {
          /*if (M instanceof  Medecin){
              System.out.println("le service est"+((Medecin)M).getservice);
          }*/
        System.out.println("l'identifiant  est :"+M.getId());
        System.out.println("le Nom est :"+M.getNom());
        System.out.println("le Prenom est :"+M.getPrenom());
        if (M instanceof  MedecinChef){
            System.out.println("le nom du bureau est : "+((MedecinChef)M).getBureau());
        }

        if (M instanceof MedecinSpecialiste){
            System.out.println("VOTRE ID SERVICE EST :" +((MedecinSpecialiste)M).getService().getIdService());
            System.out.println("VOTRE ID SERVICE EST :" +((MedecinSpecialiste)M).getService().getNomService());
            System.out.println(" VOTRE SPACIALITE EST : "+((MedecinSpecialiste)M).getSpecialiste());
        }

    }
}
