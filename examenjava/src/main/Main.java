package main;

import sn.isi.dao.ClientImp;
import sn.isi.dao.DB;
import sn.isi.dao.IClient;
import sn.isi.entities.Client;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        DB db = new DB();
        Client c = null;
        String rep = null;
        String retour=null;

        boolean b=false;


        do {
            System.out.println("*****************************************MENU******************************************");
            System.out.println("*******************************   A-CREATION CLIENT         ***************************");
            System.out.println("*******************************   B-VISULISER DES CLIENTS   ***************************");
            System.out.println("*******************************   C-EDITER UN CLIENT        ***************************");
            System.out.println("*******************************   D-RECHERCHER UN CLIENT    ***************************");
            System.out.println("***************************************************************************************");
            System.out.println("Veuillez choisir entre ces 4 caractères A/B/C/D");
            rep =sc.nextLine();
            if (rep.equalsIgnoreCase("A")|| rep.equalsIgnoreCase("B") || rep.equalsIgnoreCase("C")|| rep.equalsIgnoreCase("D")) {
                b = true;
            }else {
                System.out.println("Choix non disponible veuillez saisir une lettre correcte");
            }
            /*final String ESC = "\033[";
            System.out.println(ESC + "2J");
           System.out.println(ESC + "0;0H");
            System.out.flush();

             */
        }while (b == false);


   do {
    if (rep.equalsIgnoreCase("A")) {
        // System.out.println(cls);
        System.out.println("------------------------------------------------------");
        System.out.println("BIENVENUE SUR LA PAGE DE CREATION D'UN CLIENT !!!");
        System.out.println("-------------------------------------------------------\n");
            /*final String ESC = "\033[";
            System.out.println(ESC + "2J");
            System.out.println(ESC + "0;0H");
            System.out.flush();*/
        IClient clientdao = new ClientImp();
        Client client = new Client();
        System.out.println("veuillez saisir l'id:");
        client.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("veuillez saisir le nom:");
        client.setNom(sc.nextLine());
        System.out.println("veuillez saisir le prenom:");
        client.setPrenom(sc.nextLine());
        System.out.println("veuillez saisir l'email:");
        client.setEmail(sc.nextLine());
        System.out.println("veuillez saisir le tel:");
        client.setTel(sc.nextLine());

        int ok = clientdao.add(client);
        List<Client> clients = clientdao.getAll();

        System.out.println("voulez vous continuer o/n");
    }
       retour=sc.nextLine();
}while (retour.equalsIgnoreCase("o"));
        if (retour.equalsIgnoreCase("N")){
            System.out.println("ajout reussi !!!");
        }
        if (rep.equalsIgnoreCase("B")){
            System.out.println("------------------------------------------------------");
            System.out.println("BIENVENUE SUR LA PAGE DE VISUALISATION DES CLIENTS !!!");
            System.out.println("-------------------------------------------------------\n");
            IClient clientdao = new ClientImp();
            Client client = new Client();
            List<Client> clients = clientdao.getAll();
            for (Client client1: clients){
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("id"+ client1.getId() + "\n nom : " +client1.getNom()+"\n prenom : "+ client1.getPrenom()+"\n email : "+ client1.getEmail()+"\n telephone : "+ client1.getTel());
                System.out.println("-----------------------------------------------------------------------------");
            }
        }


        if (rep.equalsIgnoreCase("C")){
            System.out.println("------------------------------------------------------");
            System.out.println("BIENVENUE SUR LA PAGE D'ETDITION DES CLIENTS !!!");
            System.out.println("-------------------------------------------------------\n");
            System.out.println("Entrer nouveau l'ID :");
            int newId = Integer.parseInt(sc.nextLine());
            System.out.println("Entrer ancien l'ID :");
            int ancId = Integer.parseInt(sc.nextLine());
            if (newId == ancId){
                    db.open();
                    String sql = "UPDATE client SET nom = ?, prenom = ?,email = ?, tel = ? WHERE id = ?";
                    db.init(sql);
                    IClient clientdao = new ClientImp();
                    Client client = new Client();
                    System.out.println("veuillez saisir le nom:");
                    client.setNom(sc.nextLine());
                    System.out.println("veuillez saisir le prenom:");
                    client.setPrenom(sc.nextLine());
                    System.out.println("veuillez saisir l'email:");
                    client.setEmail(sc.nextLine());
                    System.out.println("veuillez saisir le tel:");
                    client.setTel(sc.nextLine());

                    System.out.println("-------------------------------");
                    db.getPstm().setString(1, client.getNom());
                    db.getPstm().setString(2, client.getPrenom());
                    db.getPstm().setString(3, client.getEmail());
                    db.getPstm().setString(4, client.getTel());
                    db.getPstm().setInt(5,ancId);
                    int ok = db.executeUpdate();
                    System.out.println(ok+"client modifier avec success !!!");

            }else {
                System.out.println("L'id n'existe pas !");
            }

          /*  db.open();
            String sql = "UPDATE client SET email= ?, nom = ? ,prenom = ? , tel = ? WHERE id = ?";
            db.init(sql);
            db.getPstm().setString(1,"ba@gmail.com" );
            //db.getPstm().setString(2, "Ba");
            //db.getPstm().setString(3, "Ameth");
            //db.getPstm().setString(4, "776555665");
            db.getPstm().setInt(2, 34);
            int ok = db.executeUpdate();
            System.out.println(ok+" Modification réussie");


            /*System.out.println("nouveau ID");
            client.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("nouveau NOM :");
            client.setNom(sc.nextLine());
            System.out.println("nouveau PRENOM :");
            client.setNom(sc.nextLine());
            System.out.println("nouveau EMAIL :");
            client.setNom(sc.nextLine());
            System.out.println("nouveau TEL :");
            client.setNom(sc.nextLine());

            //List<Client> client2 = clientdao.getAll();

            clientdao.update(client);
            //System.out.println("BIENVENUE SUR LA PAGE D'EDITION DE CLIENT !!!");*/

        }

        if (rep.equalsIgnoreCase("D")){




        }

    }



}
