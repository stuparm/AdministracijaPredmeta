/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;

/**
 *
 * @author Mihailo
 */
public class InfoPredmet implements Comparable<Object>{
    
    private String naziv;
    private String vrednost;
    private int prioritet;

    public InfoPredmet(String naziv, String vrednost, int prioritet) {
        this.naziv = naziv;
        this.vrednost = vrednost;
        this.prioritet = prioritet;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || !(o instanceof InfoPredmet))
            return 1;
        InfoPredmet ip = (InfoPredmet)o;
        return ip.prioritet-prioritet;
    }
    
    /*
    Index moze biti 0 ili 1
    */
    public String elementNaPoziciji(int index) {
        if (index > 1 || index < 0)
            throw new RuntimeException("Index je lose zadat");
        if (index == 0)
            return naziv;
        if (index == 1)
            return vrednost;
        return null;
    }
    
}
