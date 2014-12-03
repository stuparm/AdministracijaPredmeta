/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen.sadrzajpredmeta;

/**
 *
 * @author Mihailo
 */
public class TematskaJedinica {
    
    String naziv;
    String tekst;

    public TematskaJedinica(String naziv, String tekst) {
        this.naziv = naziv;
        this.tekst = tekst;
    }

    public TematskaJedinica(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof TematskaJedinica))
            return false;
        TematskaJedinica tj = (TematskaJedinica)obj;
        return naziv.equals(tj.naziv);
    }
    
    
    
}
