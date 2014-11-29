/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen.tematskeJedinice;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 *
 * @author Mihailo
 */
public class TematskeJedinice {
    
    private List<TematskaJedinica> koreni;
    
    public void dodajTematskuJedinicu(TematskaJedinica roditelj, SadrzajTemJdn sadrzaj) {
        if (roditelj == null) {
            TematskaJedinica tj = new TematskaJedinica(sadrzaj);
            sortiraj(koreni);
        }
        else {
            for (TematskaJedinica tj : koreni) {
                if (tj == roditelj) {
                    TematskaJedinica nova = new TematskaJedinica(roditelj, sadrzaj);
                    sortiraj(roditelj.getDeca());
                    break;
                }
            }
        }    
    }
    
    public void sortiraj(List<TematskaJedinica> listaJedinica) {
        Collections.sort(listaJedinica, new Comparator<TematskaJedinica>() {
            @Override
            public int compare(TematskaJedinica o1, TematskaJedinica o2) {
                return o1.compareTo(o2);
            }
        });
    }
    
    
    
    
}
