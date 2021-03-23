package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.Scanner;

public class ZoneImp implements IZone{
    @Override
    public Zone saisie() {
        Scanner scan = new Scanner(System.in);
        Zone zn = new Zone();
        ArrayList<Zone> zones = new ArrayList<Zone>();
        System.out.println("ENTRER L'ID :");
        zn.setId(Integer.parseInt(scan.nextLine()));
        System.out.println(" NOM:");
        zn.setNom(scan.nextLine());
        System.out.println("LATITUDE  :");
        zn.setLatitude(Double.parseDouble(scan.nextLine()));
        System.out.println("LONGITUDE :");
        zn.setLongitude(Double.parseDouble(scan.nextLine()));
       zones.add(zn);
        return zn;
    }

    @Override
    public Zone affichage(Zone zones) {
        Zone zn = new Zone();
            System.out.println("L'ID EST :"+zones.getId());
            System.out.println("LE NOM EST :"+zones.getNom());
            System.out.println("LA LONGITUDE EST :"+zones.getLatitude());
            System.out.println("LA LATTITUDE EST :"+zones.getLongitude());

        return zn;
    }
}
