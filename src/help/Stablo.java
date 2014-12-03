/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihailo
 */
public class Stablo<Sadrzaj> {

    private Cvor koren;

    /**
     * Kreira se stablo, tj cvor koji predtavlja koren, ovom inicijalizacijom on
     * ima samo decu.
     */
    public Stablo() {
        koren = new Cvor("Predmet", null);
    }

    public void dodajCvor(Sadrzaj deteSadrzaj, Sadrzaj roditeljSadrzaj) {
        if (roditeljSadrzaj == null) {
            new Cvor(deteSadrzaj, koren);
            return;
        }
        Cvor r = pronadjiPoSadrzaju(koren, roditeljSadrzaj);
        if (r == null) {
            System.out.println("Greska");
        }
        new Cvor(deteSadrzaj, r);
    }

    private Cvor pronadjiPoSadrzaju(Cvor tekuci, Sadrzaj sadrzaj) {
        if (tekuci.sadrzaj.equals(sadrzaj)) {
            return tekuci;
        }
        for (Object obj : tekuci.deca) {
            Cvor c = (Cvor) obj;
            Cvor x = pronadjiPoSadrzaju(c, sadrzaj);
            if (x == null) {
                continue;
            }
            return x;

        }
        return null;
    }

    public Cvor getKoren() {
        return koren;
    }

    public String dajNazivStabla() {
        return koren.toString();
    }

    // metode za TreeModel =====================================================
    // moze da se vrati i naziv predmeta ili nesto slicno
//    public Sadrzaj dajKoren() {
//        return (Sadrzaj) koren.sadrzaj;
//    }
//
//    public Sadrzaj vratiDete(Object roditelj, int index) {
//        Cvor r = (Cvor) roditelj;
//        Cvor dete = (Cvor) r.deca.get(index);
//        return (Sadrzaj) dete.sadrzaj;
//    }
//
//    public int brojDece(Object roditelj) {
//        Cvor r = (Cvor) roditelj;
//        return r.deca.size();
//    }
//
//    public boolean daLiJeList(Object cvor) {
//        Cvor c = (Cvor) cvor;
//        return c.deca.size() == 0;
//    }
//
//    public int indexDeteta(Object roditelj, Object dete) {
//        Cvor r = (Cvor) roditelj;
//        Cvor d = (Cvor) dete;
//        List<Cvor> deca = r.deca;
//        for (int i = 0; i < deca.size(); i++) {
//            if (deca.get(i).equals(d)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    Metode koje fale da bi ova klasa bila kompatibilna sa TreeModel
//    @Override
//    public void valueForPathChanged(TreePath path, Object newValue) {}
//     @Override
//    public void addTreeModelListener(TreeModelListener l) {}
//    @Override
//    public void removeTreeModelListener(TreeModelListener l) {}
    //za testiranje
    public void ispisi(Cvor cvor) {
        if (cvor == null) {
            return;
        }
        System.out.println(cvor);
        for (Object obj : cvor.deca) {
            Cvor c = (Cvor) obj;
            ispisi(c);
        }

    }

    public void ispisi() {
        ispisi(koren);
    }

  
}
