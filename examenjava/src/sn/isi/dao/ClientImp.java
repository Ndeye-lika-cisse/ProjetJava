package sn.isi.dao;

import sn.isi.entities.Client;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientImp implements IClient {
    private Scanner sc = new Scanner(System.in);
    DB db = new DB();

    @Override
    public int add(Client client) throws Exception {
        db.open();
        String sql = "INSERT INTO client VALUES(NULL, ?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1,client.getNom());
        db.getPstm().setString(2,client.getPrenom());
        db.getPstm().setString(3,client.getEmail());
        db.getPstm().setString(4, client.getTel());
        int ok = db.executeUpdate();

        return ok;

    }

    @Override
    public int delete(int id) throws Exception {
        db.open();
        String sql = "DELETE FROM client WHERE id = ?";
        db.init(sql);
        db.getPstm().setInt(1,id);

        int ok = db.executeUpdate();

        return ok;
    }

    @Override
    public int update(Client client) throws Exception {
        db.open();
        String sql = "UPDATE client SET email= ? , nom=? ,prenom = ? , tel = ? WHERE id = ?";
        db.init(sql);
        db.getPstm().setString(1,client.getEmail());
        db.getPstm().setString(2, client.getNom());
        db.getPstm().setString(3, client.getPrenom());
        db.getPstm().setString(4, client.getTel());
        db.getPstm().setInt(5, client.getId());
        int ok = db.executeUpdate();
        return ok;
    }

    @Override
    public List<Client> getAll() throws Exception {
        List<Client> clients = new ArrayList<Client>();
        db.open();
        String sql = "SELECT * FROM client";
        db.init(sql);
        ResultSet rs = db.executSelecte();
        while (rs.next()){
            Client client =new Client();
            client.setId(rs.getInt(1));
            client.setNom(rs.getString(2));
            client.setPrenom(rs.getString(3));
            client.setEmail(rs.getString(4));
            client.setTel(rs.getString(5));

            clients.add(client);
        }

        return clients;
    }

    @Override
    public Client get(int id) throws Exception {
        Client client = null;
        db.open();
        String sql = "SELECT * FROM client Where id = ?";
        db.init(sql);
        db.getPstm().setInt(1, id);
        ResultSet rs = db.executSelecte();
        if (rs.next()){
            client  =new Client();
            client.setId(rs.getInt(1));
            client.setNom(rs.getString(2));
            client.setPrenom(rs.getString(3));
            client.setEmail(rs.getString(4));
            client.setTel(rs.getString(5));


        }

        return client;
    }

    @Override
    public Client findByEmail(String email) throws Exception {
        Client client = null;
        db.open();
        String sql = "SELECT * FROM client Where id = ?";
        db.init(sql);
        db.getPstm().setString(1, email);
        ResultSet rs = db.executSelecte();
        if (rs.next()){



        }
    return client;
    }
/*
    @Override
    public Client login(int id) throws Exception {
        Client client = null;
        db.open();
        String sql = "SELECT * FROM client Where id=?";
        db.init(sql);
        db.getPstm().setInt(1, id);

        ResultSet rs = db.executSelecte();
        if (rs.next()){
            client  =new Client();
            client.setId(rs.getInt(1));
            client.setNom(rs.getString(2));
            client.setPrenom(rs.getString(3));
            client.setEmail(rs.getString(4));
            client.setTel(rs.getString(5));


        }

        return client;
    }
*/



}
