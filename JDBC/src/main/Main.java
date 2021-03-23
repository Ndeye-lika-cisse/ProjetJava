package main;

import sn.isi.dao.*;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Produit p = new Produit();
        DB db = new DB();
        /*db.open();
        String sql = "INSERT INTO user VALUES(NULL, ?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1,"Cisse");
        db.getPstm().setString(2,"Lika");
        db.getPstm().setString(3,"lika@gmail.com");
        db.getPstm().setString(4,"passer@");
        int ok = db.executeUpdate();
        System.out.println(ok);
        */

        IUser userdao= new UserImp();
        User user = new User();
        user.setNom("Ball");
        user.setPrenom("Mary");
        user.setEmail("mary@gmail.com");
        user.setPassword("passer@123");
        /*IProduit iProduit = new ProduitImp();
        int ok = iProduit.add(p);*/
       int ok = userdao.add(user);
        //System.out.println(ok);
       List<User> users = userdao.getAll();
        for (User u : users){
            System.out.println("id"+ u.getId() + ",nom : " +u.getNom()+", prenom : "+ u.getPrenom());
        }
    }
}
