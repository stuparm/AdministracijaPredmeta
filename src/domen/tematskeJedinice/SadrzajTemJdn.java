/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen.tematskeJedinice;

/**
 *
 * @author Mihailo
 */
public class SadrzajTemJdn implements Comparable<SadrzajTemJdn>{
    
    private String naziv;
    private String dodatneInfo;

    public SadrzajTemJdn(String naziv, String dodatneInfo) {
        this.naziv = naziv;
        this.dodatneInfo = dodatneInfo;
    }

    public SadrzajTemJdn(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public int compareTo(SadrzajTemJdn stj) {
        if (stj == null)
            return -1;
        return naziv.compareToIgnoreCase(stj.getNaziv());
        
        
    }

    public String getNaziv() {
        return naziv;
    }
    
    
    
    
    
}
