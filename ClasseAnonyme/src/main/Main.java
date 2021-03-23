package main;

import sn.isi.entities.Operationbancaire;
import sn.isi.traitement.IOperationBancaire;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IOperationBancaire ipb = new IOperationBancaire() {
            @Override
            public List<Operationbancaire> saisie() {
                Scanner scan = new Scanner(System.in);

                Date date = null;
                Operationbancaire op = new Operationbancaire();
                ArrayList<Operationbancaire> operationbancaires = new ArrayList<Operationbancaire>();
                System.out.println("ENTRER L'ID");
                op.setId(Integer.parseInt(scan.nextLine()));
                System.out.println("ENTRER LE LIBELLE");
                op.setLib(scan.nextLine());
                System.out.println("ENTRER LE MONTANT");
                op.setMontant(Double.parseDouble(scan.nextLine()));
                System.out.println("ENTRER LA DATE :");
                try {
                    SimpleDateFormat d = new SimpleDateFormat("DD/MM/YYYY");
                    date = d.parse(scan.nextLine());
                    op.setDate(date);
                }catch (Exception exception){
                    exception.printStackTrace();
                }
                operationbancaires.add(op);

                return operationbancaires;
            }

            @Override
            public List<Operationbancaire> affichage(List<Operationbancaire> operationbancaires) {
                for (Operationbancaire opb : operationbancaires){
                    System.out.println("L'ID EST :"+opb.getId());
                    System.out.println("LE LIBELLE EST :"+opb.getLib());
                    System.out.println("LE MONTANT EST :"+opb.getMontant());
                    System.out.println("LA DATE  EST :"+opb.getDate());

                }

                return operationbancaires;
            }
        };

       List<Operationbancaire> Ibanque = ipb.saisie();
        List<Operationbancaire> banque = ipb.affichage(Ibanque);

    }
}
