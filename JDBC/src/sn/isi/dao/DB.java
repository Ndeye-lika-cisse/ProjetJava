package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //pour la connection
    private Connection cnx;
    //pour les requetes preparees
    private PreparedStatement pstm;
    //pour les resultats des requetes de types SELECT
    private ResultSet rs;

    public void open(){
        String url="jdbc:mysql://localhost:3306/jdbc";
        String mysqluser="root";
        String mysqlpassword="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, mysqluser,mysqlpassword);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void init(String sql) throws Exception
    {
        pstm = cnx.prepareStatement(sql);
    }
    public int executeUpdate() throws Exception{
        int ok =0;
        ok =pstm.executeUpdate();
        return ok;
    }
    public ResultSet executSelecte() throws Exception{
        rs = pstm.executeQuery();
        return rs;
    }
    public PreparedStatement getPstm() {
        return pstm;
    }
    public void close() throws Exception{
        if (cnx != null){
            cnx.close();
        }

    }

}
