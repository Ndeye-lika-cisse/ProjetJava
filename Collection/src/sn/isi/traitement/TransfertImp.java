package sn.isi.traitement;

import sn.isi.entities.Transfert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TransfertImp implements Itransfert{
    @Override
    public List<Transfert> saisie() {
        Scanner scan = new Scanner(System.in);
        String reponse = null;
        Date date = new Date();
        ArrayList<Transfert> transferts= new ArrayList<Transfert>();
        do {
            Transfert trans = new Transfert();
            System.out.println("entrer l'id ");
        trans.setId(Integer.parseInt(scan.nextLine()));
            System.out.println("entrer le libelle ");
            trans.setLib(scan.nextLine());
            System.out.println("entrer le montant ");
            trans.setMtn(Double.parseDouble(scan.nextLine()));

            System.out.println("voulez-vous continuer O/N");
            reponse= scan.nextLine();
            System.out.println("entrer la date ");
            try {
                SimpleDateFormat d = new SimpleDateFormat("DD/MM/YYYY");
                date = d.parse(scan.nextLine());
                trans.setDate(date);

            }catch (Exception ex){
        ex.printStackTrace();
            }
            transferts.add(trans);
            System.out.println("continu");
            reponse= scan.nextLine();


        }while (reponse.equalsIgnoreCase("O"));
        return transferts;
    }

    @Override
    public void affichage(List<Transfert> transferts) {
        for (Transfert transfert : transferts)
        {
            System.out.println("ID : " + transfert.getId());
            System.out.println("Libelle :" + transfert.getLib());
            System.out.println("Montant :" + transfert.getMtn());
            System.out.println("Date :" + transfert.getDate());
        }

    }
}
