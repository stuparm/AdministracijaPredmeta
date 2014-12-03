/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;


import domen.Predmet;
import domen.sadrzajpredmeta.TematskaJedinica;
import forme.GlavnaiForma;
import help.Stablo;
import java.util.ArrayList;
import java.util.List;
import paneli.DodatniPodaciStabloPanel;
import paneli.PredmetiPanel;
import paneli.modeli.PredmetiListModel;



/**
 *
 * @author Mihailo
 */
public class Test {
    
    public static void main(String[] args) {
        
       
        TematskaJedinica t11 = new TematskaJedinica("t11");
        TematskaJedinica t12 = new TematskaJedinica("t12");
        TematskaJedinica t111 = new TematskaJedinica("t111");
        TematskaJedinica t121 = new TematskaJedinica("t121");
        Stablo<TematskaJedinica> stablo = new Stablo<>();
        stablo.dodajCvor(t11, null);
        stablo.dodajCvor(t12, null);
        stablo.dodajCvor(t111, t11);
        stablo.dodajCvor(t121, t12);
        DodatniPodaciStabloPanel dpsp = new DodatniPodaciStabloPanel(stablo);
        
        List<Predmet> predmeti = new ArrayList<>();
        predmeti.add(new Predmet("OIKT"));
        predmeti.add(new Predmet("UIS"));
        predmeti.add(new Predmet("PS"));
        PredmetiListModel plm = new PredmetiListModel(predmeti);
        PredmetiPanel pp = new PredmetiPanel(plm);
        
        GlavnaiForma pf = new GlavnaiForma(pp,dpsp);
        pf.setVisible(true);
        
    }
    
    
}
