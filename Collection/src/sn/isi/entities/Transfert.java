package sn.isi.entities;

import java.util.Date;

public class Transfert {
    private int id;
    private String lib;
    private double mtn;
    private Date date = null;


    public Transfert(int id, String lib, double mtn, Date date) {
        this.id = id;
        this.lib = lib;
        this.mtn = mtn;
        this.date = date;
    }

    public Transfert() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public double getMtn() {
        return mtn;
    }

    public void setMtn(double mtn) {
        this.mtn = mtn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
