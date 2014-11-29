/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen.tematskeJedinice;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mihailo
 */
public class TematskaJedinica implements Comparable<TematskaJedinica>{
    
    private TematskaJedinica roditelj;
    private List<TematskaJedinica> deca;
    private SadrzajTemJdn sadrzaj;

    public TematskaJedinica(TematskaJedinica roditelj, SadrzajTemJdn sadrzaj) {
        this.roditelj = roditelj;
        roditelj.dodajPodJedinicu(this);
        this.deca = new LinkedList<>();
        this.sadrzaj = sadrzaj;
    }
    
    public TematskaJedinica(SadrzajTemJdn sadrzaj) {
        this.deca = new LinkedList<>();
        this.sadrzaj = sadrzaj;
    }
    
    
    
    private void dodajPodJedinicu(TematskaJedinica temJed) {
        deca.add(this);
    }

    @Override
    public int compareTo(TematskaJedinica tj) {
        if (tj == null)
            return -1;
        return sadrzaj.compareTo(tj.getSadrzaj());
    }

    public SadrzajTemJdn getSadrzaj() {
        return sadrzaj;
    }

    public List<TematskaJedinica> getDeca() {
        return deca;
    }
    
    
    
    
    
    
    
    
}
