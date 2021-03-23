package sn.isi.dao;

import sn.isi.entities.Produit;

public class ProduitImp implements IProduit {
    DB db = new DB();
    @Override
    public int add(Produit p) throws Exception {
       String sql = "INSERT INTO produit VALUES (NULL, ? ,?,?)";
       db.init(sql);
       db.getPstm().setString(1, p.getRef());
       db.getPstm().setString(2, p.getNom());
       //db.getPstm().setInt(3, p.getId().getUser());

        int ok = db.executeUpdate();

        return ok;
    }



}
