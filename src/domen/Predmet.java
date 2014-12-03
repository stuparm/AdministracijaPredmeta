/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

import domen.fondcasova.FondCasova;
import domen.katedra.Katedra;
import domen.literatura.Literatura;
import domen.sadrzajpredmeta.SadrzajPredmeta;
import java.util.List;

/**
 *
 * @author Mihailo
 */
public class Predmet {
    
    private String naziv;
    private Katedra katedra;
    private int brojESPB;
    private String ciljPredmeta;
    private String ishodPredmeta;
    private SadrzajPredmeta sadrzajPredmeta;
    private Literatura literatura;
    private FondCasova fondCasova;
    private List<String> metodeNastave;

    public Predmet(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    
    
    
    
    
}
